/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Manuel
 */
public class Facturacion extends Reserva{
    private Reserva reserva;
    private int codigoReserva;
    private double PrecioXnoche;
    private double Descuento;
    private boolean Estado;
    private Cliente cliente;
    private boolean CheckIn;
    private boolean CheckOut;
    
    public Facturacion(double precioXnoche, int cantidadOcupantes, double descuento,String codigoCliente,int codigoReserva,String codigoHabitacion, int fechaIngreso,int fechaSalida,int dias, double total){
        super(cantidadOcupantes,descuento,codigoCliente,codigoReserva,codigoHabitacion, fechaIngreso, fechaSalida, dias,total);
        this.PrecioXnoche=precioXnoche;
        
    }
              
    public boolean isCheckIn() {
        return CheckIn;
    }

    public boolean isCheckOut() {
        return CheckOut;
    }

    public double getDescuento() {
        return Descuento;
    }

   
    public boolean isEstado() {
        return Estado;
    }

   
   
    public double getPrecioXnoche() {
        return PrecioXnoche;
    }

   
    public Cliente getCliente() {
        return cliente;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    
}

