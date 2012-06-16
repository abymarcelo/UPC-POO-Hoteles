/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Kenshin2
 */
public class TipoPlan {
    private String plan;
       private String cantHabitacion;
       private String cantServicio;
       private String cantCliente;
       private int cantReserva;
       private double Precio;

    public TipoPlan(String plan, String cantHabitacion, String cantServicio, String cantCliente, int cantReserva, double Precio) {
        this.plan = plan;
        this.cantHabitacion = cantHabitacion;
        this.cantServicio = cantServicio;
        this.cantCliente = cantCliente;
        this.cantReserva = cantReserva;
        this.Precio = Precio;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getCantCliente() {
        return cantCliente;
    }

    public void setCantCliente(String cantCliente) {
        this.cantCliente = cantCliente;
    }

    public String getCantHabitacion() {
        return cantHabitacion;
    }

    public void setCantHabitacion(String cantHabitacion) {
        this.cantHabitacion = cantHabitacion;
    }

    public int getCantReserva() {
        return cantReserva;
    }

    public void setCantReserva(int cantReserva) {
        this.cantReserva = cantReserva;
    }

    public String getCantServicio() {
        return cantServicio;
    }

    public void setCantServicio(String cantServicio) {
        this.cantServicio = cantServicio;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
    
}
