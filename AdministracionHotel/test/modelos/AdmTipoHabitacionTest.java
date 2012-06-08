/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladoras.AdmTipoHabitacion;
import org.junit.Test;


/**
 *
 * @author Fam Herrera
 */
public class AdmTipoHabitacionTest {
    
    public AdmTipoHabitacionTest(){
        
    }

    @Test
    public void RegistrarTipoHabitacion(){
        
        String cod_tipoHabitacion = "11";
        String nombre_Habitacion  = "El rapido";
        int    precio             = 2;
        String codHotel           = "1";
       
        AdmTipoHabitacion tipHab = new AdmTipoHabitacion();
        
        tipHab.registrarTipoHabitacion(cod_tipoHabitacion, nombre_Habitacion, precio, codHotel);
         
        TipoHabitacion tipHabi = tipHab.buscar(cod_tipoHabitacion);
        
        System.out.print("\n" + tipHabi.getCodHotel());
        System.out.print("\n" + tipHabi.getCod_tipoHabitacion());
        System.out.print("\n" + tipHabi.getNombre_Habitacion());
        System.out.print("\n" + tipHabi.getPrecio());        
       
        
    }
}
