/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.control;

import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.util.ArrayList;

/**
 *
 * @author kristyknapp
 */
public class ResourceControl {


    public static Resource findResource(Resource[] resources, String description) {

        for (Resource resource : resources) {
            if (resource.getDescription().equals(description)) {
                return resource;
            }
        }
        return null;
    }
    
    public static boolean addResourceToPlayer(String description) {
        
        Location location = ChooseYourOwnAdventure.getLocation();
        
        Resource locationResource = ResourceControl.findResource(location.getResources(), description);
        if (locationResource != null) {
            Resource[] playerResources = ChooseYourOwnAdventure.getPlayer().getResources().toArray(new Resource[0]);
            Resource playerResource = ResourceControl.findResource(playerResources, description);
            if (playerResource == null) {
                playerResource = new Resource();
                playerResource.setDescription(description);
                playerResource.setQuantityInStock(0);
                playerResource.setRequiredAmount(0);
                playerResource.setResourcesCollected(0);
                ChooseYourOwnAdventure.getPlayer().getResources().add(playerResource);
            
            }
            double locationQuantity = locationResource.getQuantityInStock();
            double playerQuantity = playerResource.getQuantityInStock() + locationQuantity;
            playerResource.setQuantityInStock(playerQuantity);
            return true;
        }
        else {
            return false;
        }
    }
}

