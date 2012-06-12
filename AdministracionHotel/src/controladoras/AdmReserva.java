/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Reserva;

/**
 *
 * @author Manuel
 */
public class AdmReserva {
    
       private ArrayList<Reserva> reserva; 
   
   public AdmReserva() {
        // Crear la coleccion de objetos GenerarCuenta
        
        reserva = new ArrayList<Reserva>();
   }
    
   private String validarDatosIncompletosReserva(int codHabitacion, int FechaLlegada, int FechaSalida, int Dias, double Total)
            throws CuentaException {
        String msg = "OK";
        
        if (codHabitacion==0)
        {
            msg = "\nDebeIngresar el Codigo de la reserva";
        }
        
        if (FechaLlegada==0)
        {
            msg = "\nDebe ingresar la fecha de Ingreso";
        }
        if (FechaSalida==0)
        {
            msg ="\nDebe Ingresar la fecha de salida";
        }
        
        if (Dias == 0 )
        {
            msg ="\nDebe Ingresar la cantidad de dias";
        }
       
        if (Total == 0 )
        {
            msg ="\nDebe Ingresar el Total";
        }
       
        return msg;
    }
   
    public void registrarReserva(int codHabitacion, int fechaLlegada, int fechaSalida, int dias, double total)
            throws CuentaException {
        // Aplicar validaciones de negocio
        String mensaje;
        mensaje = validarDatosIncompletosReserva(codHabitacion, fechaLlegada, fechaSalida, dias, total);
        System.out.println("\nIngreso los Datos Correctos -->"+mensaje);
            if(mensaje.equals("OK"))
            {
                reserva.add(new Reserva(codHabitacion, fechaLlegada, fechaSalida, dias, total));
            }
       }
           
    
    
    
     public Reserva buscar(int codReserva) {
        // Buscar el tipo de habitacion por codigo
        for(Reserva reservas : reserva)
            if (reservas.getNumeroReserva()==codReserva)
               return reservas;
        return null;
    }
     
     
   public ArrayList<Reserva> getReserva() {
        return reserva;
    }
   	
}
