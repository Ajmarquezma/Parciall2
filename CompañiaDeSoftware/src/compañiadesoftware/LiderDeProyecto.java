/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compañiadesoftware;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class LiderDeProyecto extends Programador {
        private ArrayList<Programador> programadores;

    public LiderDeProyecto(String nombre, double salario, int id, String lenguaje) {
        super(nombre, salario, id, lenguaje);
        this.programadores= new ArrayList<>();
    }
    
    @Override
    public double calcularSalario(){
        return this.salario + (this.salario*0.1*this.programadores.size());
    }
    
    public boolean addProgramador(Programador programador){
        if(this.programadores.add(programador))
            return true;
        else return false;
    }
    
    @Override
    public String toString(){
        String aux = "";
        aux+=Super.toString() + "a Cargo de ";
        for(Programador programador)
    }
    
}
