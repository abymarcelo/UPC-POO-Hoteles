/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;


import java.sql.Date;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AdmTableroTest {
    
  @Test
     public void debeMostrarPantallaReserva(){
         AdmTablero tablero = new AdmTablero();
         tablero.seleccionarReserva();
         
         
     }
    
     @Test
     public void debeAjustarVistaTableroSemanas(){
         int vista=1;
         String fechaTest="15/6/2012";
         AdmTablero tablero = new AdmTablero();
         assertTrue(tablero.VerificarFechaPorSemana(vista,fechaTest));
  
     }
     @Test
       public void debeAjustarVistaTableroMeses1(){
         int opcion=0;//-1:anterior,0:hoy,1:siguiente
         int vista=2;//1:una semana,2:dos semanas,3:tres semanas, 4: un mes
         String fechaTest="20/6/2012";
         AdmTablero tablero = new AdmTablero();
         assertTrue(tablero.VerificarFechaPorMes(opcion,vista,fechaTest));
     }
    
     @Test
    public void debeAjustarVistaTableroMeses(){
         int opcion=0;//-1:anterior,0:hoy,1:siguiente
         int vista=2;//1:una semana,2:dos semanas,3:tres semanas, 4: un mes
         String fechaTest="20/6/2012";
         AdmTablero tablero = new AdmTablero();
         assertTrue(tablero.VerificarFechaPorMes(opcion,vista,fechaTest));
     }
     
     
     @Test
     public void debeOrdenarTableroPorTipoDeHabitacion(){
         AdmTablero tablero = new AdmTablero();
         tablero.OrdenarPorTipoHabitacion();
     }
     
     @Test
     public void debeMostrarResumenDeVentas(){
         
     }

  
}
