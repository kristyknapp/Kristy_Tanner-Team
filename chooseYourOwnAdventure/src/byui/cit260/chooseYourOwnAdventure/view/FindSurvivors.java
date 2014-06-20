/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.util.ArrayList;

/**
 *
 * @author kristyknapp
 */
public class FindSurvivors extends MenuView{

    public FindSurvivors() {
        super("Searching for Survivors in your Location..."
            + "Do you want to take care of them? (Y or N)");
    }

    @Override
    public boolean doAction(String value) {
        
        Location location = ChooseYourOwnAdventure.getLocation();
        
        /*Get resources in Location
                Search resource list for Survivors */
        Resource survivors = GameControl.getGame().getResources()[GameControl.SURVIVORS];
        //Search Resource List Function
        
        if(location.findResource(survivors) != null) {
            ArrayList<Resource> playerResources = ChooseYourOwnAdventure.getPlayer().getResources();
            playerResources.add(survivors);
            return true;
        } else if(location.findResource(survivors) == null) {
            System.out.println("There are no survivors in this location.");
            return true;
        } else {
            return false;
        } 
    }
 
}
