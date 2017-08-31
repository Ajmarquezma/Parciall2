/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacióncomposición;

/**
 *
 * @author Estudiante
 */
public class Facultad {
    private String nombre;
    private Estudiante estudiante;
    private Hashmap<Integer,Estudiante>
                            estudiantes;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.estudiantes=
                new Hashmap<>();
    }
    
    public void addEstudiante(Estudiajnte estudiante){
        this.estudiantes.put(estudiante.getCodigo(),
                             estudiante); 
    }
    
    
    
    
}
