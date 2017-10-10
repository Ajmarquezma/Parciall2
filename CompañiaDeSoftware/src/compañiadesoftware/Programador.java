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
public class Programador extends Empleado {
    protected String lenguaje;
    public Programador(String nombre, double salario, int id, String lenguaje) {
        super(nombre, salario, id);
        this.lenguaje = lenguaje;
    }

    @Override
    double calcularSalario() {
        if(this.lenguaje.equals("java")){
            return(this.salario + (this.salario*0.2));         
        }else
            return this.salario;
    }
    
}
