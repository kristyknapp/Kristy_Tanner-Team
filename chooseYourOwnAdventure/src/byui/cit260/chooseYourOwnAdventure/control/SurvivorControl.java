/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;

/**
 *
 * @author kristyknapp
 */
public class SurvivorControl {
        public boolean addSurvivorToResource() {

        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for Survivors */
        Resource survivor = GameControl.getGame().getResources()[GameControl.SURVIVORS];

        //Search Resource List Function
        try {
            boolean success = ResourceControl.addResourceToPlayer("survivors");
            if (success) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Invalid Value Entered");
        }
        return false;

    }
}
