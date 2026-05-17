package objetos;

public class Receta {
    private String idReceta;
    private String cedulaPaciente;
    private String nombreDoctor;
    private String NombreMedicamentos;

    public Receta(String idReceta, String cedulaPaciente, String nombreDoctor, String NombreMedicamentos) {
        this.idReceta = idReceta;
        this.cedulaPaciente = cedulaPaciente;
        this.nombreDoctor = nombreDoctor;
        this.NombreMedicamentos = NombreMedicamentos;
    }

    public String getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(String idReceta) {
        this.idReceta = idReceta;
    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getNombreMedicamentos() {
        return NombreMedicamentos;
    }

    public void setNombreMedicamentos(String NombreMedicamentos) {
        this.NombreMedicamentos = NombreMedicamentos;
    }

    
    
    public String toLineaTexto() {
        return idReceta + ";" + cedulaPaciente + ";" + nombreDoctor + ";" + NombreMedicamentos;
    }
}
