package objetos;

public class Receta {
    private String idReceta;
    private String cedulaPaciente;
    private String nombreDoctor;
    private String listaMedicamentos;

    public Receta(String idReceta, String cedulaPaciente, String nombreDoctor, String listaMedicamentos) {
        this.idReceta = idReceta;
        this.cedulaPaciente = cedulaPaciente;
        this.nombreDoctor = nombreDoctor;
        this.listaMedicamentos = listaMedicamentos;
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

    public String getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(String listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    

    public String toLineaTexto() {
        return idReceta + ";" + cedulaPaciente + ";" + nombreDoctor + ";" + listaMedicamentos;
    }
}
