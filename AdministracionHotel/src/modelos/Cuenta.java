/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class Cuenta {
    private String correo;
    private String passWord;
    private String repetirPassword;
    private String nombreHotel;
    private String webCorreo;
    private boolean conformidad;

    public Cuenta(String correo, String passWord, String repetirPassword, String nombreHotel,String webCorreo,boolean conformidad) {
        this.correo = correo;
        this.passWord = passWord;
        this.repetirPassword = repetirPassword;
        this.nombreHotel = nombreHotel;
         this.webCorreo=webCorreo;
        this.conformidad=conformidad;
    }

    public boolean isConformidad() {
        return conformidad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getWebCorreo() {
        return webCorreo;
    }
    
    
    public String getRepetirPassword() {
        return repetirPassword;
    }
    
    
}
