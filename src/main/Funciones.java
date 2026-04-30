

package main;
import main.*;
import java.io.*;
import java.util.ArrayList;
import objetos.*;


public class Funciones {
    
    private ArrayList<Paciente> pacientes;
    private ArrayList<Doctor> doctores;
    private ArrayList<Farmaceuta> farmaceutas;
    private ArrayList<Receta> recetas;
    private ArrayList<Consulta> consultas;

    private static final String DIR_DATOS = "datos_hospital/";

    public  void SistemaHospital() {
        pacientes = new ArrayList<>();
        doctores = new ArrayList<>();
        farmaceutas = new ArrayList<>();
        recetas = new ArrayList<>();
        consultas = new ArrayList<>();
        
        File dir = new File(DIR_DATOS);
        if (!dir.exists()) {
            dir.mkdir();
            sembrarDatosBase();
        } else {
            cargarDatos();
            // Si por alguna razon el directorio existe pero los archivos no, revisamos e inicializamos pacients o medicos vacios
            if (pacientes.isEmpty() && doctores.isEmpty()) {
                sembrarDatosBase();
            }
        }
    }

    private void sembrarDatosBase() {
        // Cedulas numericas como solicito el usuario
        registrarPaciente(new Paciente("101", "Paciente Uno", 25));
        registrarPaciente(new Paciente("102", "Paciente Dos", 30));
        registrarPaciente(new Paciente("103", "Paciente Tres", 45));

        registrarDoctor(new Doctor("201", "Doctor Alfa", 50));
        registrarDoctor(new Doctor("202", "Doctor Beta", 40));

        registrarFarmaceuta(new Farmaceuta("301", "Farmaceuta Gama", 35));
    }

    public void cargarDatos() {
        cargarPacientes();
        cargarDoctores();
        cargarFarmaceutas();
        cargarRecetas();
        cargarConsultas();
    }

    public void guardarTodo() {
        guardarPacientes();
        guardarDoctores();
        guardarFarmaceutas();
        guardarRecetas();
        guardarConsultas();
    }

    // --- PACIENTES ---
    public void registrarPaciente(Paciente p) {
        pacientes.add(p);
        guardarPacientes();
    }
    public Paciente buscarPaciente(String cedula) {
        for (Paciente p : pacientes) {
            if (p.getCedula().equals(cedula)) return p;
        }
        return null;
    }
    private void guardarPacientes() {
        escribirArchivo(DIR_DATOS + "pacientes.txt", pacientes);
    }
    private void cargarPacientes() {
        ArrayList<String> lineas = leerArchivo(DIR_DATOS + "pacientes.txt");
        pacientes.clear();
        for (String linea : lineas) {
            String[] partes = linea.split(";");
            if(partes.length >= 3) {
                pacientes.add(new Paciente(partes[0], partes[1], Integer.parseInt(partes[2])));
            }
        }
    }

    // --- DOCTORES ---
    public void registrarDoctor(Doctor d) {
        doctores.add(d);
        guardarDoctores();
    }
    public Doctor buscarDoctor(String cedula) {
        for (Doctor d : doctores) {
            if (d.getCedula().equals(cedula)) return d;
        }
        return null;
    }
    private void guardarDoctores() {
        escribirArchivo(DIR_DATOS + "doctores.txt", doctores);
    }
    private void cargarDoctores() {
        ArrayList<String> lineas = leerArchivo(DIR_DATOS + "doctores.txt");
        doctores.clear();
        for (String linea : lineas) {
            String[] partes = linea.split(";");
            if(partes.length >= 3) {
                doctores.add(new Doctor(partes[0], partes[1], Integer.parseInt(partes[2])));
            }
        }
    }

