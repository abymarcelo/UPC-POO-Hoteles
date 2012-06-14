/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import controladoras.AdmReserva;
import controladoras.CuentaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import java.util.Date;
import modelos.Reserva;
/**
 *
 * @author Manuel
 */
public class ReservaTest {
    
    @Test
        public void RegistrarReserva(){
        
        String codigoCliente="AMAYA001";
        int codigoReserva=1;
        String NombreHabitacion = "101";
        int FechaIngreso = 20120610;
        int FechaSalida = 20120612;
        int Dias = 3;
        double Total = 1200.5;
              /*
        String codigoCliente2="AMAYA002";
        int codigoReserva2=1;
        String NombreHabitacion2 = "102";
        int FechaIngreso2 = 20120611;
        int FechaSalida2 = 20120612;
        int Dias2 = 2;
        double Total2 = 780;
       
        
         String codigoCliente3="AMAYA001";
        int codigoReserva3=1;
        String NombreHabitacion3 = "101";
        int FechaIngreso3 = 20120613;
        int FechaSalida3 = 20120616;
        int Dias3 = 4;
        double Total3 = 450;
       */
        
        
        AdmReserva reserva = new AdmReserva();
        try {
            //(string,int,string,int,int,int,double)
                reserva.registrarReserva(codigoCliente,codigoReserva,NombreHabitacion, FechaIngreso, FechaSalida, Dias, Total);
          } catch (CuentaException ex) {
        System.out.println (ex.toString());  
        }
        Reserva reservas = reserva.buscar(codigoReserva);
        
        System.out.print("\nCiente              :" + reservas.getCodigoCliente());
        System.out.print("\nNombre Habitacion   :" + reservas.getNombreHabitacion());
        System.out.print("\nFecha Ingreso       :" + reservas.getFechaIngreso());
        System.out.print("\nFecha Salida        :" + reservas.getFechaSalida());
        System.out.print("\nCantidad Dias       :" + reservas.getDias());
        System.out.println("\nTotal             :" + reservas.getTotal());
    }
  
}
