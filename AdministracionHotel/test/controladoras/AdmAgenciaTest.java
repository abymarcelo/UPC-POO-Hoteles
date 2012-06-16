/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Agencia;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author manuel
 */
public class AdmAgenciaTest {
    
    public AdmAgenciaTest() {
    }
    
    @Test
        public void RegistrarAgencia(){
        
        String identificacion="1234";
        String contacto="Prueba";
        String nombre="CENTRAL";
        String pasaporte="";
        String telefono="";
        String sexo="Masculino";
        String email="";
        String direccion="MIraflores";
        String ciudad="Lima";
        Boolean estado=true;
        String pais="Peru";
        String comentarios="";  
        
        AdmAgencia agencia = new AdmAgencia();
        try {
            //(string,int,string,int,int,int,double)
                  
       agencia.registrarAgencia(identificacion,contacto,nombre,pasaporte,telefono,sexo,email,direccion,ciudad,
                    estado,pais,comentarios);  
            
          } catch (CuentaException ex) {
        System.out.println (ex.toString());  
        }
        Agencia agencias = agencia.buscar(nombre);
        
        System.out.println("Datos de la Agencia");
        System.out.print("\nIdentificacion          :" + agencias.getIdentificacion());
        System.out.print("\nContacto                :" + agencias.getContacto());
        System.out.print("\nNombre                  :" + agencias.getNombre());
        System.out.print("\nDireccion               :" + agencias.getDireccion());
        System.out.print("\nCiudad                  :" + agencias.getCiudad());
        System.out.print("\nPais                    :" + agencias.getPais());
        System.out.print("\nEstado                  :" + agencias.getEstado());
    
    }   
   
    
}
