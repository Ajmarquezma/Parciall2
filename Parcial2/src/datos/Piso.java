/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Piso extends Inmueble {

    public Piso(int numOficinas, int area, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.numOficinas = numOficinas;
        this.area = area;
        this.oficinas = new ArrayList<>();
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    private int numOficinas;
    private int area;
    private ArrayList<Oficina> oficinas;

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }
    
    public void addOficinas(String tipo, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida){
        Oficina oficina = new Oficina(tipo, nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.oficinas.add(oficina);
        this.numOficinas++;
    }
    

    @Override
    public String darInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
