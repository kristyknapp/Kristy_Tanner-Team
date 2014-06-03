/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.awt.Choice;
import java.util.Scanner;


/**
 *
 * @author kristyknapp
 */
public class IntroChoiceView {

    public void displayMenu() {
        
        // display the introduction
        this.displayIntro();
        
        //get the player's choice
         String locationChoice = this.getLocationChoice();
         if (locationChoice == null) //user wants to quit
        return; //Exit the game
    
        //create the plater object and save it in the ProgramControl class
        Location location = ProgramControl.createLocation(locationChoice);
        
        //Display the Game Menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayMenu();

    }

    
       
    public void displayIntro() {
        
        System.out.println("\n*************************************************");
        System.out.println("\n*                                               *"
                +"\n* You've boarded a plane to take you across     *"
                +"\n* the Pacific Ocean. However your plane flew    *"
                +"\n* through a violent storm and crash landed on a *"
                +"\n* deserted Island. As far as you know, you are  *"
                +"\n* the only survivor. It now all depends on the  *"
                +"\n* decisions you make now, that will determine   *"
                +"\n* if you will surivie or not. Good Luck!        *"
                +"\n*                                               *");
        
        System.out.println("\n-------------------------------------------------"
                + "\n----- \t\tYour first choice           -----"
                + "\n--   What's left of your plane is on the beach --"
                + "\n--   Will you...                               --"
                + "\n--   Stay on the beach or Move to the cliffs?  --"
                + "\n\n-------------------------------------------------");
        
        }
    
    
        public String getLocationChoice(){
        boolean valid = false; // indicates if the choice has been retrieved
        String locationChoice = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
      while (!valid) {//while a valid choice has not been retrieved
          //prompt for the players choice
         System.out.println("Enter your choice below:");
         
         //get the name from the keyboard and trim off the blanks
         locationChoice = keyboard.nextLine();
         locationChoice = locationChoice.trim();
         
         if (locationChoice.toUpperCase().equals("Q")) { //Quitting?
             return null;
         }
                 
         if (locationChoice.length() < 2) {
             //display an error
             System.out.println("Invalid choice - the choice cannot be blank");
                                       
         }
         else {
             valid = true; //signal that a valid choice was entered
         }
      }
      return locationChoice; //return the choice.
    } 
       

    
}






