/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class Agencia extends Usuario{

    private String contacto;
    private String identificacion;  
    public Agencia(String codigo, String nombre,String identificaion,String telefono, String correo, String direccion, String ciudad, String estado, String pais, String contacto) {
        super(codigo, nombre, telefono, correo, direccion, ciudad, estado, pais);
        this.contacto = contacto;

    }
    
}
