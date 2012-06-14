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
    private int CodigoReserva;
    private String NombreHabitacion;
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
    private String codigoCliente ;
    private String Notas;
    
    //    reserva.add(new Reserva(codigoCliente,codigoReserva,codHabitacion, fechaLlegada, fechaSalida, dias, total));
         
    public Reserva(String codigoCliente, int codigoReserva,String nombreHabitacion, int fechaIngreso,int fechaSalida,int dias,double total){
        this.codigoCliente=codigoCliente;//cliente.getCodigo();
        this.CodigoReserva=codigoReserva;
        this.NombreHabitacion=CodHabitacion;//habitacion.getNombre_Habitacion();
        this.fechaIngreso=fechaIngreso;
        this.fechaSalida=fechaSalida;
        this.dias=dias;
        this.total=total;
    }

     public Reserva(int cantidadOcupantes,double descuento,String codigoCliente,int codigoReserva,String nombreHabitacion, int fechaIngreso,int fechaSalida,int dias,double total){
        this.codigoCliente=codigoCliente;//cliente.getCodigo();
         this.CodigoReserva=codigoReserva;
        this.NombreHabitacion=CodHabitacion;//habitacion.getNombre_Habitacion();
        this.fechaIngreso=fechaIngreso;
        this.fechaSalida=fechaSalida;
        this.dias=dias;
        this.total=total;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

   
     
    public int getCodigoReserva() {
        return CodigoReserva;
    }

    public void setCodigoReserva(int CodigoReserva) {
        this.CodigoReserva = CodigoReserva;
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

    public String getNombreHabitacion() {
        return NombreHabitacion;
    }

    public void setNombreHabitacion(String NombreHabitacion) {
        this.NombreHabitacion = NombreHabitacion;
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
