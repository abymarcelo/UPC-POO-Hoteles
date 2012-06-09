/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Cliente;


/**
 *
 * @author CARLOS
 */
public class AdmCliente {
    
    private ArrayList<Cliente> clientes;

    public AdmCliente() {
        clientes=new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    

    
    
    public void registrarCliente(String codigo, String nombre,String apellido,String pasaporte,String telefono,String sexo,String correo, String direccion, String ciudad, String estado, String pais,String cumpleaños,String comentarios){
       buscarCuenta(correo);
       Cliente cliente=new Cliente(codigo,nombre,apellido,pasaporte,telefono,sexo,correo,direccion,ciudad,estado,pais,cumpleaños,comentarios);
       clientes.add(cliente);
    }
    
    private void buscarCuenta(String correo)throws RuntimeException{
        for(Cliente cliente:clientes){
            if(cliente.getCorreo().equals(correo))
                throw new RuntimeException("CORREO ELECTRONICO YA REGISTRADO");         
        }
    }
    
    
    
    public boolean verificarCorreo(String correo){
        if(correo!=null){
            return true;
        }
          return false;
    }
    
    
}
