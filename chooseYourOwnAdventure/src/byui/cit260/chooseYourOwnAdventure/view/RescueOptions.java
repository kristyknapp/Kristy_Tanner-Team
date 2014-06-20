/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

/**
 *
 * @author kristyknapp
 */
public class RescueOptions extends MenuView {

    public RescueOptions() {
        super("menu - changed this to string to get rid of the error");
    }
    

    @Override
    public boolean doAction(String value) {
        System.out.println("*** RescueOptions doAction called");
        return true;
    }
}
