/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 * @modificado por Manuel
 */
public class Empresa extends Usuario{
    
    private String contacto;
    private String metodoPago;
    private String convenio;

    public Empresa(int identificacion, String contacto, String metodoPago, String convenio, String codigo, String nombre, String telefono, String correo, String direccion, String ciudad, String estado, String pais) {
        super(codigo, nombre, telefono, correo, direccion, ciudad, estado, pais);
        this.contacto = contacto;
        this.metodoPago = metodoPago;
        this.convenio = convenio;
        
    }
}
