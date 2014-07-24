/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import chooseyourownadventure.ChooseYourOwnAdventure;

/**
 *
 * @author kristyknapp
 */
public class GameMenuView extends MenuView {
   

    public GameMenuView() {
        super("\n"
            +"\n-------------------------------------------"
            +"\n|Game Menu                                |"
            +"\n-------------------------------------------"
            +"\nM - Move to New Location"
            +"\nL - Look for other Survivors"
            +"\nR - Collect Resources"
            +"\nO - Rescue Options"
            +"\nP - Sleep"
            +"\nC - Check Health"
            +"\nH - Help"
            +"\nS - Save Game"
            +"\nQ - Give up and Die"
            +"\n-------------------------------------------");
    }
    
    @Override
     public boolean doAction(String choice) {
            switch (choice) {
                case "M": // move to new location
                    this.displayMap();
                    LocationView locationView = new LocationView();
                    locationView.display();
                    break;
                case "L": // look for other survivors
                    FindSurvivors findSurvivors = new FindSurvivors();
                    findSurvivors.display();
                    break;
                case "R": // collect resources
                    CollectResources collectResources = new CollectResources();
                    collectResources.display();
                    break;
                case "O": // rescue options
                    RescueOptions rescueOptions = new RescueOptions();
                    rescueOptions.displayMenu();
                    break;
                case "P": // sleep
                    SleepView sleepView = new SleepView();
                    sleepView.displayMenu();
                    break;
                case "C": // check health
                    HealthView healthView = new HealthView();
                    healthView.display();
                    break;
                case "H": // display the help menu
                    HelpMenuView helpMenu = new HelpMenuView();
                    helpMenu.displayMenu();
                    break;
                case "S": //save the current game to disk
                    ProgramControl.saveGame(ChooseYourOwnAdventure.getCurrentGame());
                    break;
                case "Q": // Quit the game - finish
                    return true; 
                default:
                    System.out.println("/n*** Invalid selection *** Try again");
                    break;
                    
            } 
            
            return false;
        }
     

     
        public void displayMap() {
         //get the map for the game
         Location[][] locations = GameControl.getMapLocations();
         int i = 0;
         System.out.println("---------------------------------------------");
         System.out.println("|\t\tGame Map                   |");
         System.out.println("---------------------------------------------");
         
         
         //display every location in the map
        for (int row = 0; row < locations.length; row++) {
            System.out.println("---------------------------------------------");
            
             for (int column = 0; column < locations[row].length; column++) {
                 Location location = locations[row][column];
                 System.out.print("|" + location.getDescription() + "\t\t");
             }
              System.out.print("|\n"); //print last colum divider   
             }
        System.out.println("---------------------------------------------");
     }

}
