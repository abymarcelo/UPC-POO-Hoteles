/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Moneda;
import modelos.TipoHabitacion;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Fam Herrera
 */
public class AdmMoneda {
  


    private static class CuentaException extends Exception {

        public CuentaException() {
        }
    }
    private ArrayList<Moneda> moneda; 
   
   public AdmMoneda() {
        // Crear la coleccion de objetos GenerarCuenta
        
        moneda = new ArrayList<Moneda>();
   }
         private String validarDatosIncompletosMoneda(String TipoMoneda, String nombreMoneda)
            throws AdmMoneda.CuentaException {
     String msg = "OK";
    
        return msg;
    }
   
    public void registrarMoneda(String TipoMoneda, String nombreMoneda)
            throws AdmMoneda.CuentaException {
        // Aplicar validaciones de negocio
        String mensaje;
        mensaje = validarDatosIncompletosMoneda(TipoMoneda,nombreMoneda);
        System.out.println("\nIngreso los Datos Correctos -->"+mensaje);
            if(mensaje.equals("OK"))
            {
                moneda.add(new Moneda( TipoMoneda,nombreMoneda));
            }
       }
           
  /*   public Moneda buscar(String TipoMoneda) {
        for (Iterator<Moneda> it = monedas.iterator(); it.hasNext();) {
            Moneda monedas = it.next();
            if (monedas.getMoneda().equals(TipoMoneda))
               return monedas;
        }
        return null;
    
   }*/
     public ArrayList<Moneda> getMoneda() {
        return moneda;
}
}