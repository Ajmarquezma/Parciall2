/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploempresa;

/**
 *
 * @author Estudiante
 */
public class Departamento {
    private String nombre;
    private Empleado[] empleados;
    private Empleado director;
    private Empleado revisor;
    private int numEmpleados;
    
    public Departamento(String nombre){
        this.nombre = nombre;
        this.empleados = new Empleado[20];
        this.numEmpleados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}






