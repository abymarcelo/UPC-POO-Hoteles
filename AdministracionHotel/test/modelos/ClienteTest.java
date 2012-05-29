/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladoras.AdmCuenta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CARLOS
 */
public class ClienteTest {
    
    AdmCuenta cliente=new AdmCuenta();
    
    @Test
    
    public void clienteSinCuenta(){
        assertEquals(0, cliente.getCuentas().size());
    }
    
     @Test
    public void ValidarDatosCliente(){
        Cliente cliente = new Cliente("Java Confort", "http://Java.clerk.im");
        assertNotNull(cliente.getNombre(), cliente.getEnlace());
    }
    
      public void SiElNombreHotelNoSeIngresa(){
       Cliente cliente=new Cliente("Java resort","http://Java.clerk.im");
       cliente.setNombre(null);// .setNombre(null);
       String NombreEsperado="mas2711@hotmail.com";
       String NombreRecibido= cliente.getNombre();
       assertSame(NombreEsperado, cliente.NombreNoExiste());
               
  }
}
