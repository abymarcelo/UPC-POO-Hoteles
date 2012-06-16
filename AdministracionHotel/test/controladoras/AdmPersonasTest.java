/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelos.Persona;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author manuel
 */
public class AdmPersonasTest {

    
    public AdmPersonasTest() {
    }
     
    
   
   @Test
        public void GrabarPersona(){
        
        String nombre="Manuel";
        String apellido="Amaya";
        Date fechaNacimiento= new Date(2012,06,12);
        String pasaporte="";  
        String telefono="";
        String sexo="Masculino";
        String email="mas2711@hotmail.com";
        String direccion="La perla";
        String ciudad="Lima";
        Boolean estado=true;
        String pais="Peru";
        String comentarios="";
      
        AdmPersonas persona = new AdmPersonas();
        try {
                      
                persona.registrarPersona(apellido,fechaNacimiento,nombre,pasaporte,telefono,sexo,
                        email,direccion,ciudad,estado,pais,
                        comentarios);
          } catch (CuentaException ex) {
        System.out.println (ex.toString());  
        }
        //Reserva reservas = reserva.buscar(codigoReserva);
        
        Persona personas = persona.buscar(nombre);
        
        System.out.print("Datos de la Persona");
        System.out.print("\nNombre             :" + personas.getNombre());
        System.out.print("\nApellido           :" + personas.getApellido());
        System.out.print("\nSexo               :" + personas.getSexo());
        System.out.print("\nEmail              :" + personas.getEmail());
        System.out.print("\nPais               :" + personas.getPais());
    }   
   
    @Test
     public void EsPersonaFrecuente(){
         AdmPersonas persona = new AdmPersonas();
         persona.seleccionarPersona("Carlos");
         
     }
   
    @Test
     public void ListarPersonas(){
         AdmPersonas persona = new AdmPersonas();
         persona.ListarPersona();
         
     }
   
}