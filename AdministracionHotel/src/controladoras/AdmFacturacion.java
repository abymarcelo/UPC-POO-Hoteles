/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import controladoras.CuentaException;
import modelos.Facturacion;
import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class AdmFacturacion {
    
   private ArrayList<Facturacion> facturacion; 
   
   public AdmFacturacion() {
        // Crear la coleccion de objetos GenerarCuenta
        
        facturacion = new ArrayList<Facturacion>();
   }
    
   private String validarDatosIncompletosReserva(int codReserva, int FechaLlegada, int FechaSalida, int Dias, double Total)
            throws CuentaException {
        String msg = "OK";
        
        if (codReserva==0)
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
   
    public void registrarFacturacion(int codHabitacion, int fechaLlegada, int fechaSalida, int dias, double precioXnoche, double descuento, double total, int cantidad)
            throws CuentaException {
        // Aplicar validaciones de negocio
        String mensaje;
        mensaje = validarDatosIncompletosReserva(codHabitacion, fechaLlegada, fechaSalida, dias, total);
        System.out.println("\nIngreso los Datos Correctos -->"+mensaje);
            if(mensaje.equals("OK"))
            {
                facturacion.add(new Facturacion(precioXnoche,cantidad,descuento,codHabitacion, fechaLlegada, fechaSalida, dias,total));
            }
       }
           
    
    
     public Facturacion buscar(int codReserva) {
        // Buscar el tipo de habitacion por codigo
        for(Facturacion facturacions : facturacion)
            if (facturacions.getCodigoReserva()==codReserva)
               return facturacions;
        return null;
    }
     
     
   public ArrayList<Facturacion> getFacturacion() {
        return facturacion;
    }
   	     
    
}
