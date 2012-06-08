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
    
    public void registrarCuenta(String correo,String password,String repetirPassword,String nombreHotel,String webHotel,boolean conformidad, long HoraCreacion){
        buscarCorreo(correo);
        
        for(Cuenta cuenta:cuentas){
            if(cuenta.getCorreo().equals(correo))
                throw new RuntimeException();
        }
        Cuenta cuenta=new Cuenta(correo, password, repetirPassword, nombreHotel,webHotel,conformidad);
        cuentas.add(cuenta);
    }
    
    private void buscarCorreo(String correo)throws RuntimeException{
        for(Cuenta cuenta:cuentas){
            if(cuenta.getCorreo().equals(correo))
                throw new RuntimeException("CORREO ELECTRONICO YA REGISTRADO");         
        }
    }    
}
