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
    private String webHotel;
    private boolean conformidad;
    private long HoraCreacion;

    public long getHoraCreacion() {
        return HoraCreacion;
    }

    public Cuenta(String correo, String passWord, String repetirPassword, String nombreHotel,String webHotel,boolean conformidad, long HOraCreacion) {
        this.correo = correo;
        this.passWord = passWord;
        this.repetirPassword = repetirPassword;
        this.nombreHotel = nombreHotel;
         this.webHotel=webHotel;
        this.conformidad=conformidad;
        this.HoraCreacion=HoraCreacion;
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

    public String getWebHotel() {
        return webHotel;
    }
    
    
    public String getRepetirPassword() {
        return repetirPassword;
    }
    
    
}
