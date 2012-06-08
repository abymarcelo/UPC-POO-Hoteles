/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import controladoras.CuentaException;
import modelos.Hotel;
import java.util.ArrayList;
import modelos.Hotel;

public class AdmHotel {

    
   private ArrayList<Hotel> hotel; 
   
   public AdmHotel() {
        // Crear la coleccion de objetos GenerarCuenta
        
        hotel = new ArrayList<Hotel>();
   }
    
   private String validarDatosIncompletosHotel(int codHotel, String nombreHotel, String direccion, int cantidadHabitacion)
            throws CuentaException {
        String msg = "OK";
        String search="clerk.im";
        
        if (codHotel==0)
        {
            msg = "\nDebeIngresar el Codigo del Hotel";
        }
        
        if (nombreHotel.isEmpty())
        {
            msg = "\nDebe ingresar nombre del Hotel";
        }
        if (direccion.isEmpty())
        {
            msg ="\nDebe Ingresar Direccion del Hotel";
        }
        
        if (cantidadHabitacion == 0 )
        {
            msg ="\nDebe Ingresar un numero de habitaciones validos";
        }
       /*
        String sTexto = direccion;
	String sTextoBuscado = "clerk.im";
	int contador = 0;
	while (sTexto.indexOf(sTextoBuscado) > -1) {
               sTexto = sTexto.substring(sTexto.indexOf(
               sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
	contador++; 
        }
        if (contador==1)
        {
            msg="OK";
        }
        if(direccion.substring(-8).equals(search))
        {
            msg ="OK";
        }
        * 
        */
        return msg;
    }
   
    public void registrarHotel(int codHotel, String nombreHotel, String direccion, int cantidadHabitacion)
            throws CuentaException {
        // Aplicar validaciones de negocio
        String mensaje;
        mensaje = validarDatosIncompletosHotel(codHotel,nombreHotel,direccion,cantidadHabitacion);
        System.out.println("\nIngreso los Datos Correctos -->"+mensaje);
            if(mensaje.equals("OK"))
            {
                hotel.add(new Hotel(codHotel, nombreHotel, direccion,cantidadHabitacion));
            }
       }
           
     public Hotel buscar(int codHotel) {
        // Buscar el tipo de habitacion por codigo
        for(Hotel hotels : hotel)
            if (hotels.getCodigoHotel()==codHotel)
               return hotels;
        return null;
    }
     
     
   public ArrayList<Hotel> getHotel() {
        return hotel;
    }
   		

	

}
