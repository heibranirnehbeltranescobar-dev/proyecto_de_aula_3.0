package objetos;

public class Consulta {
    private String idConsulta;
    private String cedulaPaciente;
    private String nombrePaciente;
    private String cedulaDoctor;
    private String nombreDoctor;
    private boolean completada;

    public Consulta(String idConsulta, String cedulaPaciente, String nombrePaciente, String cedulaDoctor, String nombreDoctor, boolean completada) {
        this.idConsulta = idConsulta;
        this.cedulaPaciente = cedulaPaciente;
        this.nombrePaciente = nombrePaciente;
        this.cedulaDoctor = cedulaDoctor;
        this.nombreDoctor = nombreDoctor;
        this.completada = completada;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getCedulaDoctor() {
        return cedulaDoctor;
    }

    public void setCedulaDoctor(String cedulaDoctor) {
        this.cedulaDoctor = cedulaDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    
    
    public String toLineaTexto() {
        return idConsulta + ";" + cedulaPaciente + ";" + nombrePaciente + ";" + cedulaDoctor + ";" + nombreDoctor + ";" + completada;
    }
}
