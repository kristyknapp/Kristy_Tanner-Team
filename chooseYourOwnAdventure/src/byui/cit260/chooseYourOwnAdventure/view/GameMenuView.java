/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.control.MapControl;
import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Map;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.util.Scanner;

/**
 *
 * @author kristyknapp
 */
public class GameMenuView {
    
    private static final String GAME = "\n"
            +"\n-------------------------------------------"
            +"\n|Game Menu                                |"
            +"\n-------------------------------------------"
            +"\nM - Move to New Location"
            +"\nL - Look for other Survivors"
            +"\nR - Collect Resources"
            +"\nO - Rescue Options"
            +"\nP - Sleep"
            +"\nH - Help"
            +"\nS - Save Game"
            +"\nQ - Give up and Die"
            +"\n-------------------------------------------";
    
    public void displayMenu(){
        
        char selection = ' ';
        do {
            
            System.out.println(GAME); //display the main menu
            
            String input = this.getInput();
            selection = input.charAt(0); //get the first character of the string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'Q'); //a selection is not "Exit"
        
    }
    
    public String getInput(){
        boolean valid = false; // indicates if the value has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
      while (!valid) {//while a valid value has not been retrieved
          //prompt for a value
         System.out.println("Enter your selection below");
         
         //get the value from the keyboard and trim off the blanks
         input = keyboard.nextLine();
         input = input.trim();
         
         if (input.length() < 0) {
             //display and error
             System.out.println("Invalid value - the value cannot be blank");
        }
         else {
             valid = true; //signal that valid input was entered
         }
      }
      return input; //return the input.
    }     
    
    
     public void doAction(String choice) {
            switch (choice) {
                case "M": // move to new location
                    this.displayMap();
                    MoveLocation moveLocation = new MoveLocation();
                    moveLocation.displayMenu();
                    break;
                case "L": // look for other survivors
                    FindSurvivors findSurvivors = new FindSurvivors();
                    findSurvivors.displayMenu();
                    break;
                case "R": // collect resources
                    CollectResources collectResources = new CollectResources();
                    collectResources.displayMenu();
                    break;
                case "O": // rescue options
                    RescueOptions rescueOptions = new RescueOptions();
                    rescueOptions.displayMenu();
                    break;
                case "P": // sleep
                    SleepView sleepView = new SleepView();
                    sleepView.displayMenu();
                    break;
                case "H": // display the help menu
                    HelpMenuView helpMenu = new HelpMenuView();
                    helpMenu.displayMenu();
                    break;
                case "S": //save the current game to disk
                    ProgramControl.saveGame(ChooseYourOwnAdventure.getCurrentGame());
                    break;
                case "Q": // Quit the game - finish
                    return; 
                default:
                    System.out.println("/n*** Invalid selection *** Try again");
                    break;
                    
            } 
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
