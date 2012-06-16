/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import org.junit.Test;
import controladoras.AdmTipoPlan;
import modelos.Usuario;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import modelos.Usuario;
import org.junit.Test;

/**
 *
 * @author Kenshin2
 */
public class UsuarioTest {
    String correo="dennys@ata.com";
    String password="123";
    String nombreHotel="Kenshin";
    String webHotel="Kenshin.com";
    String repetircontraseña="123";
    
    boolean Conformidad=false;
    
    Usuario usuario =new Usuario(correo,password,nombreHotel,webHotel,Conformidad);
    
    @Test
    public void DebeIngresarCorreoElectronico(){
       assertNotNull("Debe Ingresar Correo", usuario.getCorreo());
    }
    
    @Test
    public void DebeIngresarContraseña(){
        assertNotNull("Debe Ingresar Contraseña", usuario.getPassWord());
}
    
    @Test
    public void DebeIngresarRepetirContraseña(){
        String repitePass="123";
        assertTrue("Debe Ingresar Repetir Contraseña", usuario.contraseñaVacia(repitePass));
    }
    
    @Test
    public void DebeIngresarNombreDelHotel(){
        assertNotNull("Debe Ingresar Nombre del Hotel", usuario.getNombreHotel());
    }
    @Test
    public void DebeIngresarWebDelHotel(){
        assertNotNull("Debe Ingresar Web del Hotel", usuario.getWebHotel());
    }
    @Test
    public void DebeIngresarConformidadTerminosYCondiciones(){
        assertNotNull("Debe Aceptar Terminos y Condiciones", usuario.isConformidad());
    }
    
     @Test
    public void DebeIngresarUnCorreoElectronicoValido(){
    assertTrue("Mail Invalido",usuario.isMailCorrecto(usuario.getCorreo()));
    }
     
     @Test
    public void SeDebeMostrarNombresSugeridos(){
        assertNotNull("No Ingreso Nombre del Hotel", usuario.getNombreHotel());
            usuario.MostrarNombresSugeridos(usuario.getNombreHotel());
        
    }
     
     @Test
     public void SiContraseñasNoCoicidenDebeMandarMensajeDeError(){
         AdmUsuario admUsuario=new AdmUsuario();
         admUsuario.capturaDatos("dennys@ata.com","123", "123","Kenshin","Kenshin.com",false);
//         Usuario usua=admUsuario.buscarContraseña(password);
         assertTrue("Las Contraseñas no coinciden",admUsuario.capturaDatos("dennys@ata.com","123", "123","Kenshin","Kenshin.com",false));
     }
     
    
     @Test
    public void MensajeDeRegistroDeCuentaConExito(){
    String correo1="dennys@ata.com.pe";
    String password1="123";
    String nombreHotel1="Kenshin";
    String webHotel1="Kenshin.com";
    boolean Conformidad1=false;
    
    Usuario usuario2=new Usuario(correo1,password1,nombreHotel1,webHotel1,Conformidad1);
    usuario2.MensajeCuentaRegistrada();
    assertSame("Cuenta Registrada con Exito \n Tiene 24 horas para confirmar el mail y tiene un plan gratuito", usuario2.MensajeCuentaRegistrada());
    
    
    }
    
}
