
package modelos;

import controladoras.AdmHotel;


public class HotelTest {

       public void RegistrarHotel(){
        
         String  nombreHotel        = "Melody1";
         int     cantidadHabitacion = 1;
        
       
        AdmHotel hotel = new AdmHotel();
 
        
//        try {
//            
//                 System.out.print("llego aqui");
//                hotel.registrarHotel(nombreHotel, cantidadHabitacion);
//               
//        
//        } 
//        catch (CuentaException ex) {
//            Logger.getLogger(AdmHotelTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        Hotel hotels = hotel.buscar(nombreHotel);
        
        
        System.out.print("\nNombre Hotel        :" + hotels.getNombreHotel());
        System.out.print("\nCantidad Habitacion :" + hotels.getCantidadHabitacion()); 
    }
}