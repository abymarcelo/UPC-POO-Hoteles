/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Plan;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Manuel
 */
public class PlanTest {
    
      @Test
    public void ValidarTipoPlan(){
       Plan plan = new Plan(true);
       assertSame(plan.isEstado(),true);
    }
   
  @Test
    public void TipoPlan(){
        Plan plan = new Plan(true);
        String mensaje = "Plan Gratuito";
        assertSame(mensaje,plan.TipoPlan());
        
    }

}
