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
    
}
