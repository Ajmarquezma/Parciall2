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
public abstract class Contrato {
    protected int id;
    
    
    public Contrato(int id){
        this.id= id;
    }
    
    abstract double calcularSalario();

 
    
    
    
    
}
