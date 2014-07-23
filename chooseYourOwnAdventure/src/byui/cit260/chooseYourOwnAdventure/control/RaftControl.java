/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

import byui.cit260.chooseYourOwnAdventure.exceptions.RaftControlException;
import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class RaftControl {
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

            if (input.length() < 6) 
            {
                return "You have enough logs!";
                    /*Start RescueControl, display random outcome.*/
            
            else (input.length() > 6)}//signal that a valid, but low choice was entered
            {
                return "You do not have enough logs! Please get some more.";
            }

    public RaftControl(String value) {
        //create the player object and save it in the ProgramControl class
       int numberLogs = Integer.parseInt(value);
        String buildRaftMessage = ProgramControl.createBuildRaft(numberLogs);
        System.out.println(buildRaftMessage);
        
        return true;
        
    }
}
