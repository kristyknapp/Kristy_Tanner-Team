/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.control.ResourceControl;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.util.ArrayList;

/**
 *
 * @author kristyknapp
 */
public class FindSurvivors extends MenuView {

    public FindSurvivors() {
        super("Searching for Survivors in your Location..."
                + "Do you want to take care of them? (Y or N)");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "Y": // Add survivor to resources
                this.addSurvivorToResource();
                return true;
            case "N": // Quit the game - finish
                return true;
            default:
                System.out.println("/n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }


    public boolean addSurvivorToResource() {

        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for Survivors */
        Resource survivor = GameControl.getGame().getResources()[GameControl.SURVIVORS];

        //Search Resource List Function
        boolean success = ResourceControl.addResourceToPlayer("survivors");
        if (success) {
            System.out.println("Survivor added to player.");
            return true;
        } else {
            System.out.println("There are no survivors in this location.");
            return false;
        }

    }

}
