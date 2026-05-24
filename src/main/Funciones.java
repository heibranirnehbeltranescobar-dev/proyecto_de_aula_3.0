

package main;
import main.*;
import java.io.*;
import java.util.ArrayList;
import objetos.*;


public class Funciones {
    
     ArrayList<Paciente> pacientes = new ArrayList<>();
     ArrayList<Doctor> doctores = new ArrayList<>();
     ArrayList<Farmaceuta> farmaceutas = new ArrayList<>();
     ArrayList<Receta> recetas = new ArrayList<>();
     ArrayList<Consulta> consultas = new ArrayList<>();
     ArrayList<medicamento> medicamentos = new ArrayList<>();
     

    private static final String DIR_DATOS = "datos_hospital/";

    public  void SistemaHospital() {
        
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
 
        registrarPaciente(new Paciente("1012020321", "juan pertuz", 25));
        registrarPaciente(new Paciente("102927342", "manolo melano", 30));
        registrarPaciente(new Paciente("103153756", "kateryn trusova", 45));

        registrarDoctor(new Doctor("general","2014223", "julian carpenter", 50));
        registrarDoctor(new Doctor("dermatologo","20212343", "cylen dawn", 40));

        registrarFarmaceuta(new Farmaceuta("30112334", "maria maximilian", 35));
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
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente p = null;
            if (pacientes.get(i).getCedula().equals(cedula)) 
                p=pacientes.get(i);
            return p;
        }
        
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
                doctores.add(new Doctor(partes[0],partes[1], partes[2], Integer.parseInt(partes[3])));
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
                recetas.add(new Receta(partes[0], partes[1], partes[2], partes[3],Integer.parseInt(partes[4]), partes[5],Integer.parseInt(partes[6]),partes[7],Integer.parseInt(partes[8])));
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
                consultas.add(new Consulta(partes[0], partes[1], partes[2], partes[3], partes[4],partes[5], Boolean.parseBoolean(partes[6])));
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
                else if (obj instanceof medicamento) pw.println(((medicamento)obj).getNombreMedicamento() + ";" + ((medicamento)obj).getCantMedicamento());
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
    
    //---inventario medicamento
     public void registrarMedicamento(medicamento M) {
        medicamentos.add(M);
        guardarMedicamento();
    }
    private void guardarMedicamento() {
        escribirArchivo(DIR_DATOS + "Medicamento.txt", medicamentos);
    }
    
    
    // Metodos generales getters
    public ArrayList<Paciente> getPacientes() { return pacientes; }
    public ArrayList<Doctor> getDoctores() { return doctores; }
    public ArrayList<Farmaceuta> getFarmaceutas() { return farmaceutas; }
    public ArrayList<Receta> getRecetas() {return recetas;}
    public ArrayList<medicamento> getMedicamentos() {return medicamentos;}

}







    

