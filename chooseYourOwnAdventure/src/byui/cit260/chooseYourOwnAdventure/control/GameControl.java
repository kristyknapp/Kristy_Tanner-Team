/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

import byui.cit260.chooseYourOwnAdventure.model.Game;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import byui.cit260.chooseYourOwnAdventure.model.Rescue;
import byui.cit260.chooseYourOwnAdventure.model.Resources;
import chooseyourownadventure.ChooseYourOwnAdventure;

/**
 *
 * @author kristyknapp
 */



public class GameControl {
    
        private static Game game;
        public final static int NUMBER_OF_RESOURCE_ITEMS = 5;
        public final static int FOOD = 0;
        public final static int WATER = 1;
        public final static int LOGS = 2;
        public final static int ROCKS = 3;
        public final static int VINES = 4;
        public final static int SLEEP = 5;
        
        public final static int NUMBER_OF_RESCUE_OPTIONS = 4;
        public final static int FIRE = 0;
        public final static int PLANE = 1;
        public final static int RAFT = 2;
        public final static int MESSAGE = 3;

        public final static int MAP_ROW_COUNT = 0;
        public final static int MAP_COLUMN_COUNT = 1;
    

    
    public static Game getGame() {
        return game;
    }
    
    public static void createNewGame(Player player) {
        
    //create a new game
    GameControl.game = new Game();
    
    // save as current game
    ChooseYourOwnAdventure.setCurrentGame(game);
    
    GameControl.game.setResources(GameControl.createResourcesList()); // create the resources list
    GameControl.createRescue(); // create the rescue list
    GameControl.createMap(); // create and initialize the map
    
    // move player to starting position
    MapControl.moveActorToLocation(0,3);
    
}

public static void startSavedGame() {
    
    System.out.println("\n*** Calling startSavedGame stub function ***");
}

    private static Resources[] createResourcesList() {
        Resources[] resources = new Resources[GameControl.NUMBER_OF_RESOURCE_ITEMS];
        
        Resources food = new Resources();
        food.setDescription("name");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        resources [GameControl.FOOD] = food;
        
        Resources water = new Resources();
        water.setDescription("water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        resources [GameControl.WATER] = water;
        
        Resources logs = new Resources();
        logs.setDescription("logs");
        logs.setQuantityInStock(0);
        logs.setRequiredAmount(0);
        resources [GameControl.LOGS] = logs;
        
        Resources rocks = new Resources();
        rocks.setDescription("name");
        rocks.setQuantityInStock(0);
        rocks.setRequiredAmount(0);
        resources [GameControl.ROCKS] = rocks;
        
        Resources vines = new Resources();
        vines.setDescription("vines");
        vines.setQuantityInStock(0);
        vines.setRequiredAmount(0);
        resources [GameControl.VINES] = vines;
        
        Resources sleep = new Resources();
        sleep.setDescription("sleep");
        sleep.setQuantityInStock(0);
        sleep.setRequiredAmount(0);
        resources [GameControl.SLEEP] = sleep;
        
        return resources;
        
    }

    private static void createRescue() {
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
        rescue [GameControl.RAFT] = raft;
        
        Rescue message = new Rescue();
        message.setDescription("message");
        message.setQuantityInStock(0);
        message.setRequiredAmount(0);
        rescue [GameControl.MESSAGE] = message;
        
        
    }
    

    private static void createMap() {
     // Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
        Location location = new Location();
        
    }
    
}
