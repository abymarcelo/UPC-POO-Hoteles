package modelos;

import java.util.Date;

/**
 *
 * @author manuel
 */
public class Cliente {
    private int indice=0;
    
    protected String nombre;
    protected String pasaporte;
    protected String telefono;
    protected String sexo;
    protected String email;
    protected String direccion;
    protected String ciudad;
    protected Boolean estado;
    protected String pais;
    protected String Comentarios;

    public String getComentarios() {
        return Comentarios;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getEstado() {
        return estado;
    }

    public int getIndice() {
        return indice;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    
    
     public Cliente(String nombre, String pasaporte,String telefono, String sexo,
             String email, String direccion, String ciudad, Boolean estado, String pais, 
             String Comentarios) {
        this.nombre = nombre;
        this.pasaporte=pasaporte;
        this.telefono = telefono;
        this.sexo=sexo;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado= estado;
        this.pais= pais;
        this.Comentarios=Comentarios;
    }

    public void RegistrarCliente(String nombre,String pasaporte,String telefono,String sexo,
            String email, String direccion, String ciudad, Boolean estado, String pais,
            String comentarios){
        
        boolean validador=false;
        
        //Verificar que el usuario no tenga 2 tarjeta del misnmo tipo
//        for(int i=0;i<getIndice();i++)
//               if(this.getNombre()[i].equals(nombre))
//                     if(this.getEstado()[i]==true)
//                                validador=true;
//        
        
          if(validador==false){
            this.nombre=nombre;
            this.pasaporte=pasaporte;
            this.telefono=telefono;
            this.sexo=sexo;
            this.email=email;
            this.direccion=direccion;
            this.ciudad=ciudad;
            this.estado=estado;
            this.pais=pais;
            this.Comentarios=comentarios;
            
             indice=  getIndice()+1;
            
              System.out.println( " Cliente " + this.getNombre() + " : Cliente Agregado");
          }
          else
          {
              System.out.println( " Cliente " + this.getNombre() + " : YA FUE INGRESADO");
          }
            
    }

    
}
