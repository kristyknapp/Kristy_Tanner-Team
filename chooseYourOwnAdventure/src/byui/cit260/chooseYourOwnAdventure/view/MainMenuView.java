/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class MainMenuView {
    private static final String MENU = "\n"
            +"\n-------------------------------------------"
            +"\n|Main Menu                                |"
            +"\n-------------------------------------------"
            +"\nG - Start New Game"
            +"\nC - Continue Saved Game"
            +"\nH - Get Help"
            +"\nS - Save Game"
            +"\nE - Exit"
            +"\n-------------------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display the main menu
            
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
                case 'G':  //create a new game
                    GameControl.createNewGame(ChooseYourOwnAdventure.getPlayer());
                           //display the IntroChoiceView
                    IntroChoiceView introMenu = new IntroChoiceView();
                    introMenu.displayMenu();
                    break;
                case 'H': // display the help menu
                    HelpMenuView helpMenu = new HelpMenuView();
                    helpMenu.displayMenu();
                    break;
                case 'S': //save the current game to disk
                    ProgramControl.saveGame(ChooseYourOwnAdventure.getCurrentGame());
                    break;
                case 'E': // Exit the program
                    return; 
                default:
                    System.out.println("/n*** Invalid selection *** Try again");
                    break;
                    
            } 
        }
        

       
}