    // --- FARMACEUTAS ---
    public void registrarFarmaceuta(Farmaceuta f) {
        farmaceutas.add(f);
        guardarFarmaceutas();
    }
    public Farmaceuta buscarFarmaceuta(String cedula) {
        for (Farmaceuta f : farmaceutas) {
            if (f.getCedula().equals(cedula)) return f;
        }
        return null;
    }
    private void guardarFarmaceutas() {
        escribirArchivo(DIR_DATOS + "farmaceutas.txt", farmaceutas);
    }
    private void cargarFarmaceutas() {
        ArrayList<String> lineas = leerArchivo(DIR_DATOS + "farmaceutas.txt");
        farmaceutas.clear();
        for (String linea : lineas) {
            String[] partes = linea.split(";");
            if(partes.length >= 3) {
                farmaceutas.add(new Farmaceuta(partes[0], partes[1], Integer.parseInt(partes[2])));
            }
        }
    }

    // --- RECETAS ---
    public void registrarReceta(Receta r) {
        recetas.add(r);
        guardarRecetas();
    }
    public ArrayList<Receta> obtenerRecetasPaciente(String cedula) {
        ArrayList<Receta> resultado = new ArrayList<>();
        for (Receta r : recetas) {
            if (r.getCedulaPaciente().equals(cedula)) {
                resultado.add(r);
            }
        }
        return resultado;
    }
    private void guardarRecetas() {
        escribirArchivo(DIR_DATOS + "recetas.txt", recetas);
    }
    private void cargarRecetas() {
        ArrayList<String> lineas = leerArchivo(DIR_DATOS + "recetas.txt");
        recetas.clear();
        for (String linea : lineas) {
            String[] partes = linea.split(";", -1); // -1 to keep empty trailing strings 
            if(partes.length >= 4) {
                recetas.add(new Receta(partes[0], partes[1], partes[2], partes[3]));
            }
        }
    }

    // --- CONSULTAS ---
    public void registrarConsulta(Consulta c) {
        consultas.add(c);
        guardarConsultas();
    }
    
    public void actualizarConsulta() {
        guardarConsultas();
    }
    
    public ArrayList<Consulta> obtenerConsultasPendientes() {
        ArrayList<Consulta> pendientes = new ArrayList<>();
        for (Consulta c : consultas) {
            if (!c.isCompletada()) pendientes.add(c);
        }
        return pendientes;
    }
    public ArrayList<Consulta> obtenerConsultasDoctor(String cedulaDoctor) {
        ArrayList<Consulta> delDoctor = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getCedulaDoctor().equals(cedulaDoctor)) delDoctor.add(c);
        }
        return delDoctor;
    }
    public ArrayList<Consulta> obtenerConsultasPaciente(String cedulaPaciente) {
        ArrayList<Consulta> delPaciente = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getCedulaPaciente().equals(cedulaPaciente)) delPaciente.add(c);
        }
        return delPaciente;
    }
    private void guardarConsultas() {
        escribirArchivo(DIR_DATOS + "consultas.txt", consultas);
    }
    private void cargarConsultas() {
        ArrayList<String> lineas = leerArchivo(DIR_DATOS + "consultas.txt");
        consultas.clear();
        for (String linea : lineas) {
            String[] partes = linea.split(";", -1);
            if(partes.length >= 6) {
                consultas.add(new Consulta(partes[0], partes[1], partes[2], partes[3], partes[4], Boolean.parseBoolean(partes[5])));
            }
        }
    }

    // --- UTILIDADES DE ARCHIVO ---
    private <T extends Persona> void escribirArchivo(String ruta, ArrayList<? extends Object> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            for (Object obj : lista) {
                if (obj instanceof Persona) pw.println(((Persona)obj).toLineaTexto());
                else if (obj instanceof Receta) pw.println(((Receta)obj).toLineaTexto());
                else if (obj instanceof Consulta) pw.println(((Consulta)obj).toLineaTexto());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<String> leerArchivo(String ruta) {
        ArrayList<String> lineas = new ArrayList<>();
        File file = new File(ruta);
        if(!file.exists()) return lineas;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lineas.add(linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }
    
    // Metodos generales getters
    public ArrayList<Paciente> getPacientes() { return pacientes; }
    public ArrayList<Doctor> getDoctores() { return doctores; }
    public ArrayList<Farmaceuta> getFarmaceutas() { return farmaceutas; }


}







    

