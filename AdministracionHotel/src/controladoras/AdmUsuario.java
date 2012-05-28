/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Usuario;

/**
 *
 * @author CARLOS
 */
public class AdmUsuario {
    
    private ArrayList<Usuario> usuarios;

    public AdmUsuario() {
        usuarios=new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
}
