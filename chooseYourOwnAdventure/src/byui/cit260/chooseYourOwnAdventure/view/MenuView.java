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
public abstract class MenuView implements ViewInterface {

    private String menu;
    
    public MenuView(String menu){
        this.menu = menu;
    }
    
    @Override
    public void display() {
        String input;
        do {
            System.out.println(this.menu); //display the main menu
            
            input = this.getInput();
           
            this.doAction(input); //do action based on selection
        } while (!input.equals("E")); //a selection is not "Exit"
    }

    @Override
    public String getInput() {
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
   }
