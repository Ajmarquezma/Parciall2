/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class FincaRaiz {
    private ArrayList<Persona> personas;
    private ArrayList<Inmueble> inmuebles;

    public FincaRaiz() {
        this.personas = new ArrayList<>();
        this.inmuebles = new ArrayList<>();
    }
    
    

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
    
    
    
}
