/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.TipoHabitacion;
import java.util.ArrayList;

/**
 *
 * @author Fam Herrera
 */
public class AdmTipoHabitacion {
  private ArrayList<TipoHabitacion> tipoHabitaciones;

    public AdmTipoHabitacion() {
        tipoHabitaciones=new ArrayList<TipoHabitacion>();
    }

    public ArrayList<TipoHabitacion> getTipoHabitacion() {
        return tipoHabitaciones;
    }
    
    
    public void registrarTipoHabitacion(String cod_tipoHabitacion,String nombre_Habitacion,double precio,String codHotel){
        
        String mensaje="ok";
        
        mensaje = buscarTipoHabitacion(cod_tipoHabitacion);
        
        if (mensaje.equals("")){   
            
            TipoHabitacion tipoHabitacion = new TipoHabitacion(cod_tipoHabitacion, nombre_Habitacion, precio, codHotel);
            
            
            tipoHabitaciones.add(tipoHabitacion);
            
           }           
        
    }
  
    public String buscarTipoHabitacion(String cod_tipoHabitacion)throws RuntimeException{
        
        String mensaje="";
        
        for(TipoHabitacion tipHabitacion:tipoHabitaciones){
            if(tipHabitacion.getCod_tipoHabitacion().equals(cod_tipoHabitacion))
                mensaje = "\nTipo de Habitacion ya registrado";
                }
                return mensaje;
        }
    
    
      public TipoHabitacion buscar(String cod_tipoHabitacion) {
        // Buscar el tipo de habitacion por codigo
        for(TipoHabitacion tipHab : tipoHabitaciones)
            if (tipHab.getCod_tipoHabitacion().equals(cod_tipoHabitacion))
                return tipHab;
            return null;
            }
    
}
