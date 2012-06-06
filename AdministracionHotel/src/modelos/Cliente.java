/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS 
 * @modificado Manuel
 */
public class Cliente extends Usuario{
    private String apellido;
    private String pasaporte;
    private String sexo;
    private String cumpleaños;
    private String comentarios;

    public Cliente(String apellido, String pasaporte, String sexo, String cumpleaños, String comentarios, String codigo, String nombre, String telefono, String correo, String direccion, String ciudad, String estado, String pais) {
        super(codigo, nombre, telefono, correo, direccion, ciudad, estado, pais);
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.sexo = sexo;
        this.cumpleaños = cumpleaños;
        this.comentarios = comentarios;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
