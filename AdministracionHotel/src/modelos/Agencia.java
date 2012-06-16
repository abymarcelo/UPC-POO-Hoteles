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
public class Agencia extends Cliente {
    private String identificacion;
    private String contacto;
    
    
        public Agencia(String identificacion,String contacto,
            String nombre, String pasaporte,String telefono, String sexo,String email, String direccion, String ciudad, 
            Boolean estado, String pais,  String comentarios) {
        super(nombre, pasaporte, telefono,sexo, email, direccion, ciudad, estado, pais, comentarios);
        this.identificacion=identificacion;
        this.contacto=contacto;
        
    }

    public String getContacto() {
        return contacto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String MensajeAgenciaCreada(){
        return ("Cuenta creada con exito");
    }   
     
   
}
