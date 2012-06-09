/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Agencia;
import modelos.Empresa;

/**
 *
 * @author CARLOS
 */
public class AdmEmpresa {
    
    private ArrayList<Empresa>empresas;

     public AdmEmpresa() {
        empresas=new ArrayList<Empresa>();
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    
     
      public void registrarEmpresa(String codigo, String nombre,String telefono,String correo, String direccion, String ciudad, String estado, String pais){
       buscarEmpresa(codigo);
       Empresa empresa=new Empresa(codigo,nombre,telefono,correo,direccion,ciudad,estado,pais);
       empresas.add(empresa);
    }
      
      private void buscarEmpresa(String codigo)throws RuntimeException{
        for(Empresa empresa:empresas){
            if(empresa.getCodigo().equals(codigo))
                throw new RuntimeException("CODIGO YA REGISTRADO");         
        }
    
      }

}