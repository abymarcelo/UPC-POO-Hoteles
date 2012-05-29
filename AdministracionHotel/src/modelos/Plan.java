package modelos;

/**
 *
 * @author Manuel
 */
public class Plan {
    
     private String Nombre;
     private boolean Estado;
     private Cliente cliente;

     public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public Plan(boolean Estado){
        this.Estado=Estado;//.Nombre=Nombre;
}
     
    public String TipoPlan(){
        return "Plan Gratuito";//.Nombre=Nombre;
}

}
