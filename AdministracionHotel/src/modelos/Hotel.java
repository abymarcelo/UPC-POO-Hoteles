/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Fam Herrera
 */
public class Hotel {
    private String nombreHotel;
    private int cantidadHabitacion;
    boolean condicionHotel;

    public Hotel(String nombreHotel, int cantidadHabitacion) {
        this.nombreHotel = nombreHotel;
        this.cantidadHabitacion = cantidadHabitacion;
    }

    public int getCantidadHabitacion() {
        return cantidadHabitacion;
    }

    public void setCantidadHabitacion(int cantidadHabitacion) {
        this.cantidadHabitacion = cantidadHabitacion;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }
    
}
