/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Kenshin2
 */
public class AdmTipoPlanTest {
    
    @Test
    
    public void usuarioDebeRegistrarUnPlanGratis(){
        AdmUsuario user=new AdmUsuario();
        user.mostrarDataPlan();
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
         
         AdmTipoPlan admTipoPlan=new AdmTipoPlan();
         
         
     }
    
    
}
