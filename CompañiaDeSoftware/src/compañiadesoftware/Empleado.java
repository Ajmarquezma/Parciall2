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
public abstract class Empleado extends Contrato {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario, int id) {
        super(id);
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public String getNombre(){
        return nombre;
    }
    
}
