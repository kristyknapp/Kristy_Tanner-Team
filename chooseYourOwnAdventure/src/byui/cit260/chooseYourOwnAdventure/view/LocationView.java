/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import static byui.cit260.chooseYourOwnAdventure.control.GameControl.game;
import byui.cit260.chooseYourOwnAdventure.control.MapControl;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Map;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.awt.Point;
import static java.awt.SystemColor.MENU;
import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class LocationView extends MenuView {
    private String getinput;

    public LocationView() {
        super("Where do you want to go?"
             +"Enter in the coordinates...ex: 1 0");
    }
    
    @Override
    public boolean doAction(String choice) {
        switch (choice) {
            case "P": // Move Player Plane Crash Site
                MapControl.movePlayer(MapControl.PLANE_CRASH_LOCATION);
                break;
            case "T": //Move Player to the Tree line
                MapControl.movePlayer(MapControl.TREELINE_LOCATION);
                break;
            case "O": //move player to the ocean
                MapControl.movePlayer(MapControl.OCEAN_LOCATION);
                break;
            case "S": // move player to shelter
                MapControl.movePlayer(MapControl.SHELTER_LOCATION);
                break;
            case "J": //move player to the Jungle
                MapControl.movePlayer(MapControl.JUNGLE_LOCATION);
                break;
            case "L": //move player to the Cliff Tops
                MapControl.movePlayer(MapControl.CLIFF_TOPS_LOCATION);
                break;
            case "A": // Move player to the stream
                MapControl.movePlayer(MapControl.STREAM_LOCATION);
                break;
            case "V": // move player to the cave
                MapControl.movePlayer(MapControl.CAVE_LOCATION);
                break;
            case "E": // "Stay Where I Am (Exit)"
                return true;
            default:
                System.out.println("/n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }
    
    public static String chooseMapLocations() {
        
        Map map = ChooseYourOwnAdventure.getMap();
        String menu;
        if (map != MapControl.createCliffMap()) {
            menu ="\n\n"
            +"\n-------------------------------------------"
            +"\n|Choose New Location                      |"
            +"\n-------------------------------------------"
            +"\nP - Plane Crash Site"
            +"\nT - Tree Line"
            +"\nO - Ocean"
            +"\nS - Shelter"
            +"\nE - Stay in Current Location"
            +"\n--------------------------------------------";
        } else {
            menu = "\n\n"
            +"\n-------------------------------------------"
            +"\n|Choose New Location                      |"
            +"\n-------------------------------------------"
            +"\nJ - Jungle"
            +"\nL - Cliff Tops"
            +"\nA - Stream"
            +"\nV - Cave"
            +"\nE - Stay in Current Location"
            +"\n-------------------------------------------";
        }
        return menu;
    }
}
