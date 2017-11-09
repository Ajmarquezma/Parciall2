/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Edificio extends Inmueble{
    private String propietario;
    private ArrayList<Piso> pisos;
    private ArrayList<Local> locales;

    public Edificio(String propietario, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.propietario = propietario;
        this.pisos = new ArrayList<>();
        this.locales = new ArrayList<>();
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    public ArrayList<Local> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<Local> locales) {
        this.locales = locales;
    }
    
    public void addPiso(int numOficinas, int area, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida){
        Piso piso = new Piso(numOficinas, area, nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.pisos.add(piso);
        
    }
    
    public void addLocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida){
        LocalComercial local = new LocalComercial(descripcion, viaPrincipal, nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.locales.add(local);
    }
     public void addOficina(String tipo, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida){
        Oficina oficina = new Oficina(tipo, nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.locales.add(oficina);
    }
    
    
    @Override
    public String darInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
