/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.exceptions.ChooseYourOwnAdventureException;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import java.util.Scanner;

/**
 *
 * @author kristyknapp
 */
class MoveLocation {
    public void displayMenu() {
        System.out.println("*** MoveLocation displayMenu for GameMenuView stub function called ***");
    }
    
    /*public static void chosenAmount(Resource resource, double quantityInStock) 
            throws ChooseYourOwnAdventureException {
        Resource[] amount = GameControl.game.getResources();
        
        if( quantityInStock < 0 || quantityInStock > 5) {
            throw new ChooseYourOwnAdventureException("Invalid amount entered");
        }
        
}

    
    public Resource chooseAmountResource() {
        System.out.println("Enter the amount for the resource.");
        String value = this.getInput();
        value = value.trim().toUpperCase();
        if (value.equals("Q")) {
            return null;

            String[] values = value.split(" ");

            if (values.length < 0) {
                System.out.println("You must enter a positive number");
            }
            
            

            
        }

        return null;

    }

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
            } else {
                valid = true; //signal that valid input was entered
            }
        }
        return input; //return the input.
    } */
}
