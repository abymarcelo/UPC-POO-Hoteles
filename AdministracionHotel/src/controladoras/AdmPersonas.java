/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import java.util.Date;
import modelos.Persona;

/**
 *
 * @author manuel
 */
public class AdmPersonas {
     private ArrayList<Persona> personas;
     int indice=0;
     Persona objDatos[]=new Persona[100];

    public AdmPersonas() {
        personas=new ArrayList<Persona>();
    }

    public ArrayList<Persona> getPersona() {
        return personas;
    }
    
    public String validarDatosIncompletosPersona(String nombre,String apellido,String sexo,String email, Boolean estado,String pais)
            throws CuentaException {
        String msg = "OK";
        
        
        if (nombre=="")
        {
            msg = "\nDebe ingresar el nombre de la Persona";
        }
        
        if (apellido=="")
        {
            msg = "\nDebe ingresar el apellido de la Persona";
        }
        
        if (sexo=="")
        {
            msg = "\nDebe ingresar el sexo del Cliente";
        }
        if (email=="")
        {
            msg ="\nDebe Ingresar el email del Cliente";
        }
        
        if (estado ==false )
        {
            msg ="\nDebe Ingresar el estado del Cliente";
        }
       
        if (pais=="" )
        {
            msg ="\nDebe Ingresar el pais del Cliente";
        }
       
        return msg;
    }
   
    
    public void registrarPersona(String apellido,Date fechaNacimiento,
               String nombre,String pasaporte,String telefono,String sexo,
            String email, String direccion, String ciudad, Boolean estado, String pais,
            String comentarios)
         throws CuentaException{
        
        String mensaje;
        mensaje = validarDatosIncompletosPersona(nombre, apellido, sexo, email, estado, pais);
        System.out.println(mensaje);
        
        if(mensaje.equals("OK"))
            {
                BuscarPersona(nombre);
                personas.add(new Persona(apellido,fechaNacimiento,nombre,pasaporte,telefono,sexo,email,direccion,ciudad,estado,pais,comentarios));
                         }
              
       }
    
//         
//   public Persona Buscar(String nombre){
//             
//       for(Persona persona : personas)
//        for(int i=0;i<indice;i++)
//            if(nombre.equals(objDatos[i].getNombre()))
//                return persona;
//            return null;
//   } 
      
   public Persona buscar(String nombre) {
        // Buscar el tipo de habitacion por codigo
        for(Persona persona : personas)
            if (persona.getNombre()==nombre)
               return persona;
        return null;
    }
      
   
   
   public ArrayList<Persona> getPersonas() {
        return personas;
 
   }
      
    public double BuscarPersona(String nombre){
       double contador=0;
        for(int i=0;i<indice;i++)
            if(nombre.equals(objDatos[i].getNombre()))
                contador =contador+ 1;
        
        return contador;
   }
    
    public void seleccionarPersona(){
     ArrayList<Persona> persona = Persona.getPersona();
     for(int i=0;i<personas.size();i++)
         System.out.print(personas.get(i).getNombre()+"\n");
 }
}
