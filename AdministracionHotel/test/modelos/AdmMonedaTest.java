/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladoras.AdmMoneda;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author Fam Herrera
 */
public class AdmMonedaTest {
    
    
    public AdmMonedaTest(){
    }
    
    @Test
    public void RegistrarCuenta(){
        // Arrange
       int    cod_moneda = 1;
       int    tip_moneda = 1;
       String nom_moneda = "Soles";
       
       AdmMoneda moneda = new AdmMoneda();
       //int cod_moneda,int tip_moneda,String nom_moneda
       moneda.registrarMoneda(cod_moneda,tip_moneda,nom_moneda);
        

       Moneda monedas = moneda.buscoMonedas(cod_moneda);
        
       System.out.print("\nCodigo     :"+ monedas.getCod_moneda());
       System.out.print("\nNombres :" + monedas.getNom_moneda());
       System.out.print("\nTipo  :" + monedas.getTip_moneda());
        
    }
}
