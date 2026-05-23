package objetos;

public class Receta {
     String idReceta;
     String cedulaPaciente;
     String nombreDoctor;
     String medicamento1;
     int cantMedicamento1;
     String medicamento2;
     int cantMedicamento2;
     String medicamento3;
     int cantMedicamento3;

    public Receta(String idReceta, String cedulaPaciente, String nombreDoctor, String medicamento1, int cantMedicamento1, String medicamento2, String medicamento3) {
        this.idReceta = idReceta;
        this.cedulaPaciente = cedulaPaciente;
        this.nombreDoctor = nombreDoctor;
        this.medicamento1 = medicamento1;
        this.cantMedicamento1 = cantMedicamento1;
        this.medicamento2 = medicamento2;
        this.medicamento3 = medicamento3;
    }

    public Receta(String parte, String parte0, String parte1, String parte2, int parseInt, String parte3, int parseInt0, String parte4, int parseInt1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public String getMedicamento1() {
        return medicamento1;
    }

    public void setMedicamento1(String medicamento1) {
        this.medicamento1 = medicamento1;
    }

    public int getCantMedicamento1() {
        return cantMedicamento1;
    }

    public void setCantMedicamento1(int cantMedicamento1) {
        this.cantMedicamento1 = cantMedicamento1;
    }

    public String getMedicamento2() {
        return medicamento2;
    }

    public void setMedicamento2(String medicamento2) {
        this.medicamento2 = medicamento2;
    }

    public String getMedicamento3() {
        return medicamento3;
    }

    public void setMedicamento3(String medicamento3) {
        this.medicamento3 = medicamento3;
    }

    public int getCantMedicamento2() {
        return cantMedicamento2;
    }

    public void setCantMedicamento2(int cantMedicamento2) {
        this.cantMedicamento2 = cantMedicamento2;
    }

    public int getCantMedicamento3() {
        return cantMedicamento3;
    }

    public void setCantMedicamento3(int cantMedicamento3) {
        this.cantMedicamento3 = cantMedicamento3;
    }
     
    
    
    
    
    public String toLineaTexto() {
        return idReceta + ";" + cedulaPaciente + ";" + nombreDoctor + ";" + medicamento1+";"+cantMedicamento1+ ";" + medicamento2+";"+cantMedicamento2+ ";" + medicamento3+";"+cantMedicamento3;
    }
}
