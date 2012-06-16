/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.TipoPlan;
import modelos.Usuario;

/**
 *
 * @author Kenshin2
 */
public class AdmTipoPlan {
    
    private ArrayList<TipoPlan> tipos=new ArrayList<TipoPlan>();

    private void simularTabla(){
        this.tipos.add(new TipoPlan("Clerk Gratis","∞","∞","∞",70,0.0));
        this.tipos.add(new TipoPlan("Clerk basic","∞","∞","∞",150,39.0));
         this.tipos.add(new TipoPlan("Clerk Plus","∞","∞","∞",260,64.0));
         this.tipos.add(new TipoPlan("Clerk Full","∞","∞","∞",1000,99.0));
    }
    
     public ArrayList<TipoPlan> getTipos() {
        return tipos;
    }
    
    public void registrarPlan(String plan, String cantHabitacion, String cantServicio, String cantCliente, int cantReserva, double Precio){
        
        TipoPlan tipoPlan=new TipoPlan(plan,cantHabitacion,cantServicio,cantCliente,cantReserva,Precio);
        tipos.add(tipoPlan);
    }
    
    public TipoPlan buscarPlan(String plan){
        for(TipoPlan tipoPlan:tipos)
            if(tipoPlan.getPlan().equals(plan))
              return tipoPlan;
        return null;
        
      }
    

    
}
