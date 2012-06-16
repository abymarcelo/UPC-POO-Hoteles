/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import controladoras.AdmTipoHabitacion;
import modelos.TipoHabitacion;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Fam Herrera
 */
public class AdmTipoHabitacionTest {
    private static char tipoMoneda;
    
    public AdmTipoHabitacionTest(){
        
    }

    @Test
    public void RegistrarTipoHabitacion() {
        
        String cod_tipoHabitacion = "11";
        String nombre_Habitacion  = "El rapido";
        double    precio             = 20.00;
        double    pcambio=0;
        String codHotel           = "1";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        AdmTipoHabitacion tipHab = new AdmTipoHabitacion();
        
        tipHab.registrarTipoHabitacion(cod_tipoHabitacion, nombre_Habitacion, precio, codHotel);
         
        TipoHabitacion tipHabi = tipHab.buscar(cod_tipoHabitacion);
        
        System.out.print("\n" + tipHabi.getCodHotel());
        System.out.print("\n" + tipHabi.getCod_tipoHabitacion());
        System.out.print("\n" + tipHabi.getNombre_Habitacion());
        //System.out.print("\n" + tipHabi.getPrecio());        
      
        try {
             System.out.println("\n"+"Ingrese el precio de la habitacion");
              precio = Double.parseDouble(in.readLine());
            System.out.println("Ingrese El Tipo De Moneda S (Soles), D (Dolar), E (Euros)"); 
            tipoMoneda = in.readLine().charAt(0);
           
            switch(tipoMoneda){
                case 'S':
                   pcambio =  (double)precio *1;
                   break;
                case 'D':
                    pcambio = (double)precio / 2.65;
                    break;
                case 'E':
                    pcambio = (double)precio / 3.9;
                    break;                
                default:
                    System.out.println("Valor No Permitido");
        } catch (IOException ex) {
            Logger.getLogger(AdmTipoHabitacionTest.class.getName()).log(Level.SEVERE, null, ex);
        
            
        
            
        
    }
        System.out.println("El precio de la habitacion al tipo de cambio es:" + pcambio);
    }
}
