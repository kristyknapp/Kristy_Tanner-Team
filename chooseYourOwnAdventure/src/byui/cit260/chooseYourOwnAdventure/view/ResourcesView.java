/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.model.Resource;

/**
 *
 * @author kristyknapp
 */
public class ResourcesView {

    public void displayMenu() {
        GameControl.getSortedResources();
    }

    
}