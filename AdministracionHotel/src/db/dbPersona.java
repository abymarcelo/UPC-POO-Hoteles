/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import modelos.Persona;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author manuel
 */
public class dbPersona {
      public ArrayList simulaDataPersonas(){
        ArrayList<Persona> personas = new ArrayList<Persona>();
        
        Persona Personas=new Persona("AMAYA",new Date(2012,06,12),"Manuel","","4206595","Masculino","","","Lima",true,"Peru","");
        Persona Personas1=new Persona("VERA",new Date(2012,06,12),"Carlos","","4206595","Masculino","","","Lima",true,"Peru","");
        Persona Personas2=new Persona("ANGELES",new Date(2012,06,12),"Dennis","","4206595","Masculino","","","Lima",true,"Peru","");
        Persona Personas3=new Persona("HERRERA",new Date(2012,06,12),"Danny","","4206595","Masculino","","","Lima",true,"Peru","");
        personas.add(Personas);
        personas.add(Personas1);
        personas.add(Personas2);
        personas.add(Personas3);
        
        return personas;
    }
}
