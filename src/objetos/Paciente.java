


package objetos;

import objetos.Persona;


public class Paciente extends Persona {
    public Paciente(String cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toLineaTexto() {
        return cedula + ";" + nombre + ";" + edad;
    }
}

