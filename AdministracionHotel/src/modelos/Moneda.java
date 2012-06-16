/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Fam Herrera
 */
public class Moneda {
    String TipoMoneda;
    String nombreMoneda;

    public Moneda(String TipoMoneda, String nombreMoneda) {
        this.TipoMoneda = TipoMoneda;
        this.nombreMoneda = nombreMoneda;
    }

    public String getTipoMonedad() {
        return TipoMoneda;
    }

    public void setTipoMoneda(String TipoMoneda) {
        this.TipoMoneda = TipoMoneda;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }
    
}
