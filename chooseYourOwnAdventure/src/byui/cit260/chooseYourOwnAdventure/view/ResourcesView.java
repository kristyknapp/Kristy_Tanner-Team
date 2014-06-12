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

    public void displayResources() {
         Resource[] resources = GameControl.getSortedResources();
         
         System.out.println("\nList of Resources");
         System.out.println("Description" + "\t" + "Required" + "\t" + "In Stock");
         
         for (Resource collectResources : resources) {
             // DISPLAY the description, the required amount and amount in stock
             System.out.println(collectResources.getDescription() + "\t" +
                                collectResources.getRequiredAmount() + "\t" +
                                collectResources.getQuantityInStock());
                     
        }
     
    }

    
}