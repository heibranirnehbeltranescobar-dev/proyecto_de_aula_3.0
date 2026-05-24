package objetos;

import objetos.Persona;

public class Doctor extends Persona {
    String tipo;

    public Doctor(String tipo, String cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
       return tipo + ";" + cedula + ";" + nombre + ";" + edad;
    }
}
