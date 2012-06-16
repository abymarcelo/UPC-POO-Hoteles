/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Empresa;

/**
 *
 * @author manuel
 */
public class AdmEmpresa {
    private ArrayList<Empresa> empresas;
    int indice=0;
    Empresa objDatos[]=new Empresa[100];

    public AdmEmpresa() {
        empresas=new ArrayList<Empresa>();
    }

    public ArrayList<Empresa> getEmpresa() {
        return empresas;
    }
    
     public String validarDatosEmpresa(String identificacion,String contacto,
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
        
        if (estado ==false)
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
   
    
     public void registrarEmpresa(String identificacion,String contacto,String metodoPago, String convenio,
                String nombre,String pasaporte,String telefono,String sexo,
            String email, String direccion, String ciudad, Boolean estado, String pais,
            String comentarios)   throws CuentaException{
            
        String mensaje;
        mensaje = validarDatosEmpresa(identificacion,contacto,nombre,direccion,ciudad,estado,pais);
            System.out.println(mensaje);
        if(mensaje.equals("OK"))
            {
            BuscarEmpresa(nombre);
            Empresa empresa=new Empresa(identificacion,contacto,metodoPago, convenio,nombre,pasaporte,telefono,sexo,email,direccion,ciudad,estado,pais,comentarios);
            empresas.add(empresa);

         
       }
   }
//        
//   public Empresa Buscar(String nombre){
//             
//       for(Empresa empresa : empresas)
//        for(int i=0;i<indice;i++)
//            if(nombre.equals(objDatos[i].getNombre()))
//                return empresa;
//            return null;
//   } 
//      
   public Empresa buscar(String nombre) {
        // Buscar el tipo de habitacion por codigo
        for(Empresa empresa : empresas)
            if (empresa.getNombre()==nombre)
               return empresa;
        return null;
    }
          
      
      
     public double BuscarEmpresa(String nombre){
       double contador=0;
        for(int i=0;i<indice;i++)
            if(nombre.equals(objDatos[i].getNombre()))
                contador =contador+ 1;
        return contador;
   } 
//    private void buscarEmpresa(String nombre)throws RuntimeException{
//        for(Empresa empresa:empresas){
//            if(empresa.getNombre().equals(nombre))
//                throw new RuntimeException("EMPRESA YA REGISTRADO");         
//        }
//    }
}
