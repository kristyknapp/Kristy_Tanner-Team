/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

/**
 *
 * @author Tanner
 */
public class RaftControl {
    public String getInput(int input) {
        boolean valid = false; // indicates if the choice has been retrieved
//        String input = null;
//        Scanner keyboard = new Scanner(System.in); //keyboard input stream
            String text = "";
        while (!valid) {//while a valid choice has not been retrieved
            //prompt for the players choice
//            System.out.println("Enter ammount of logs collected below:");

            //get the value from the keyboard and trim off the blanks
//            input = keyboard.nextLine();
//            input = input.trim();

            if (input < 6) 
            {
                text = "You have enough logs!";
                    /*Start RescueControl, display random outcome.*/
            }
        
            else {
                text =  "You do not have enough logs! Please get some more.";
            }
    }
        return text;
    }

    public RaftControl(String value) {
        //create the player object and save it in the ProgramControl class
       int numberLogs = Integer.parseInt(value);
        String buildRaftMessage = ProgramControl.createBuildRaft(numberLogs);
        System.out.println(buildRaftMessage);    
    }
}
