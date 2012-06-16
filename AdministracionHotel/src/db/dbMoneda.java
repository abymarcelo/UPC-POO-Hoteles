/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import modelos.Moneda;
import java.util.ArrayList;

/**
 *
 * @author Latyz
 */
public class dbMoneda {
     public ArrayList simulaDataMoneda(){
        ArrayList<Moneda> monedas = new ArrayList<Moneda>();
        Moneda tipohabitacion1 = new Moneda("PEN","Soles");
        Moneda tipohabitacion2 = new Moneda("USS","Dolar");
        Moneda tipohabitacion3 = new Moneda( "EUR","Euro");
        monedas.add(tipohabitacion1);
        monedas.add(tipohabitacion2);
        monedas.add(tipohabitacion3);
        return monedas;
    }
    
}
