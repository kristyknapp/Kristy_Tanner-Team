/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseyourownadventure;

import byui.cit260.chooseYourOwnAdventure.model.Game;
import byui.cit260.chooseYourOwnAdventure.model.Map;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import byui.cit260.chooseYourOwnAdventure.model.Rescue;
import byui.cit260.chooseYourOwnAdventure.model.Resources;

/**
 *
 * @author kristyknapp
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Kristy");
        playerOne.setSleepPoints(28);
        playerOne.setHealthPoints(30);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        //Test code for the Game class
        Game gameOne = new Game();
        
        gameOne.setDatePlayed("March 8");
        gameOne.setTotalTime(50);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        //Test code for the Map class
        Map mapOne = new Map();
        
        mapOne.setNoRows(30);
        mapOne.setNoColumns(20);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        //Test code for the Resources class
        Resources resourcesOne = new Resources();
        
        resourcesOne.setResourcesCollected(9);
        resourcesOne.setResourceType("water");
        resourcesOne.setAmountRequired(10);
        
        String resourcesInfo = resourcesOne.toString();
        System.out.println(resourcesInfo);
        
        //Test code for the Rescue Class
        Rescue rescueOne = new Rescue();
        
        rescueOne.setRescueOptions("Create a Fire");
        rescueOne.setEnergyAvailable(40);
        rescueOne.setEnergyRequired(30);
        
        String rescueInfo = rescueOne.toString();
        System.out.println(rescueInfo);
        
        
    }
    
}
