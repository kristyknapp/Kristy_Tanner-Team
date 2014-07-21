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
public class RescueOptionsView extends MenuView {

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
                FireView fireView = new FireView();
                fireView.getFireView();
                break;
            case "P": // call out to a plane
                PlaneView planeView = new PlaneView();
                planeView.getPlaneView();
                break;
            case "R": //build raft
                RaftView raftView =
                raftView.displayRaftView();
            case "M": //Write Message
                MessageView messageView();
                messageView.getMessageView;
                break;
            case "E": // Exit the program
                this.dispose;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        } 
    }

    public class FireView {
    value = value.toUpperCase();
        switch (String value); {
            case "F": 
                this.buildFire();//Build a fire
                System.out.println     
                ("Create signal fire to try and be seen"
                + "by possibly nearby ships and planes."
                + "Creating a Signal fire will take away "
                + "10 health points and requires you to "
                + "have at least one log."
                + "Do you want to build a fire? [Y] or [N]");
        
        public String fireChoice(String value); {
         value = value.toUpperCase();}
                switch (String value); {
                    case "Y"://TAKE AWAY TEN HEALTH POINTS
                    int= Math.random(1);
                        if (Math.random=0); //SUCCESS
                            System.out.println ("Congratulations, you have escaped the island."
                            +"Do you want to play again? [Y] or [N]?");
                                
                                public String playAgain(String value){
                                    value = value.toUpperCase();
                                    switch (String value) {
                                        case "Y": 
                                            this.startProgramView();
                                        case "N":
                                            this.dispose();
                        if (Math.random="1"); //FAILURE
                            System.out.println ("Failure. Please Try again when ready.");
                                this.MainMenuView(); //return to the previous menu
                    case "N":
                        this.MainMenuView; //Return to the previous menu
