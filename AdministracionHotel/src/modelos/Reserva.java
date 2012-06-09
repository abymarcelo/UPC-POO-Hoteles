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
public class Reserva {
    private int NumeroReserva;
    private TipoHabitacion habitacion;
    private Date Fecha;
    private Date Hora;
    private boolean Status;
    private int CantidadOcupantes;
    private boolean EstadoReserva;
    private Cliente cliente;
    private String Notas;
    
    public int getCantidadOcupantes() {
        return CantidadOcupantes;
    }

    public void setCantidadOcupantes(int CantidadOcupantes) {
        this.CantidadOcupantes = CantidadOcupantes;
    }

    public boolean isEstadoReserva() {
        return EstadoReserva;
    }

    public void setEstadoReserva(boolean EstadoReserva) {
        this.EstadoReserva = EstadoReserva;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getNumeroReserva() {
        return NumeroReserva;
    }

    public void setNumeroReserva(int NumeroReserva) {
        this.NumeroReserva = NumeroReserva;
    }

    public Date getHora() {
        return Hora;
    }

    public boolean isStatus() {
        return Status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoHabitacion getHabitacion() {
        return habitacion;
    }

    public String getNotas() {
        return Notas;
    }
    
    
    

   
}
