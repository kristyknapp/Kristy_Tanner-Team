/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

/**
 *
 * @author Tanner
 */
public abstract class RescueOptions extends MenuView {

    public RescueOptions() {
        super("\n"
            +"\n-------------------------------------------------------------"
            +"\n|Rescue Options                                             |"
            +"\n Please choose which rescue option you would like to perform."
            +"\n-------------------------------------------------------------"
            +"\nF- Build Signal Fire                                         "
            +"\nP - Call out to a Plane                                      "
            +"\nR - Build Raft                                               "
            +"\nM - Write Message in Sand                                    "
            +"\nE - Exit                                                     "
            +"\n-------------------------------------------------------------");
    }
    public doAction(input) {
            switch (input) {
                case "F": //Build a fire
                    System.out.println
                ("Create signal fire to try and be seen"
                + "by possibly nearby ships and planes."
                + "Creating a Signal fire will take away "
                + "10 health points and requires you to "
                + "have at least one log."
                + "Do you want to build a fire? [Y] or [N]");
                    break;
                if("Y");
                //TAKE AWAY TEN HEALTH POINTS
                    int= Math.random(1); 
                        if ("0"); //SUCCESS
                        System.out.println
                        ("Congratulations, you have escaped the island."
                        +"Do you want to play again? [Y] or [N]?");
                            if (input="Y"); //RESTART SAVE STATE AND GO BACK TO START MENU.
                            if (input="N"); //PROGRAM WILL SHUT DOWN.
                if (OUTCOME="1"); //FAILURE
                System.out.println ("Failure. Please Try again when ready.");
                        return //return to the previous menu
                else("N");
                    return //Return to the previous menu
                
                case "P": //Call out to a plane
                    System.out.println
                ("Your character will call out"
                + "to any planes that he may here."
                + "Calling to a plane will take away 5 health points."
                + "Do you want to call to a plane? [Y] or [N]");
                    break;
                if("Y"); //RANDOM OUTCOME
                //TAKE AWAY 5 HEALTH POINTS
                    int= Math.random(1); 
                        if ("0"); //SUCCESS
                        System.out.println
                        ("Congratulations, you have escaped the island."
                        +"Do you want to play again? [Y] or [N]?");
                            if input="Y"; //RESTART SAVE STATE AND GO BACK TO START MENU.
                            if input="N"; //PROGRAM WILL SHUT DOWN.
                if (OUTCOME="1"); //FAILURE
                System.out.println ("Failure. Please Try again when ready.");
                        return //return to the previous menu
                else("N");
                    return //Return to the previous menu
                                        
                case "R": //Build Raft
                    System.out.println
                ("You have the option to build a raft"
                + "to make an escape attempt from the island."
                + "You will need some resources to be able to though."
                + "Launching your raft will cost 20 health points."
                + "Do you want to build a raft? [Y] or [N]");
                    break;
                if("Y"); //RANDOM OUTCOME
                    int= Math.random(1); 
                        if ("0"); //SUCCESS
                        System.out.println
                        ("Congratulations, you have escaped the island."
                        +"Do you want to play again? [Y] or [N]?");
                            if input="Y"; //RESTART SAVE STATE AND GO BACK TO START MENU.
                            if input="N"; //PROGRAM WILL SHUT DOWN.
                if (OUTCOME="1"); //FAILURE
                System.out.println ("Failure. Please Try again when ready.");
                        return //return to the previous menu
                else("N");
                    return //Return to the previous menu
                                    
                case "M": //Write Message
                    System.out.println
                ("You also have the option to write a message in the sand"
                + "to attempt to alert planes or ships that might see things from the air."
                + "You will need some resources to be able to though."
                + "Writing a message will cost 5 health points.'"
                + "Do you want to write a message? [Y] or [N]");
                    break;
                if(input=="Y"); //RANDOM OUTCOME
                    int= (int)(Math.random() * (1)); 
                        if (OUTCOME="0"); //SUCCESS
                        System.out.println
                        ("Congratulations, you have escaped the island."
                        +"Do you want to play again? [Y] or [N]?");
                            if (input="Y"); //RESTART SAVE STATE AND GO BACK TO START MENU.
                            if (input="N"); //PROGRAM WILL SHUT DOWN.
                
                        else (OUTCOME="1"); //FAILURE
                        System.out.println ("Failure. Please Try again when ready.");
                        return //return to the previous menu
                
                else(input=="N");
                    return //Return to the previous menu
                                
                case "E": // Exit the program
                    return; 
                
                default:
                    System.out.println("/n*** Invalid selection *** Try again");
            }
        }
    }