/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Estudiante
 */
public class LocalComercial extends Local {
    private String descripcion;
    private boolean viaPrincipal;

    public LocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.descripcion = descripcion;
        this.viaPrincipal = viaPrincipal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isViaPrincipal() {
        return viaPrincipal;
    }

    public void setViaPrincipal(boolean viaPrincipal) {
        this.viaPrincipal = viaPrincipal;
    }
    
    
    
    @Override
    public String darInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
