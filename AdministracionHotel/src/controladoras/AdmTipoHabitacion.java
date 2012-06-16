/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.TipoHabitacion;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Fam Herrera
 */
public class AdmTipoHabitacion {


    private static class CuentaException extends Exception {

        public CuentaException() {
        }
    }
    private ArrayList<TipoHabitacion> tipohabitacion; 
   
   public AdmTipoHabitacion() {
        // Crear la coleccion de objetos GenerarCuenta
        
        tipohabitacion = new ArrayList<TipoHabitacion>();
   }
         private String validarDatosIncompletosTipoHabitacion(String tipoHabitacion,double precioHabitacion, String tipoMoneda)
            throws AdmTipoHabitacion.CuentaException {
     String msg = "OK";
    
        return msg;
    }
   
    public void registrarTipoHabitacion(String tipoHabitacion,double precioHabitacion, String tipoMoneda)
            throws AdmTipoHabitacion.CuentaException {
        // Aplicar validaciones de negocio
        String mensaje;
        mensaje = validarDatosIncompletosTipoHabitacion(tipoHabitacion, precioHabitacion,tipoMoneda);
        System.out.println("\nIngreso los Datos Correctos -->"+mensaje);
            if(mensaje.equals("OK"))
            {
                tipohabitacion.add(new TipoHabitacion( tipoHabitacion, precioHabitacion,tipoMoneda));
            }
       }
           
     public TipoHabitacion buscar(String tipoHabitacion) {
        for (Iterator<TipoHabitacion> it = tipohabitacion.iterator(); it.hasNext();) {
            TipoHabitacion tipohabitaciones = it.next();
            if (tipohabitaciones.getTipoHabitacion().equals(tipohabitacion))
               return tipohabitaciones;
        }
        return null;
    
   }
     public ArrayList<TipoHabitacion> getTipoHabitacion() {
        return tipohabitacion;
}
}