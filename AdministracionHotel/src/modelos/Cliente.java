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
public class Cliente {
    private String Nombre;
    private String Enlace;

    public String getEnlace() {
        return Enlace;
    }

    public String getNombre() {
        return Nombre;
    }   

 
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEnlace(String Enlace) {
        this.Enlace = Enlace;
    }
    
    public Cliente(String Nombre, String Enlace ){
    this.Nombre=Nombre;
    this.Enlace=Enlace;    
}
    public String NombreNoExiste(){
        return "Nombre de hotel no existe";
    }
}
