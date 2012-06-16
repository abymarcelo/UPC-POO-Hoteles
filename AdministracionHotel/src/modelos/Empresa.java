/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.Date;

/**
 *
 * @author manuel
 */
public class Empresa extends Cliente {
    private String identificacion;
    private String contacto;
    private String metodoPago;
    private String convenio;
    
    public Empresa(String identificacion,String contacto, String metodoPago, String convenio,
            String nombre, String pasaporte,String telefono, String sexo,String email, String direccion, String ciudad, 
            Boolean estado, String pais, String comentarios) {
        super(nombre, pasaporte, telefono,sexo, email, direccion, ciudad, estado, pais,comentarios);
        this.identificacion=identificacion;
        this.contacto=contacto;
        this.metodoPago=metodoPago;
        this.convenio=convenio;
    }

    public String getContacto() {
        return contacto;
    }

    public String getConvenio() {
        return convenio;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }


}
