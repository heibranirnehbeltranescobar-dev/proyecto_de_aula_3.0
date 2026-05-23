/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author YARITZA
 */
public class medicamento {
    String nombreMedicamento;
    String cantMedicamento;

    public medicamento(String nombreMedicamento, String cantMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
        this.cantMedicamento = cantMedicamento;
    }
    

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getCantMedicamento() {
        return cantMedicamento;
    }

    public void setCantMedicamento(String cantMedicamento) {
        this.cantMedicamento = cantMedicamento;
    }
    
}
