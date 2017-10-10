/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compañiadesoftware;

/**
 *
 * @author Estudiante
 */
public class Consultor extends Contrato {
    private String labor;
    
    public Consultor(int id, String labor) {
        super(id);
        this.labor = labor;
    }
    
    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    
    @Override
    public double calcularSalario(){
        return(220);
    }

    
    
}
