/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import controladoras.AdmHotel;
import controladoras.CuentaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Hotel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fam Herrera
 */
public class AdmHotelTest {
    
    @Test
    public void RegistrarHotel(){
        
        int     codHotel           =5 ;
        String  nombreHotel        = "Melody1";
        String  direccion          = "Lima 515";
        int     cantidadHabitacion = 1;
        boolean marca;
        
        AdmHotel hotel = new AdmHotel();
        marca          = true;
        
        try {
            if(marca==true){
                 System.out.print("llego aqui");
                hotel.registrarHotel(codHotel, nombreHotel, direccion,cantidadHabitacion);
               
            }
        } catch (CuentaException ex) {
            Logger.getLogger(AdmHotelTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Hotel hotels = hotel.buscar(codHotel);
        
        System.out.print("\nCodigo Hotel        :" + hotels.getCodigoHotel());
        System.out.print("\nNombre Hotel        :" + hotels.getNombreHotel());
        System.out.print("\nDireccion           :" + hotels.getDireccion());
        System.out.print("\nCantidad Habitacion :" + hotels.getCantidadHabitacion()); 
    }

}