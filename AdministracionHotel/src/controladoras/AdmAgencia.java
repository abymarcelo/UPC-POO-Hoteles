/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Agencia;

/**
 *
 * @author Erika Gina
 */
public class AdmAgencia {
     private ArrayList<Agencia> agencias;
     
          public AdmAgencia() {
        agencias=new ArrayList<Agencia>();
    }

    public ArrayList<Agencia> getAgencia() {
        return agencias;
    }

    public String validarDatosIncompletosAgencia(String identificacion,String contacto,
            String nombre, String direccion, String ciudad, 
            Boolean estado, String pais)
            throws CuentaException {
        String msg = "OK";
        if (identificacion=="")
        {
            msg = "\nDebe ingresar la identificacion de la Agencia";
        }
        if (contacto=="")
        {
            msg = "\nDebe ingresar el contacto de la Agencia";
        }
        if (nombre=="")
        {
            msg ="\nDebe Ingresar el nombre de la Agencia";
        }
        
        if (estado ==false )
        {
            msg ="\nDebe Ingresar el estado de la Agencia";
        }
       
        if (pais=="" )
        {
            msg ="\nDebe Ingresar el pais de la Agencia";
        }
        
        if (direccion=="" )
        {
            msg ="\nDebe Ingresar la direccion de la Agencia";
        }
        if (ciudad=="" )
        {
            msg ="\nDebe Ingresar la ciudad de la Agencia";
        }
       
        return msg;
    }

     public void registrarAgencia(String identificacion,String contacto,
                String nombre,String pasaporte,String telefono,String sexo,
            String email, String direccion, String ciudad, Boolean estado, String pais,
            String comentarios)
        throws CuentaException{
            
        String mensaje;
        mensaje = validarDatosIncompletosAgencia(identificacion,contacto,nombre,direccion,ciudad,estado,pais);
            if(mensaje.equals("OK"))
            {
            buscarAgencia(nombre);
            agencias.add(new Agencia(identificacion,contacto,nombre,pasaporte,telefono,sexo,email,direccion,ciudad,estado,pais,comentarios));                }
            System.out.println(mensaje);
         
       }
     
    
//   public Agencia Buscar(String nombre){
//             
//       for(Agencia agencia : agencias)
//        for(int i=0;i<indice;i++)
//            if(nombre.equals(objDatos[i].getNombre()))
//                return agencia;
//            return null;
//   } 
//    
        
    public Agencia buscar(String nombre) {
        // Buscar el tipo de habitacion por codigo
        for(Agencia agencia : agencias)
            if (agencia.getNombre()==nombre)
               return agencia;
        return null;
    }
        
    private void buscarAgencia(String nombre)throws RuntimeException{
        for(Agencia agencia:agencias){
            if(agencia.getNombre().equals(nombre))
                throw new RuntimeException("AGENCIA YA REGISTRADO");         
        }
    }
    
    

}
