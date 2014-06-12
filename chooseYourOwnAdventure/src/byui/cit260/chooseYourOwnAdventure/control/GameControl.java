/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

import byui.cit260.chooseYourOwnAdventure.model.Game;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Map;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import byui.cit260.chooseYourOwnAdventure.model.Rescue;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;

/**
 *
 * @author kristyknapp
 */



public class GameControl {
    
        public static Game game;
        
        public final static int NUMBER_OF_RESOURCE_ITEMS = 7;
        public final static int FOOD = 0;
        public final static int WATER = 1;
        public final static int LOGS = 2;
        public final static int ROCKS = 3;
        public final static int VINES = 4;
        public final static int SLEEP = 5;
        public final static int SURVIVORS = 6;
        
        public final static int NUMBER_OF_RESCUE_OPTIONS = 5;
        public final static int FIRE = 0;
        public final static int PLANE = 1;
        public final static int BUILD_RAFT = 2;
        public final static int MESSAGE = 3;
        public final static int LAUNCH_RAFT = 4;

    
    public static Game getGame() {
        return game;
    }
    
    public static void createNewGame(Player player) {
        
    //create a new game
    GameControl.game = new Game();
    
    // save as current game
    ChooseYourOwnAdventure.setCurrentGame(game);
    
    //set (save) the player in the game object
    GameControl.game.setPlayer(ChooseYourOwnAdventure.getPlayer());
    
    GameControl.game.setResources(GameControl.createResourcesList()); // create the resources list
    GameControl.game.setRescue(GameControl.createRescue()); // create the rescue list
    GameControl.game.setMap(MapControl.createBeachMap()); // create and initialize the map

}

public static void startSavedGame() {
    
    System.out.println("\n*** Calling startSavedGame stub function ***");
}

    private static Resource[] createResourcesList() {
        Resource[] resources = new Resource[GameControl.NUMBER_OF_RESOURCE_ITEMS];
        
        Resource food = new Resource();
        food.setDescription("name");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        resources [GameControl.FOOD] = food;
        
        Resource water = new Resource();
        water.setDescription("water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        resources [GameControl.WATER] = water;
        
        Resource logs = new Resource();
        logs.setDescription("logs");
        logs.setQuantityInStock(0);
        logs.setRequiredAmount(0);
        resources [GameControl.LOGS] = logs;
        
        Resource rocks = new Resource();
        rocks.setDescription("name");
        rocks.setQuantityInStock(0);
        rocks.setRequiredAmount(0);
        resources [GameControl.ROCKS] = rocks;
        
        Resource vines = new Resource();
        vines.setDescription("vines");
        vines.setQuantityInStock(0);
        vines.setRequiredAmount(0);
        resources [GameControl.VINES] = vines;
        
        Resource sleep = new Resource();
        sleep.setDescription("sleep");
        sleep.setQuantityInStock(0);
        sleep.setRequiredAmount(0);
        resources [GameControl.SLEEP] = sleep;
        
        Resource survivors = new Resource();
        survivors.setDescription("survivors");
        survivors.setQuantityInStock(0);
        survivors.setRequiredAmount(0);
        resources [GameControl.SURVIVORS] = survivors;
        
        return resources; 
    }
    
    public static Resource[] getSortedResources() {
        Resource[] createResourcesList = ChooseYourOwnAdventure.getCurrentGame().getResources();
        
        //sort the inventory list
        GameControl.sortResources(createResourcesList);
        
        return createResourcesList;
}
    
        
    public void displaySortedResources(Resource[] resources) {
         //display the sorted Resources
        sortResources(resources);
        for (Resource resource : resources) {
        System.out.println(resource);
        }
    }
    
    public static void sortResources(Resource[] resources) {
        
        // using an exchange sort to put the list of Resources in alphabetical order.
        int i, j;
        Resource temp;
        
        for (i = 0; i<resources.length-1; i++) {
            for (j = i+ 1; j < resources.length; j++) {
                        //ascending sort
                if (resources[i].getResourceType().compareToIgnoreCase(resources[j].getResourceType()) > 0) {
                    temp = resources[i];
                    resources[i] = resources[j]; //swapping
                    resources[j] = temp;
                }
            }
        }
    
    }

    private static Rescue[] createRescue() {
        Rescue[] rescue = new Rescue[GameControl.NUMBER_OF_RESCUE_OPTIONS];
        
        Rescue fire = new Rescue();
        fire.setDescription("fire");
        fire.setQuantityInStock(0);
        fire.setRequiredAmount(0);
        rescue [GameControl.FIRE] = fire;
        
        Rescue plane = new Rescue();
        plane.setDescription("plane");
        plane.setQuantityInStock(0);
        plane.setRequiredAmount(0);
        rescue [GameControl.PLANE] = plane;
        
        Rescue raft = new Rescue();
        raft.setDescription("raft");
        raft.setQuantityInStock(0);
        raft.setRequiredAmount(0);
        rescue [GameControl.BUILD_RAFT] = raft;
        
        Rescue message = new Rescue();
        message.setDescription("message");
        message.setQuantityInStock(0);
        message.setRequiredAmount(0);
        rescue [GameControl.MESSAGE] = message;
        
        Rescue launch = new Rescue();
        launch.setDescription("Launch Raft");
        launch.setQuantityInStock(0);
        launch.setRequiredAmount(0);
        rescue [GameControl.LAUNCH_RAFT] = launch;
        
        return rescue;
        
    }

        
}
    

