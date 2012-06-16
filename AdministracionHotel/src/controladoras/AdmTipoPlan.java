/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import java.util.Calendar;
import modelos.TipoPlan;
import modelos.Usuario;
/**
 *
 * @author Kenshin2
 */
public class AdmTipoPlan {
    
    private ArrayList<TipoPlan> tipos=new ArrayList<TipoPlan>();
    
     public ArrayList<TipoPlan> getTipos() {
        return tipos;
    }
    
    public void registrarPlan(String plan, String cantHabitacion, String cantServicio, String cantCliente, int cantReserva, double Precio){
        
        TipoPlan tipoPlan=new TipoPlan(plan,cantHabitacion,cantServicio,cantCliente,cantReserva,Precio);
        tipoPlan.setFechaRegistro(Calendar.getInstance());
        tipos.add(tipoPlan);
        
        for (int i=0;i<tipos.size() ;i++)
        System.out.println(tipos.get(i).getCantCliente());
    }
    
    public TipoPlan buscarPlan(String plan){
        for(TipoPlan tipoPlan:tipos)
            if(tipoPlan.getPlan().equals(plan))
              return tipoPlan;
        return null;
        
      }
    
    public boolean validarPago(String paypal){
        return true;
    }
    

    
}
