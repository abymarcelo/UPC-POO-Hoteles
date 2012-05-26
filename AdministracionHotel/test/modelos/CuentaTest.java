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
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Sheraton",true);
        assertEquals(1, admcuenta.getCuentas().size());
    }
    
    @Test 
    
    public void clienteYaTieneCorreosRegistradas(){
        admcuenta.registrarCuenta("lsanchez@hotmail.com","lui123","lui123","Inkamar",true);
        admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot",true);
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Andes",true);
        assertEquals(3, admcuenta.getCuentas().size());
    }
    
    @Test
    
    public void siNoIngresoCorreoElectronicoMeDebeDarError(){
        assertFalse(admcuenta.verificarCorreo(null));
        System.out.println("Debe ingresar correo electronico");
    }  
    
    @Test
    
    public void siNoIngresoPasswordMeDebeDarError(){
        assertFalse(admcuenta.verificarCorreo(null));
        System.out.println("Debe ingresar Password");
    }  
    @Test
    public void siIngresoPasswordDebeAceptarlo(){
        assertTrue(admcuenta.verificarCorreo("carlos"));
        System.out.println("Password Ingresada");
    }
    
    @Test
    
    public void registrarCuentas(){
        assertEquals(0, admcuenta.getCuentas().size());
        admcuenta.registrarCuenta("cvera@hotmail.com","car123","car123","Sheraton",true);
        assertEquals(1, admcuenta.getCuentas().size());
        admcuenta.registrarCuenta("lsanchez@hotmail.com","lui123","lui123","Inkamar",true);
        admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot",true);
        admcuenta.registrarCuenta("pmendoza@hotmail.com","pau123","pau123","Andes",true);
        assertEquals(4, admcuenta.getCuentas().size());
        try{
            admcuenta.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot",true);
            fail();
           }catch(Exception ex){
               assertEquals("CORREO ELECTRONICO YA REGISTRADO", ex.getMessage());
           }
    }
       
   
    
    
}
