/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admhotel.db;

import modelos.Habitacion;
import modelos.Hotel;
import java.util.ArrayList;

/**
 *
 * @author Fam Herrera
 */
public class dbHabitacion {
    public ArrayList simulaDataHabitaciones(){
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
        Habitacion habitacion1 = new Habitacion("Marriot","105","Simple","Pending");
        Habitacion habitacion2 = new Habitacion("Marriot","106","Matrimonial","Confirmed");
        Habitacion habitacion3 = new Habitacion( "Marriot","107","Doble","Check In");
        Habitacion habitacion4 = new Habitacion("Marriot","108","Suite","Confirmed");
        Habitacion habitacion5 = new Habitacion( "Marriot","109","Doble","Check In");
        habitaciones.add(habitacion1);
        habitaciones.add(habitacion2);
        habitaciones.add(habitacion3);
        habitaciones.add(habitacion4);
        habitaciones.add(habitacion5);
        return habitaciones;
    }
}
