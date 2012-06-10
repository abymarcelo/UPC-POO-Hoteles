/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Fam Herrera
 */
public class TipoHabitacion {
    private String cod_tipoHabitacion;
    private String nombre_Habitacion;
    private double precio;
    private String codHotel;

    public String getCodHotel() {
        return codHotel;
    }

    public void setCodHotel(String codHotel) {
        this.codHotel = codHotel;
    }

    public String getCod_tipoHabitacion() {
        return cod_tipoHabitacion;
    }

    public void setCod_tipoHabitacion(String cod_tipoHabitacion) {
        this.cod_tipoHabitacion = cod_tipoHabitacion;
    }

    public String getNombre_Habitacion() {
        return nombre_Habitacion;
    }

    public void setNombre_Habitacion(String nombre_Habitacion) {
        this.nombre_Habitacion = nombre_Habitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoHabitacion(String cod_tipoHabitacion, String nombre_Habitacion, double precio, String codHotel) {
        this.cod_tipoHabitacion = cod_tipoHabitacion;
        this.nombre_Habitacion = nombre_Habitacion;
        this.precio = precio;
        this.codHotel = codHotel;
    }






    
    
}

