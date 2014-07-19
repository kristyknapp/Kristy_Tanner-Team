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
            +"\nM - Write Message in Sand                                    "
            +"\nE - Exit                                                     "
            +"\n-------------------------------------------------------------");
 
    public boolean doAction(value); String = null choice;{
        switch (value); {
            case "F":  //create a new game
                FireView fireView =
                fireView.displayFireView();
                break;
            case "P": // display the help menu
                CallPlaneView planeView = new CallPlaneView();
                planeView.displayView();
                break;
            case "S": //save the current game to disk
                ProgramControl.saveGame(ChooseYourOwnAdventure.getCurrentGame());
                break;
            case "E": // Exit the program
                this.dispose;
            default:
                System.out.println("/n*** Invalid selection *** Try again");
                break;
        } 
    }

