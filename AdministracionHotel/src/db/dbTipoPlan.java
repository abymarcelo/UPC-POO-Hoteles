/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.TipoPlan;

/**
 *
 * @author Kenshin2
 */
public class dbTipoPlan {
    public ArrayList simulaTipoPlan(){
        ArrayList<TipoPlan> tipos = new ArrayList<TipoPlan>();
        TipoPlan tipo1 = new TipoPlan("Clerk Gratis","∞","∞","∞",70,0.0);
        TipoPlan tipo2 = new TipoPlan("Clerk Basic","∞","∞","∞",150,39.0);
        TipoPlan tipo3 = new TipoPlan("Clerk Plus","∞","∞","∞",260,64.0);
        TipoPlan tipo4 = new TipoPlan("Clerk Full","∞","∞","∞",1000,99.0);
        tipos.add(tipo1);
        tipos.add(tipo2);
        tipos.add(tipo3);
        tipos.add(tipo4);
        return tipos;
    }
}
