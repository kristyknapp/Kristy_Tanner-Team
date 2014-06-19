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
        System.out.println("/n*** createLocation stub function called");
        Location location = new Location();
        location.setDescription(locationChoice);
        
        ChooseYourOwnAdventure.setLocation(location); //save location
        
        return location;
    }

    public static String createBuildRaft(int numberLogs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
    
}
