/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import byui.cit260.chooseYourOwnAdventure.control.RescueControl;
import byui.cit260.chooseYourOwnAdventure.control.ResourceControl;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kristyknapp
 */
class CollectResources extends MenuView {

    public CollectResources() {
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Resources                               |"
                + "\n-------------------------------------------"
                + "\nL - Logs"
                + "\nW - Water"
                + "\nF - Food"
                + "\nR - Rocks"
                + "\nV - Vines"
                + "\nS - Sleep"
                + "\nE - Exit"
                + "\n-------------------------------------------"
                + GameControl.getTotalPlayerResources() 
                + "\nSearching for Resources in your Location...");
    }


    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "L": // Logs
                this.addResource(GameControl.LOGS);
                break;
            case "W": // Water
                this.addResource(GameControl.WATER);
                break;
            case "F": // Food
                this.addResource(GameControl.FOOD);
                break;
            case "R": //Rocks
                this.addResource(GameControl.ROCKS);
                break;
            case "V": //Vines
                this.addResource(GameControl.VINES);
                break;
            case "S": //Sleep
                this.addResource(GameControl.SLEEP);
                break;
            case "E": // Exit this menu
                return true;
            default:
                System.out.println("/n*** Invalid selection *** Try again");
                break;

        }

        return false;
    }
    
   public boolean addResource(int resourceType) {

        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for resources */
        Resource resource = GameControl.getGame().getResources()[resourceType];
        String description = resource.getDescription();
        
        //Search Resource List Function
        try {
           boolean success = ResourceControl.addResourceToPlayer(description);
        if (success) {
            System.out.println(description + " added to Player Resources.");
            return true;
        }
        else {
            System.out.println("No " + description + " found in this location.");
            return false;
        } 
        }catch (Exception e) {
                System.out.println("Invalid Letter Entered");
                } 
        return false;
        
            

    }

}
