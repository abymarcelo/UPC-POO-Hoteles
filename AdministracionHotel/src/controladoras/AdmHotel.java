/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Hotel;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Fam Herrera
 */
public class AdmHotel {
    private String nombreHotel;

    private static class CuentaException extends Exception {

        public CuentaException() {
        }
    }
    private ArrayList<Hotel> hotel; 
   
   public AdmHotel() {
        // Crear la coleccion de objetos GenerarCuenta
        
        hotel = new ArrayList<Hotel>();
   }
         private String validarDatosIncompletosHotel(String nombreHotel, int cantidadHabitacion)
            throws CuentaException {
     String msg = "OK";
      
        if (nombreHotel.isEmpty())
        {
            msg = "\nDebe ingresar nombre del Hotel";
        }
  
        if (cantidadHabitacion == 0 )
        {
            msg ="\nDebe Ingresar un numero de habitaciones validos";
        }
    
        return msg;
    }
   
    public void registrarHotel(String nombreHotel, int cantidadHabitacion)
            throws CuentaException {
        // Aplicar validaciones de negocio
        String mensaje;
        mensaje = validarDatosIncompletosHotel(nombreHotel,cantidadHabitacion);
        System.out.println("\nIngreso los Datos Correctos -->"+mensaje);
            if(mensaje.equals("OK"))
            {
                hotel.add(new Hotel( nombreHotel,cantidadHabitacion));
            }
       }
           
     public Hotel buscar(String nombredHotel) {
        for (Iterator<Hotel> it = hotel.iterator(); it.hasNext();) {
            Hotel hotels = it.next();
            if (hotels.getNombreHotel().equals(nombreHotel))
               return hotels;
        }
        return null;
    
   }
     
}
