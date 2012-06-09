/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Agencia;

/**
 *
 * @author CARLOS
 */
public class AdmAgencia {
   
    private ArrayList<Agencia>agencias;

     public AdmAgencia() {
        agencias=new ArrayList<Agencia>();
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
     
      public void registrarAgencia(String codigo, String nombre,String telefono,String correo, String direccion, String ciudad, String estado, String pais){
       buscarAgencia(codigo);
       Agencia agencia=new Agencia(codigo,nombre,telefono,correo,direccion,ciudad,estado,pais);
       agencias.add(agencia);
    }
      
      private void buscarAgencia(String codigo)throws RuntimeException{
        for(Agencia cliente:agencias){
            if(cliente.getCorreo().equals(codigo))
                throw new RuntimeException("CODIGO YA REGISTRADO");         
        }
    }
    

    
    
}
