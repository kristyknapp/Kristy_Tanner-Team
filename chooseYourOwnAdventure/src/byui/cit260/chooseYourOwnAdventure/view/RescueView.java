/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import chooseyourownadventure.ChooseYourOwnAdventure;

/**
 *
 * @author Tanner
 */
public class RescueView extends MenuView {

            ("\n"
            +"\n-------------------------------------------------------------"
            +"\n|Rescue Options                                             |"
            +"\n Please choose which rescue option you would like to perform."
            +"\n-------------------------------------------------------------"
            +"\nF- Build Signal Fire                                         "
            +"\nP - Call out to a Plane                                      "
            +"\nR - Build Raft                                               "
            +"\nM - Write Message in Sand/Vines                                    "
            +"\nE - Exit                                                     "
            +"\n-------------------------------------------------------------");
 
    public boolean doAction(value); String = null choice;{
        switch (value); {
            case "F":  //build fire
               
            case "P": // call out to a plane
                
            case "R": //build raft
                
            case "M": //Write Message
                
            case "E": // Exit the program
                this.dispose;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        } 
    }
/*build super class for each Rescue View maybe?*/
    public class FireView {
            case "F": 
                System.out.println     
                ("Create signal fire to try and be seen"
                + "by possibly nearby ships and planes."
                + "Creating a Signal fire will take away "
                + "10 health points and requires you to "
                + "have at least one log."
                + "Do you want to build a fire? [Y] or [N]");
            
                case "Y":
                    /* Start RescueControl, get input, display outcome*/
                        //If Outcome is a Success, display two more options
                        System.out.println
                        ("Congratulations, you have escaped the island.
                        +"Do you want to play again? [Y] or [N]?");
                            case "Y": 
                                /*reset program*/
                            case "N":
                                /*shut down program*/
                        //If Outcomeis a Failure
                            System.out.println ("Failure. Please Try again when ready.");
                                //return to the Game Menu
                case "N":
                    //Return to the previous menu
