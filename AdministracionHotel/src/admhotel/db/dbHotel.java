/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import modelos.Hotel;
import java.util.ArrayList;

/**
 *
 * @author Fam Herrera
 */
public class dbHotel {
    public ArrayList simulaDataHoteles(){
        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        Hotel hotel1 = new Hotel("Marriot", 16);
        Hotel hotel2 = new Hotel("Sheraton", 2);
        Hotel hotel3 = new Hotel( "Melia", 6);
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        return hotels;
    }
    
}
