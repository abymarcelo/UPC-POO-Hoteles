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
    
    public void clienteNoTieneCorreo(){
        assertEquals(0, admcuenta.getCuentas().size());
    }
    
    @Test
    
    public void clienteYaTieneUncorreoRegistrada(){
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Sheraton","Sheraton-hotel",true,101100);
        assertEquals(1, admcuenta.getCuentas().size());
    }
    
    @Test 
    
    public void clienteYaTieneCorreosRegistradas(){
        admcuenta.registrarCuenta("lsanchez@hotmail.com","lui123","lui123","Inkamar","Inkamar-hotel",true,101100);
        admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot","Marriot-hoterl",true,101100);
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Andes","Andes-hotel",true,101100);
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
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Sheraton","Sheraton-hotel",true,023100);
        assertEquals(1, admcuenta.getCuentas().size());
        admcuenta.registrarCuenta("lsanchez@hotmail.com","lui123","lui123","Inkamar","Inkamar-hotel",true,023100);
        admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot","Marrot-hotel",true,023100);
        admcuenta.registrarCuenta("pmendoza@hotmail.com","pau123","pau123","Andes","Andes-hotel",true,023100);
        assertEquals(4, admcuenta.getCuentas().size());
        try{
            admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot","Marriot-hotel",true,023100);
            fail();
           }catch(Exception ex){
               assertEquals("CORREO ELECTRONICO YA REGISTRADO", ex.getMessage());
           }
    }
       
   
    
    
}