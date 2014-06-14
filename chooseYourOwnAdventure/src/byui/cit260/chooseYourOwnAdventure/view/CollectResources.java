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
class CollectResources {
    public void displayMenu() {
        Resource[] resources = GameControl.getSortedResources();
        
        int sum=0;
        
        for (Resource resource : resources) {
                //find the total from quantity
                sum += resource.getQuantityInStock();

            }
        //check to make sure amount is not too great:
        if(sum > 60) {
            System.out.println("Too many resources collected");
        }
        else {
        System.out.println("total: "+ sum);
        }
        
    }
}
