/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

import byui.cit260.chooseYourOwnAdventure.model.Game;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.awt.Choice;

/**
 *
 * @author Tanner
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        System.out.println("\n**** createPlayer function called ****");
        Player player = new Player();
        player.setName(playersName);
        
        ChooseYourOwnAdventure.setPlayer(player); //save player
        
        return player;
    }

    public static void saveGame(Game currentGame) {
        System.out.println("/n*** saveGame stub function called ***");
    }

    public static Location createLocation(String locationChoice) {
         System.out.println("\n**** createLocation function called ****");
         Location location = new Location();
         location.setLocation(locationChoice);
         
         ChooseYourOwnAdventure.setLocation(location); //save Location
         
         return location;
    }
    
  
    
}