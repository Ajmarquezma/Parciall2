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
public class CompañiaDeSoftwareBaseDeDatos {
    private String nombre;
    private ArrayList<Contrato> contratos;

    public CompañiaDeSoftwareBaseDeDatos(String nombre, ArrayList<Contrato> contratos) {
        this.nombre = nombre;
        this.contratos = contratos;
    }
    
    public boolean addContrato(Contrato contrato){
        return this.contratos.add(contrato);
    }
    
    public double calcularNomina(){
        double totalNomina = 0;
        for (Contrato contrato : contratos){
            totalNomina += contrato.calcularSalario();
        }
        return totalNomina;
    }
    
    public String listarInformacion(){
        String aux = "";
        for(Contrato contrato : contratos){
            aux+=contrato.toString();
        }
        return aux;
    }
    
    public ArrayList<Contrato> reportarNomina(){
        return this.contratos;
    }
    
}
