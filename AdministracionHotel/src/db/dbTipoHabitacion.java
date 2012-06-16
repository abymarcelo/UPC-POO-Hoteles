/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import modelos.Habitacion;
import modelos.TipoHabitacion;
import java.util.ArrayList;

/**
 *
 * @author Fam Herrera
 */
public class dbTipoHabitacion {
    public ArrayList simulaDataTipoHabitaciones(){
        ArrayList<TipoHabitacion> tipohabitaciones = new ArrayList<TipoHabitacion>();
        TipoHabitacion tipohabitacion1 = new TipoHabitacion("Simple",150.00,"Soles");
        TipoHabitacion tipohabitacion2 = new TipoHabitacion("Matrimonial",100.00,"Dolar");
        TipoHabitacion tipohabitacion3 = new TipoHabitacion( "Doble",90,"Euro");
        tipohabitaciones.add(tipohabitacion1);
        tipohabitaciones.add(tipohabitacion2);
        tipohabitaciones.add(tipohabitacion3);
        return tipohabitaciones;
    }
}
