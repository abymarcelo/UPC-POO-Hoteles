/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import com.sun.org.apache.xpath.internal.operations.Equals;import controladoras.AdmHotel;
import controladoras.CuentaException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    //public static void RegistrarHotel() throws IOException{
             public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int     codHotel           = 2;
        String  nombreHotel        = "Melody1";
        String  direccion          = "Lima 515";
     //  int     cantidadHabitacion = 5;
        int cantidadHabitacion;
        int sumaHabitaciones = 0;
        String msg = "Se agrego con Exito la nueva habitacion de nombre :";
        String nombrehabitacion = null;
        String tipoHabitacion = null;
        
       boolean marca;
        
       AdmHotel hotel = new AdmHotel();
       marca          = true;
        
        try {
            if(marca==true){
                 
               System.out.println("¿Cuantas Habitaciones tiene su Hotel?");
            cantidadHabitacion = Integer.parseInt(in.readLine());
             if (cantidadHabitacion == 0)
              System.out.println("Debe ingresar un numero de Habitacion valido" );      
            for (int i = 1; i <= cantidadHabitacion; i++) {
                System.out.println("\n\nIngese Nombre Habitacion" +":"+ i);
                nombrehabitacion=nombrehabitacion;
                nombrehabitacion = in.readLine(); 
                System.out.println("Ingese Tipo Habitacion" +":"+ i); 
               if (tipoHabitacion==null)
                   tipoHabitacion ="Single"  ;
               
                tipoHabitacion = in.readLine(); 
                
                sumaHabitaciones = sumaHabitaciones + i;

            System.out.print("llego aqui");
               hotel.registrarHotel(codHotel, nombreHotel, direccion,cantidadHabitacion);
          
System.out.println(msg  + nombrehabitacion+" Y " +"Tipo :"+ tipoHabitacion );
 Hotel hotels = hotel.buscar(codHotel);
        
        System.out.print("\nCodigo Hotel        :" + hotels.getCodigoHotel());
        System.out.print("\nNombre Hotel        :" + hotels.getNombreHotel());
        System.out.print("\nDireccion           :" + hotels.getDireccion());
       System.out.print("\nCantidad Habitacion :" + cantidadHabitacion ); 
            }
        } catch (Exception e) {
           
        }
        //    Logger.getLogger(AdmHotelTest.class.getName()).log(Level.SEVERE, null, e);
     
        }
        
      
         

       

       

    }

