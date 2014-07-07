/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import java.util.Scanner;

/**
 *
 * @author Tanner
 *
**/

public class BuildRaftView extends MenuView{

    private int numberLogs;

    public BuildRaftView() {
        super("\n-----------------------------------------------------------"
                + "\n|Build a Raft                                              "
                + "\n-----------------------------------------------------------"
                + "\n In order to get off the island, you must collect enough   "
                + "\n resources to build a raft. 1/2x6 logs are needed to create  "
                + "\n a large enough raft to float you and other survivors.     "
                + "\n One person requires at least a 3x6 raft.                  "
                + "\n Two people require at least a 3x12 raft.                  "
                + "\n Three people require ate least a 3x18 raft.               "
                + "\n-----------------------------------------------------------"
                + "\n Please enter the ammount of logs you have to build your raft. "
                + "\n Remember, you must have at least 6 logs if it is only you,    "
                + "\n 12 logs if it's you an another survivor,                      "
                + "\n and 18 logs if you have two others with you.                  "
                + "\n\n-------------------------------------------------------------");
    }

    public void displayMenu() {

        // display the introduction
        this.displayIntro();

        //create the plater object and save it in the ProgramControl class
        //CALL FUNCTION TO CALCULATE/LAUNCH RAFT IN THE RESCUE OPTIONS VIEW.

        //Display the Game Menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayMenu();
    }

    public void displayIntro() {
        System.out.println(
                "\n-----------------------------------------------------------"
                + "\n|Build a Raft                                              "
                + "\n-----------------------------------------------------------"
                + "\n In order to get off the island, you must collect enough   "
                + "\n resources to build a raft. 1/2x6 logs are needed to create  "
                + "\n a large enough raft to float you and other survivors.     "
                + "\n One person requires at least a 3x6 raft.                  "
                + "\n Two people require at least a 3x12 raft.                  "
                + "\n Three people require ate least a 3x18 raft.               "
                + "\n-----------------------------------------------------------"
                + "\n Please enter the ammount of logs you have to build your raft. "
                + "\n Remember, you must have at least 6 logs if it is only you,    "
                + "\n 12 logs if it's you an another survivor,                      "
                + "\n and 18 logs if you have two others with you.                  "
                + "\n\n-------------------------------------------------------------");
    }
    @Override
    public String getInput() {
        boolean valid = false; // indicates if the choice has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid choice has not been retrieved
            //prompt for the players choice
            System.out.println("Enter ammount of logs collected below:");

            //get the value from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() == 0) //No input entered
            {
                return "Please enter number of logs you have!";
            } else if (input.length() > 6) //Not enough logs, display an error
            {
                return "You do not have enough logs!";
            } else //signal that a valid choice was entered
            {
                return "You have enough logs!";
            }
        }
        return "";
    }

    @Override
    public boolean doAction(String value) {
        //create the plater object and save it in the ProgramControl class
       int numberLogs = Integer.parseInt(value);
        String buildRaftMessage = ProgramControl.createBuildRaft(numberLogs);
        System.out.println(buildRaftMessage);
        
        return true;
        
    }
}
