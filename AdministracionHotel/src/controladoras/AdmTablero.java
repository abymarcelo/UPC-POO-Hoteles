
package controladoras;

import java.util.ArrayList;
import java.util.Calendar;
import modelos.Habitacion;

//


public class AdmTablero {
    Calendar hoy;
    public void capturarFecha(Calendar fecha){
//        if (fecha.equals(null))
            hoy = fecha;
//        else{
//             return hoy;
//        }
           
//        return fecha;
    }
    
    public boolean VerificarFechaPorSemana(int vista,String fecha){
        boolean a=false;
        String[] fechas=AjustarTableroPorSemana(vista);
        for (int i=0;i<fechas.length;i++){
             if (fechas[i].equals(fecha))
                a=true;
        }
       return a;
    }
    
   
    public String[] AjustarTableroPorSemana(int vista){
//        Calendar hoy = capturarFecha();
        if (hoy==null)
            hoy=Calendar.getInstance();
              
        int i=0;
        switch(vista){
            case 1:                      
                i=7;
                break;
            case 2: 
                i=14; 
                break;
            case 3:
                i=21;
                break;
            case 4:
                i=31;
                break;
        }
       
        String fechasDisponibles[]=new String [i];
        hoy.add(Calendar.DATE,-2);
        for (int a=-1;a<i-1;a++){
            int dia,mes,anio;
            hoy.add(Calendar.DATE,1);
            dia=hoy.get(Calendar.DATE);
            mes=hoy.get(Calendar.MONTH);
            anio=hoy.get(Calendar.YEAR);
            
            String fecha=dia+"/"+(mes+1)+"/"+anio;
            fechasDisponibles[a+1]=fecha;
          }
//        for (int c=0;c<fechasDisponibles.length;c++){
//             System.out.print(fechasDisponibles[c]+"\n");
//         }
        
        return fechasDisponibles;
    }

    
    public boolean VerificarFechaPorMes(int opcion,int vista,String fecha){
     boolean a=false;
        String[] fechas=AjustarTableroPorMes(opcion, vista);
        for (int i=0;i<fechas.length;i++){
             if (fechas[i].equals(fecha))
                a=true;
        }
       return a;
       
    }
    
      public String[] AjustarTableroPorMes(int opcion,int vista){
//        Calendar hoy = capturarFecha();
          if (hoy==null)
            hoy=Calendar.getInstance();
        int i=0;
        int p=0;
        switch(vista){
            case 1: //una semana                     
                i=7;
                p=7;
                break;
            case 2: //Dos semanas
                i=14; 
                p=14;
                break;
            case 3://Tres semanas
                i=21;
                p=21;
                break;
            case 4://Un mes
                i=31;
                p=31;
                break;
        }
       
        String fechasDisponibles[]=new String [i];
        switch(opcion){
            case -1:
                p=p*(-1);
                break;
            case 0: 
                p=0; 
                break;
            case 1:
                p=p;
                break;
        }
        
        hoy.add(Calendar.DATE,p);
        hoy.add(Calendar.DATE,-2);
        for (int a=-1;a<i-1;a++){
            int dia,mes,anio;
            hoy.add(Calendar.DATE,1);
            dia=hoy.get(Calendar.DATE);
            mes=hoy.get(Calendar.MONTH);
            anio=hoy.get(Calendar.YEAR);
            
            String fecha=dia+"/"+(mes+1)+"/"+anio;
            fechasDisponibles[a+1]=fecha;
          }
//        for (int c=0;c<fechasDisponibles.length;c++){
//             System.out.print(fechasDisponibles[c]+"\n");
//         }
//        if (p==-1)
            
        
        return fechasDisponibles;
    }
    
    
  public void seleccionarReserva(){
     ArrayList<Habitacion> habitaciones = Habitacion.getHabitacion();
     for(int i=0;i<habitaciones.size();i++)
         System.out.print(habitaciones.get(i).getNombreHabitacion()+"\n");
 }
    
    
}
