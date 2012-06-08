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
   

    public Cuenta(String correo, String passWord, String repetirPassword, String nombreHotel,String webHotel,boolean conformidad) {
        this.correo = correo;
        this.passWord = passWord;
        this.repetirPassword = repetirPassword;
        this.nombreHotel = nombreHotel;
         this.webHotel=webHotel;
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

    public String getWebHotel() {
        return webHotel;
    }
    
    
    public String getRepetirPassword() {
        return repetirPassword;
    }
    
     public boolean isMailCorrecto(String correo){
        char c1 = correo.charAt(0);
        int pos1 = 0;
        int pos2 = 0;
        int cont=0;
            
        if (c1 !='@'&&c1!='.'){
            for (int i=1; i < correo.length(); i++) {
                if (correo.charAt(i) == '@') {
                    pos1 = i;
                    cont++;
                }
            }
            for (int i=1; i < correo.length(); i++) {
                if (correo.charAt(i) == '.') {
                    pos2 = i;
                }
            }
         }
         if (pos1!=0&&pos2!=0&&cont==1){
              return true;
              }
         else
              return false;
     }
    
     public void MostrarNombresSugeridos(String nombre){
         System.out.println(nombre+"Hotel");
         System.out.println("Hotel-"+nombre);
         System.out.println(nombre+"-Hotel");
         System.out.println(nombre+"-Perú");
         System.out.println("Hotel-"+nombre+"-Perú");
     }
     
     public String MensajeCuentaRegistrada(){
         return ("Cuenta Registrada con Exito \n Tiene 24 horas para confirmar el mail y tiene un plan gratuito");
     }
}
