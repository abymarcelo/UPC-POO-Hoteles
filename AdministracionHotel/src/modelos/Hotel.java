/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Daniel
 */
public class Hotel {

    
    
    private int codigoHotel;
    private String nombreHotel;
    private String direccion;
    private int cantidadHabitacion;

    public Hotel(int codigoHotel, String nombreHotel, String direccion, int cantidadHabitacion) {
        this.codigoHotel = codigoHotel;
        this.nombreHotel = nombreHotel;
        this.direccion = direccion;
        this.cantidadHabitacion = cantidadHabitacion;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadHabitacion() {
        return cantidadHabitacion;
    }

    public void setCantidadHabitacion(int cantidadHabitacion) {
        this.cantidadHabitacion = cantidadHabitacion;
    }
        
}
