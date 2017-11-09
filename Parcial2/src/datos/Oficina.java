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
public class Oficina extends Local {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public Oficina(String tipo, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.tipo = tipo;
    }
    

    @Override
    public String darInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
