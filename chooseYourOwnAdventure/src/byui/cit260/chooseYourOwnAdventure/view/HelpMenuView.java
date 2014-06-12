/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.model.Resource;
import static java.awt.SystemColor.MENU;
import java.util.Scanner;

/**
 *
 * @author kristyknapp
 */
public class HelpMenuView {
    private static final String HELP = "\n"
            +"\n-------------------------------------------"
            +"\n|Help Menu                                |"
            +"\n-------------------------------------------"
            +"\nA - What is the goal of the game?          "
            +"\nN - Scenarios                              "
            +"\nR - Resources                              "
            +"\nE - Exit                                   "
            +"\n-------------------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(HELP); //display the main menu
            
            String input = this.getInput();
            selection = input.charAt(0); //get the first character of the string
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //a selection is not "Exit"
        
        
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
    
        public void doAction(char choice) {
            switch (choice) {
                case 'A': // display the goals of the game
                    HelpGoalsView helpGoals = new HelpGoalsView();
                    helpGoals.displayMenu();
                    break;
                case 'N': // display the different scenarios
                    ScenariosView scenariosView = new ScenariosView();
                    scenariosView.displayMenu();
                    break;
                case 'R': //display the different resources
                    ResourcesView resourcesView = new ResourcesView();
                    resourcesView.displayResources();
                    break;
                case 'E': // Exit the program
                    return; 
                default:
                    System.out.println("/n*** Invalid selection *** Try again");
                    break;
                    
            } 
        }

}
