/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import byui.cit260.chooseYourOwnAdventure.exceptions.ProgramControlException;
import byui.cit260.chooseYourOwnAdventure.exceptions.ViewException;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class StartProgramView {

    public static void main(String[] args) {
        try {
            // create StartProgram View and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayBanner();
        } catch (Throwable e) {
            System.out.println("An abnormal error ocurred. "
                    + "Try running the program again."
                    + "\nIf the error persists try contacting support. ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void startProgram() throws ProgramControlException  {

        //Display the banner screen
        this.displayBanner();

        //Get the players name
        String playersName = this.getPlayersName();
        if (playersName == null) //user wants to quit
        {
            return; //Exit the game
        }

        //create the plater object and save it in the ProgramControl class
        Player player = ProgramControl.createPlayer(playersName);

        //Display a personalized welcome message
        this.displayWelcomeMessage(player);

        //Display the Main Menu
        RescueOptions mainMenuView = new RescueOptions();
        mainMenuView.display();

    }

    public void displayBanner() {
        System.out.println("\n\n*************************************************");
        System.out.println("*                                               *"
                + "\n* This is Choose Your Own Adventure!            *"
                + "\n* In this game, you will have to survive        *"
                + "\n* on a deserted island and stay alive long      *"
                + "\n* enough to be rescued from the island          *");

        System.out.println("*                                               *"
                + "\n* You must collect resources around the island  *"
                + "\n* and collect enough resources to be able to    *"
                + "\n* create a way to get off the island. Also, you *"
                + "\n* must eat and sleep enough to keep going. You  *"
                + "\n* will also have the options to look for other  *"
                + "\n* survivors, but you will have to provide for   *"
                + "\n* their health and rescue as well as your own.  *");
        System.out.println("*                                               *"
                + "\n* Good luck. We hope you can survive.           *"
                + "\n*                                               *");
        System.out.println("*************************************************");
    }

    public String getPlayersName() throws ProgramControlException {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the players name
            System.out.println("Enter the player's name below:");

            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            if (playersName.toUpperCase().equals("Q")) { //Quitting?
                return null;
            }
            
            if (playersName.length() < 2) {
                //display an error
                System.out.println("Invalid name - the name cannot be blank"
                                    + "and must be greater than one character");
            }
            else {
             valid = true; //signal that a valid name was entered
            }
            
            try {
                int length = playersName.length();
            }catch (StringIndexOutOfBoundsException boundsException) {
            throw new ProgramControlException("Invalid amount of characters , try again.");
            }

            
        }
        return playersName; //return the name.
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you survive the night.");
        System.out.println("==============================================");
    }

}
