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
    private String CodHabitacion;
    private int fechaIngreso;
    private int fechaSalida;
    private int dias;
    private double total;
    private Date Hora;
    private boolean Status;
    private int CantidadOcupantes;
    private boolean EstadoReserva;
    private Cliente cliente;
    private String Notas;
    
    public Reserva(int codigoHabitacion, int fechaIngreso,int fechaSalida,int dias,double total){
        this.CodHabitacion=habitacion.getNombre_Habitacion();
        this.fechaIngreso=fechaIngreso;
        this.fechaSalida=fechaSalida;
        this.dias=dias;
        this.total=total;
    }

     public Reserva(int cantidadOcupantes,double descuento,int codigoHabitacion, int fechaIngreso,int fechaSalida,int dias,double total){
        this.CodHabitacion=habitacion.getNombre_Habitacion();
        this.fechaIngreso=fechaIngreso;
        this.fechaSalida=fechaSalida;
        this.dias=dias;
        this.total=total;
    }
     
    public String getCodHabitacion() {
        return CodHabitacion;
    }

    public int getDias() {
        return dias;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public double getTotal() {
        return total;
    }
    
    
    
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
