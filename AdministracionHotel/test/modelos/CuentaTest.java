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
public class CuentaTest {
    
       AdmCuenta admcuenta = new AdmCuenta();
       
       
    @Test
    
    public void clienteNoTieneCorreo(){
        assertEquals(0, admcuenta.getCuentas().size());
    }
    
    @Test
    
    public void clienteYaTieneUncorreoRegistrada(){
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Sheraton","http://Sheraton.com",true,111500);
        assertEquals(1, admcuenta.getCuentas().size());
    }
    
    @Test 
    
    public void clienteYaTieneCorreosRegistradas(){
        admcuenta.registrarCuenta("lsanchez@hotmail.com","lui123","lui123","Inkamar","",true,111500);
        admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot","",true,111500);
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Andes","",true,121500);
        assertEquals(3, admcuenta.getCuentas().size());
    }
    
    @Test
    
    public void siNoIngresoCorreoElectronicoMeDebeDarError(){
        assertFalse(admcuenta.verificarCorreo(null));
        System.out.println("Debe ingresar correo electronico");
    }  
    
     @Test
    public void siIngresoCorreoDebeAceptarlo(){
        assertTrue(admcuenta.verificarCorreo("cvera@hotmail.com"));
        System.out.println("Correo Ingresado");
    }
    
    @Test
    
    public void siNoIngresoPasswordMeDebeDarError(){
        assertFalse(admcuenta.verificarPassword(null));
        System.out.println("Debe ingresar Password");
    }  
    @Test
    public void siIngresoPasswordDebeAceptarlo(){
        assertTrue(admcuenta.verificarPassword("lui123"));
        System.out.println("Password Ingresado");
    }
    
    @Test
    public void siNoIngresoRepetirPasswordMeDebeDarError(){
        assertFalse(admcuenta.verificarRepetirPassword(null));
        System.out.println("Debe Ingresar repetir Password");
    }
    
    @Test
    public void siIngresoRepetirPasswordDebeAceptarlo(){
        assertTrue(admcuenta.verificarRepetirPassword("lui123"));
        System.out.println("Repetir Password Ingresado");
    }
    
    @Test
    public void siNoIngresoNombreDeHotelMeDebeDarError(){
        assertFalse(admcuenta.verificarNombreHotel(null));
        System.out.println("Debe Ingresar nombre de hotel");
    }
     
    @Test
    public void siIngresoNombreDeHotelDebeAceptarlo(){
        assertTrue(admcuenta.verificarNombreHotel("Andes"));
        System.out.println("Nombre de Hotel Ingresado");
    }
    
    @Test
    public void siNoIngresoConformidadMeDebeDarError(){
       assertFalse(admcuenta.verificarConformidad(false));
        System.out.println("Debe Activar Conformidad");
    }
    
    @Test
    public void siIngresoConformidadDebeAceptarlo(){
        assertTrue(admcuenta.verificarConformidad(true));
        System.out.println("Conformidad Activado");
    }
    
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
       
   //Codigo de Dennys
    String mail="dennys@ata.com";;
    String pass="123";
    String rpass="123";
    String hotel="Kenshin";
    String web="Kenshin.com";
    boolean Conformidad=false;
    long HoraCreacion=111213;
    Cuenta cuenta1=new Cuenta(mail,pass,rpass,hotel,web,Conformidad,HoraCreacion);
    
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
    long HoraCreacion=111213;
    Cuenta cuenta2=new Cuenta(mail1,pass1,rpass1,hotel1,web1,Conformidad1,HoraCreacion);
    cuenta2.MensajeCuentaRegistrada();
    assertSame("Cuenta Registrada con Exito \n Tiene 24 horas para confirmar el mail y tiene un plan gratuito", cuenta2.MensajeCuentaRegistrada());
    
    
    }
    
}