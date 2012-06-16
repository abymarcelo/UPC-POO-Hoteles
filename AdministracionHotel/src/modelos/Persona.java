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
public class Persona extends Cliente{
    private int indice=0;

    private String apellido;
    private Date fechaNacimiento;
    
    
        public Persona(String apellido,Date fechaNacimiento,
            String nombre, String pasaporte,String telefono, String sexo,String email, String direccion, String ciudad, 
            Boolean estado, String pais,  String comentarios) {
        super(nombre, pasaporte, telefono,sexo, email, direccion, ciudad, estado, pais, comentarios);
        
        this.apellido=apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

        
        public int getIndice() {
        return indice;
    }

    
        
    
}
