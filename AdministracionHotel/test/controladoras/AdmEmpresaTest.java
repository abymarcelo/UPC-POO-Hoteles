/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Empresa;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Erika Gina
 */
public class AdmEmpresaTest {
    
    public AdmEmpresaTest() {
    }

     @Test
        public void RegistrarEmpresa(){
        
        String identificacion="123";
        String contacto="Amaya";
        String metodoPago="Efectivo";
        String convenio="Efectivo";
        String nombre="Romero";
        String pasaporte="";
        String telefono="";
        String sexo="";
        String email="mamayas@gromero.com.pe";
        String direccion="Callao";
        String ciudad="Lima";
        Boolean estado=true;
        String pais="Peru";
        String comentarios="";
                
        AdmEmpresa empresa = new AdmEmpresa();
        try {
                      
                empresa.registrarEmpresa(identificacion,contacto,metodoPago,convenio,nombre,pasaporte,telefono,sexo,
                        email,direccion,ciudad,estado,pais,
                        comentarios);
          } catch (CuentaException ex) {
        System.out.println (ex.toString());  
        }
        //Reserva reservas = reserva.buscar(codigoReserva);
        Empresa empresas = empresa.buscar(nombre);
        
            
        
        System.out.print("Datos de la Empresa");
        System.out.print("\nIdentificacion     :" + empresas.getIdentificacion());
        System.out.print("\nContacto           :" + empresas.getContacto());
        System.out.print("\nNombre        :" + empresas.getNombre());
        System.out.print("\nDireccion              :" + empresas.getDireccion());
        System.out.print("\nCiudad               :" + empresas.getCiudad());
        System.out.print("\nEstado               :" + empresas.getEstado());
        System.out.print("\nPais               :" + empresas.getPais());

}   
  
}
