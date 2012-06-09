/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author Manuel
 */
public class Facturacion {
    private Reserva reserva;
    private Date FechaIngreso;
    private Date FechaSalida;
    private int Dias;
    private double PrecioXnoche;
    private double Descuento;
    private double Total;
    private int CantidadOcupantes;
    private boolean Estado;
    private Cliente cliente;
    private boolean CheckIn;
    private boolean CheckOut;

    public int getCantidadOcupantes() {
        return CantidadOcupantes;
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

    public int getDias() {
        return Dias;
    }

    public boolean isEstado() {
        return Estado;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public double getPrecioXnoche() {
        return PrecioXnoche;
    }

    public double getTotal() {
        return Total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Reserva getReserva() {
        return reserva;
    }

    
}

