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
public class MainMenuView extends MenuView {


    public MainMenuView() {
        super("\n"
            +"\n-------------------------------------------"
            +"\n|Main Menu                                |"
            +"\n-------------------------------------------"
            +"\nG - Start New Game"
            +"\nC - Continue Saved Game"
            +"\nH - Get Help"
            +"\nS - Save Game"
            +"\nE - Exit"
            +"\n-------------------------------------------");
    }

 
    @Override
    public boolean doAction(String choice) {
       
        switch (choice) {
            case "G":  //create a new game
                GameControl.createNewGame(ChooseYourOwnAdventure.getPlayer());
                       //display the IntroChoiceView
                IntroChoiceView introMenu = new IntroChoiceView();
                introMenu.displayMenu();
                break;
            case "H": // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                break;
            case "S": //save the current game to disk
                ProgramControl.saveGame(ChooseYourOwnAdventure.getCurrentGame());
                break;
            case "E": // Exit the program
                return true; 
            default:
                System.out.println("/n*** Invalid selection *** Try again");
                break;

        } 
        return false;
    }
        

       
}

