/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import java.util.Iterator;
import modelos.Habitacion;

/**
 *
 * @author Fam Herrera
 */
public class AdmHabitacion {
private String nombreHabitacion;

    private static class CuentaException extends Exception {

        public CuentaException() {
        }
    }
    private ArrayList<Habitacion> habitacion; 
   
   public AdmHabitacion() {
        // Crear la coleccion de objetos GenerarCuenta
        
        habitacion = new ArrayList<Habitacion>();
   }
         private String validarDatosIncompletosHabitacion(String nombreHotel,String nombreHabitacion, String tipoHabitacion, String estadoHabitacion)
            throws AdmHabitacion.CuentaException {
     String msg = "OK";
    
        return msg;
    }
   
    public void registrarHabitacion(String nombreHotel,String nombreHabitacion, String tipoHabitacion, String estadoHabitacion)
            throws AdmHabitacion.CuentaException {
        // Aplicar validaciones de negocio
        String mensaje;
        mensaje = validarDatosIncompletosHabitacion(nombreHotel, nombreHabitacion,tipoHabitacion,estadoHabitacion);
        System.out.println("\nIngreso los Datos Correctos -->"+mensaje);
            if(mensaje.equals("OK"))
            {
                habitacion.add(new Habitacion( nombreHotel, nombreHabitacion,tipoHabitacion,estadoHabitacion));
            }
       }
           
     public Habitacion buscar(String nombredHabitacion) {
        for (Iterator<Habitacion> it = habitacion.iterator(); it.hasNext();) {
            Habitacion habitaciones = it.next();
            if (habitaciones.getNombreHabitacion().equals(nombreHabitacion))
               return habitaciones;
        }
        return null;
    
   }
     public ArrayList<Habitacion> getHabitacion() {
        return habitacion;
}
}