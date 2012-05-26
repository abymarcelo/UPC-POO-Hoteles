/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Cuenta;

/**
 *
 * @author CARLOS
 */
public class AdmCuenta {
    
    private ArrayList<Cuenta> cuentas;

    public AdmCuenta() {
        cuentas=new ArrayList<Cuenta>();
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    public void registrarCuenta(String correo,String password,String repetirPassword,String nombreHotel,boolean conformidad){
        buscarCorreo(correo);
        
        for(Cuenta cuenta:cuentas){
            if(cuenta.getCorreo().equals(correo))
                throw new RuntimeException();
        }
        Cuenta cuenta=new Cuenta(correo, password, repetirPassword, nombreHotel,conformidad);
        cuentas.add(cuenta);
    }
    
    private void buscarCorreo(String correo)throws RuntimeException{
        for(Cuenta cuenta:cuentas){
            if(cuenta.getCorreo().equals(correo))
                throw new RuntimeException("CORREO ELECTRONICO YA REGISTRADO");         
        }
    }
    
     public boolean verificarCorreo(String correo){
        if(correo!=null){
            return true;
        }
          return false;
    }
     
     public boolean verificarPassword(String password){
        if(password!=null){
            return true;
        }
        return false;
    }
     
      public boolean verificarRepetirPassword(String repetirPassword){
        if(repetirPassword!=null){
            return true;
        }
        return false;
    }
      
       public boolean verificarNombreHotel(String nombreHotel){
        if(nombreHotel!=null){
            return true;
        }
        return false;
    }
       
       public boolean verificarConformidad(boolean conformidad){
        if(conformidad!=false){
            return true;
        }
        return false;
    }
       
      
      
     
}
