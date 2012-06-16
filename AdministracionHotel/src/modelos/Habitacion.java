/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import db.dbHabitacion;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Fam Herrera
 */
public class Habitacion implements Comparable {
    String nombreHotel;
    String nombreHabitacion;
    String tipoHabitacion;
    String estadoHabitacion;

    

    public Habitacion(String nombreHotel, String nombreHabitacion, String tipoHabitacion,String estadoHabitacion) {
        this.nombreHotel = nombreHotel;
        this.nombreHabitacion = nombreHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.estadoHabitacion = estadoHabitacion;
    }

    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }
    
    public static ArrayList<Habitacion> getHabitacion(){
        dbHabitacion habitaciones =  new dbHabitacion();             
        return habitaciones.simulaDataHabitaciones();
    }
    
  
    
    public int compareTo(Object o) {
        Habitacion hab = (Habitacion)o;
            return this.getTipoHabitacion().compareToIgnoreCase(hab.tipoHabitacion);
            }

    public int compareTo2(Object o){
        Habitacion hab = (Habitacion)o;
            return this.getNombreHabitacion().compareToIgnoreCase(hab.nombreHabitacion);
    }
    
    public class nombreHabitacionComparator implements Comparator {

public int compare(Object o1, Object o2) { 
        Habitacion hab1 = (Habitacion)o1;
        Habitacion hab2 = (Habitacion)o2;
        return hab1.getNombreHabitacion().
                compareTo(hab2.getNombreHabitacion()); 

    }

        
    } 
}
