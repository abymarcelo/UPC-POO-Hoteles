/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import controladoras.AdmCuenta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CARLOS
 */
public class AdmCuentaTest {
    
       AdmCuenta admcuenta = new AdmCuenta();
    
    @Test
    
    public void registrarCuentas(){
        assertEquals(0, admcuenta.getCuentas().size());
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Sheraton","http://Sheraton.com",true,123456);
        assertEquals(1, admcuenta.getCuentas().size());
        admcuenta.registrarCuenta("lsanchez@hotmail.com","lui123","lui123","Inkamar","",true,051324);
        admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot","",true,062500);
        admcuenta.registrarCuenta("pmendoza@hotmail.com","pau123","pau123","Andes","",true,021314);
        assertEquals(4, admcuenta.getCuentas().size());
        try{
            admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot","",true,101213);
            fail();
           }catch(Exception ex){
               assertEquals("CORREO ELECTRONICO YA REGISTRADO", ex.getMessage());
           }
    }
       
   
    String mail="dennys@ata.com";;
    String pass="123";
    String rpass="123";
    String hotel="Kenshin";
    String web="Kenshin.com";
    boolean Conformidad=false;
    
    Cuenta cuenta1=new Cuenta(mail,pass,rpass,hotel,web,Conformidad);
    
    @Test
    public void DebeIngresarCorreoElectronico(){
       assertNotNull("Debe Ingresar Correo", cuenta1.getCorreo());
    }
    @Test
    public void DebeIngresarContraseña(){
        assertNotNull("Debe Ingresar Contraseña", cuenta1.getPassWord());
    }
    @Test
    public void DebeIngresarRepetirContraseña(){
        assertNotNull("Debe Ingresar Repetir Contraseña", cuenta1.getRepetirPassword());
    }
    @Test
    public void DebeIngresarNombreDelHotel(){
        assertNotNull("Debe Ingresar Nombre del Hotel", cuenta1.getNombreHotel());
    }
    @Test
    public void DebeIngresarWebDelHotel(){
        assertNotNull("Debe Ingresar Web del Hotel", cuenta1.getWebHotel());
    }
    @Test
    public void DebeIngresarConformidadTerminosYCondiciones(){
        assertNotNull("Debe Aceptar Terminos y Condiciones", cuenta1.isConformidad());
    }
    
     @Test
    public void DebeIngresarUnCorreoElectronicoValido(){
    assertTrue("Mail Invalido",cuenta1.isMailCorrecto(cuenta1.getCorreo()));
    }
     
    @Test
    public void LasDosContraseñasDebenConcidir(){
        assertEquals("Las Contraseñas no Coinciden", cuenta1.getPassWord(), cuenta1.getRepetirPassword());
    } 
    
    @Test
    public void SeDebeMostrarNombresSugeridos(){
        assertNotNull("No Ingreso Nombre del Hotel", cuenta1.getNombreHotel());
            cuenta1.MostrarNombresSugeridos(cuenta1.getNombreHotel());
        
    }
    
     @Test
    public void MensajeDeRegistroDeCuentaConExito(){
    String mail1="dennys@ata.com.pe";
    String pass1="123";
    String rpass1="123";
    String hotel1="Kenshin";
    String web1="Kenshin.com";
    boolean Conformidad1=false;
    
    Cuenta cuenta2=new Cuenta(mail1,pass1,rpass1,hotel1,web1,Conformidad1);
    cuenta2.MensajeCuentaRegistrada();
    assertSame("Cuenta Registrada con Exito \n Tiene 24 horas para confirmar el mail y tiene un plan gratuito", cuenta2.MensajeCuentaRegistrada());
    
    
    }
    
}