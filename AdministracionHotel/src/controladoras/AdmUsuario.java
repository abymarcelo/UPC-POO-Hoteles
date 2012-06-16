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
public class AdmUsuario {
    
   private ArrayList<Usuario> usuarios;

    public AdmUsuario() {
        usuarios = new ArrayList<Usuario>();
    }
      

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public boolean capturaDatos (String correo,String password,String repetirpassword,String nombreHotel,String webHotel,boolean conformidad){
    if (password.equals(repetirpassword)){
        registrarUsuario(correo, password, nombreHotel, webHotel, conformidad);
        return true;
    }
    else
        return false;
   }
  

  
        public void registrarUsuario(String correo,String password,String nombreHotel,String webHotel,boolean conformidad){
        Usuario usuario=new Usuario(correo, password, nombreHotel,webHotel,conformidad);
        usuarios.add(usuario);
        TipoPlan plans= AsignarPlan("Clerk Gratis");
        boolean error;
        if (plans==null)
            error= true;
        else{
            usuario.setTipoPlan(plans);
            usuario.setFechaRegistro(Calendar.getInstance());
        }
    }
   
    
       public void mostrarDataPlan(){
           ArrayList<TipoPlan> plans = TipoPlan.getTipoPlans();
        for (int i=0;i<plans.size();i++){
            System.out.println(plans.get(i).getPlan()+"\n");
        }
    }
       
        public TipoPlan AsignarPlan(String plan){
           ArrayList<TipoPlan> plans = TipoPlan.getTipoPlans();
        for (int i=0;i<plans.size();i++){
            if(plans.get(i).getPlan().equals(plan))
                return plans.get(i);
              }
        return null;
    }
       
//      AdmTipoPlan tipo = new AdmTipoPlan();
//       tipo=tipos.buscarPlan("Clerk Gratis");
       
       
    
    public Usuario buscarContraseña(String passWord){
        for(Usuario usuario:usuarios)
            if(usuario.getPassWord().equals(passWord))
              return usuario;
        return null;
        
      }
    
    
}
