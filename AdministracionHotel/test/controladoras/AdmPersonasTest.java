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
//    
//    public Persona(String apellido,Date fechaNacimiento,
//            String nombre, String pasaporte,String telefono, String sexo,String email, String direccion, String ciudad, 
//            Boolean estado, String pais,  String comentarios) {
//        
    
   Persona objPersonas=new Persona("AMAYA",new Date(2012,06,12),"Manuel","","4206595","Masculino","","","Lima",true,"Peru","");
   Persona objPersonas1=new Persona("VERA",new Date(2012,06,12),"Carlos","","4206595","Masculino","","","Lima",true,"Peru","");
   Persona objPersonas2=new Persona("ANGELES",new Date(2012,06,12),"Dennis","","4206595","Masculino","","","Lima",true,"Peru","");
   Persona objPersonas3=new Persona("HERRERA",new Date(2012,06,12),"Danny","","4206595","Masculino","","","Lima",true,"Peru","");

   //Tarjeta objTarjetas=new Tarjeta();
    
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
   
@After
    public void BuscarPersona(){
     
       System.out.println("Inicia busqueda de la persona");
       double contador=0;
        
//       for(int i=0; i < objTarjetas.getIndice() ; i++){
//            if(objTarjetas.getNombre()[i].equals(nombrePropietario))
//                contador=contador + objTransacciones.CalcularTotalPagar(objTarjetas.getCodigo()[i]);
//              
//        }
//            
//        System.out.println(nombrePropietario + " debe actualmente $." + contador + ".");
    }   
   
   
}