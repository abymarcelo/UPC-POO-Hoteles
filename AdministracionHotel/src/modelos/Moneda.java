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
    private int cod_moneda;
    private int tip_moneda;
    private String nom_moneda;

    public int getCod_moneda() {
        return cod_moneda;
    }

    public void setCod_moneda(int cod_moneda) {
        this.cod_moneda = cod_moneda;
    }

    public String getNom_moneda() {
        return nom_moneda;
    }

    public void setNom_moneda(String nom_moneda) {
        this.nom_moneda = nom_moneda;
    }

    public int getTip_moneda() {
        return tip_moneda;
    }

    public void setTip_moneda(int tip_moneda) {
        this.tip_moneda = tip_moneda;
    }

    public Moneda(int cod_moneda, int tip_moneda, String nom_moneda) {
        this.cod_moneda = cod_moneda;
        this.tip_moneda = tip_moneda;
        this.nom_moneda = nom_moneda;
    }
    
    
}
