/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import static java.awt.SystemColor.MENU;
import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class LocationView {
    private static final String Location = "\n"
            +"\n-------------------------------------------"
            +"\n|Location Menu                            |"
            +"\n-------------------------------------------"
            +"\n Where do you want to go?                  "
            +"\nN - Move To A New Location                 "
            +"\nE - Stay Where I'm At(Exit)                "
            +"\n-------------------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(Location); //display main menu
            
            String input = this.getInput();
            selection = input.charAt(0); //get first character of string
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
                case 'N': // display the goals of the game
                    LocationView Location = new LocationView();
                    Location.displayMenu();
                    break;
                case 'E': // "Stay Where I Am (Exit)"
                    return; 
                default:
                    System.out.println("/n*** Invalid selection *** Try again");
                    break;
                    
            } 
        }

}