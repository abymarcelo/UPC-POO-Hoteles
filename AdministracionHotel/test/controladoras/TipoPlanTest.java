/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.Test;
import controladoras.AdmTipoPlan;
import modelos.Usuario;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
/**
 *
 * @author Kenshin2
 */
public class TipoPlanTest {
    
    @Test
    
    public void usuarioDebeRegistrarUnPlanGratis(){
        AdmTipoPlan admTipoPlan=new AdmTipoPlan();
        admTipoPlan.registrarPlan("Clerk Gratis", "∞", "∞", "∞", 70, 0.0);
        assertNotNull(admTipoPlan.buscarPlan("Clerk Gratis"));
    }
    
    @Test
    
    public void usuarioDebeRegistrarUnPlanClerkBasic(){
        AdmTipoPlan admTipoPlan=new AdmTipoPlan();
        admTipoPlan.registrarPlan("Clerk Basic", "∞", "∞", "∞", 150, 39.0);
        assertNotNull(admTipoPlan.buscarPlan("Clerk Basic"));
    }
    
     @Test
    
    public void usuarioDebeRegistrarUnPlanClerkPlus(){
        AdmTipoPlan admTipoPlan=new AdmTipoPlan();
        admTipoPlan.registrarPlan("Clerk Plus", "∞", "∞", "∞", 260, 64.0);
        assertNotNull(admTipoPlan.buscarPlan("Clerk Plus"));
    }
     
     @Test
    
    public void usuarioDebeRegistrarUnPlanClerkFull(){
        AdmTipoPlan admTipoPlan=new AdmTipoPlan();
        admTipoPlan.registrarPlan("Clerk Plus", "∞", "∞", "∞", 1000, 99.0);
        assertNotNull(admTipoPlan.buscarPlan("Clerk Plus"));
    }
     
     @Test
     
     public void tipoPlanDebeActivarPaypalAlActivarPlan(){
         boolean paypal=true;
         AdmTipoPlan admTipoPlan=new AdmTipoPlan();
         
     }
    
}
