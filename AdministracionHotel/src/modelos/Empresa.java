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
    private String identificacion;
    private String contacto;
    private String metodoPago;
    private String convenio;

    public Empresa(String codigo, String nombre,String identificacion, String telefono, String correo, String direccion, String ciudad, String estado, String pais, String contacto, String metodoPago, String convenio) {
        super(codigo, nombre, telefono, correo, direccion, ciudad, estado, pais);
        this.contacto = contacto;
        this.metodoPago = metodoPago;
        this.convenio = convenio;
        
    }
}
