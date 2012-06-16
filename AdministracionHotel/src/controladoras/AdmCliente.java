/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Cliente;

/**
 *
 * @author manuel
 */
public class AdmCliente {
      private ArrayList<Cliente> cliente; 
      int indice=0;
      Cliente objDatos[]=new Cliente[100];
   
   public AdmCliente() {
        // Crear la coleccion de objetos GenerarCuenta
        
        cliente = new ArrayList<Cliente>();
   }
    
  public String validarDatosIncompletosCliente(String nombre,String sexo,String email, String estado,String pais)
            throws CuentaException {
        String msg = "OK";
        
        
        if (nombre=="")
        {
            msg = "\nDebe ingresar el nombre del Cliente";
        }
        if (sexo=="")
        {
            msg = "\nDebe ingresar el sexo del Cliente";
        }
        if (email=="")
        {
            msg ="\nDebe Ingresar el email del Cliente";
        }
        
        if (estado =="" )
        {
            msg ="\nDebe Ingresar el estado del Cliente";
        }
       
        if (pais=="" )
        {
            msg ="\nDebe Ingresar el pais del Cliente";
        }
       
        return msg;
    }
       
       
//     
//   public Cliente buscar(String nombre) {
//        // Buscar el tipo de habitacion por codigo
//        for(Cliente cliente : clientes)
//            if (cliente.getNombre()==nombre)
//               return cliente;
//        return null;
//    }
//           
//    
     
     
   public ArrayList<Cliente> getCliente() {
        return cliente;
 
   }

    //   public void registrarCliente(String nombre,String pasaporte,String telefono,String sexo,
//            String email, String direccion, String ciudad, String estado, String pais,
//            String comentarios)
//         throws CuentaException{
//        
//        String mensaje;
//        mensaje = validarDatosIncompletosCliente(nombre, sexo, email, estado, pais);
//        System.out.println("\nIngreso los Datos Correctos -->"+mensaje);
//            if(mensaje.equals("OK"))
//            {
//                buscarCliente(nombre);
//                cliente.add(new Cliente(nombre,pasaporte,telefono,sexo,email,direccion,ciudad,estado,pais,comentarios));
//                            }
//              
//       }
 
  
    
    
   
}