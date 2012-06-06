/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class Usuario {
    protected String codigo;
    protected  String nombre;
    protected  String telefono;
    protected  String correo;
    protected  String direccion;
    protected  String ciudad;
    protected  String estado;
    protected  String pais;

    public Usuario(String codigo, String nombre, String telefono, String correo, String direccion, String ciudad, String estado, String pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}
