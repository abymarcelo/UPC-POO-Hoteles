/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Moneda;
import java.util.ArrayList;

/**
 *
 * @author Fam Herrera
 */
public class AdmMoneda {
   private ArrayList<Moneda> monedas;

    public AdmMoneda() {
        monedas = new ArrayList<Moneda>();
    }

    public ArrayList<Moneda> getMoneda() {
        return monedas;
    }
    
    /*
      private int cod_moneda;
    private int tip_moneda;
    private String nom_moneda;
     */
    public void registrarMoneda(int cod_moneda,int tip_moneda,String nom_moneda){
        String mensaje="";
        mensaje = buscarMoneda(cod_moneda);
        if (mensaje.equals("")){
            Moneda monedas1 = new Moneda(cod_moneda, tip_moneda, nom_moneda);
            monedas.add(monedas1);
           }
    }
  
    public String buscarMoneda(int cod_moneda)throws RuntimeException{
        String mensaje="";
        for(Moneda moneda:monedas){
            if(moneda.getCod_moneda()==cod_moneda)
                mensaje = "\nTipo de Habitacion ya registrado";
                }
                return mensaje;
        } 
    
     public Moneda buscoMonedas(int codigo) {
        // Buscar el tipo de habitacion por codigo
        for(Moneda moneda : monedas)
            if (moneda.getCod_moneda()==codigo)
                return moneda;
             return null;
      }
    }

