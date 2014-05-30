/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.model.Player;
import chooseyourownadventure.ChooseYourOwnAdventure;
import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 *
 * @author Tanner
 */
public class MainMenuView {
    private static final String MENU = "\n"
            +"\n-------------------------------------------"
            +"\n|Main Menu                                |"
            +"\n-------------------------------------------"
            +"\nG - Start Game"
            +"\nH - Get Help"
            +"\nS - Save Game"
            +"\nE - Exit"
            +"\n-------------------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display the main menu
            String input = this.getInput();
            selection = input.charAt(0); //get the first character of the string
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //a selection is not "Exit"
            
    }

    private String getInput() {
       System.out.println("*** getInput called ***");
       Input input = new Input() {};
       input.setInput(input);
       return input;

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}