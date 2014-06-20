/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Map;
import byui.cit260.chooseYourOwnAdventure.model.Rescue;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import byui.cit260.chooseYourOwnAdventure.model.Scene;


/**
 *
 * @author kristyknapp
 */
public class MapControl {
    
        public final static int BEACH_MAP = 4;
        public final static int PLANE_CRASH = 0;
        public final static int TREELINE = 1;
        public final static int OCEAN = 2;
        public final static int SHELTER = 3;
        
        public final static int CLIFF_MAP = 4;
        public final static int JUNGLE = 0;
        public final static int CLIFF_TOPS = 1;
        public final static int STREAM = 2;
        public final static int CAVE = 3;

    public static Map createBeachMap() {
        //create the beach map
        Map map = new Map(2, 2);
        
        //create locations for the game
        Location[] locations = createLocationsBeachMap(GameControl.game.getResources(), GameControl.game.getRescue());
        
        //assign locations to positions on map
        MapControl.assignLocationsToBeachMap(map, locations);
        
        return map;
    }
    
    public static Map createCliffMap() {
        
        //create the cliff map
        Map map = new Map(2,2);
        
        //create locations for the game
        Location[] locations = createLocationsCliffMap(GameControl.game.getResources(), GameControl.game.getRescue());
        
        //assign locations to positions on map
        MapControl.assignLocationsToCliffMap(map, locations);
        
        return map;
    }
    
        private static Location[] createLocationsBeachMap(Resource[] resourceList, Rescue[] rescueList) {
 
        Location[] locationList = new Location[4];    
            
        Location location = new Location("Plane Crash Site");
        
        Resource[] resources = new Resource[3];
        
        Rescue[] rescueOptions = new Rescue[2];
        
        resources[0] = resourceList[GameControl.WATER];
        resources[1] = resourceList[GameControl.FOOD];
        resources[2] = resourceList[GameControl.SURVIVORS];
        
        rescueOptions[0] = rescueList[GameControl.BUILD_RAFT];
        rescueOptions[1] = rescueList[GameControl.PLANE];
        
        location.setResources(resources);
        location.setRescue(rescueOptions);
        
        locationList[MapControl.PLANE_CRASH] = location;
        
        location = new Location("Ocean");
        
        resources = new Resource[3];
        rescueOptions = new Rescue[2];
        
        resources[0] = resourceList[GameControl.FOOD];
        resources[1] = resourceList[GameControl.WATER];
        resources[2] = resourceList[GameControl.ROCKS];
        
        rescueOptions[0] = rescueList[GameControl.LAUNCH_RAFT];
        rescueOptions[1] = rescueList[GameControl.MESSAGE];
        
        location.setResources(resources);
        location.setRescue(rescueOptions);
        
        locationList[MapControl.OCEAN] = location;
        
        location = new Location("Treeline");
        
        resources = new Resource[4];
        rescueOptions = new Rescue[2];
        
        resources[0] = resourceList[GameControl.FOOD];
        resources[1] = resourceList[GameControl.LOGS];
        resources[2] = resourceList[GameControl.ROCKS];
        resources[3] = resourceList[GameControl.SURVIVORS];
        
        rescueOptions[0] = rescueList[GameControl.FIRE];
        rescueOptions[1] = rescueList[GameControl.BUILD_RAFT];
        
        location.setResources(resources);
        location.setRescue(rescueOptions);
        
        locationList[MapControl.TREELINE] = location;
        
        location = new Location("Shelter");
        
        resources = new Resource[4];
        
        resources[0] = resourceList[GameControl.FOOD];
        resources[1] = resourceList[GameControl.WATER];
        resources[2] = resourceList[GameControl.ROCKS];
        resources[3] = resourceList[GameControl.LOGS];
        
        location.setResources(resources);
        
        locationList[MapControl.SHELTER] = location;
        return locationList;
    }
        
        private static Location[] createLocationsCliffMap(Resource[] resourceList, Rescue[] rescueList) {
 
        Location[] locationList = new Location[4];  
        
        Location location = new Location("Jungle");
            
        Resource[] resources = new Resource[4];
        
        Rescue[] rescueOptions = new Rescue[1];
        
        resources[0] = resourceList[GameControl.WATER];
        resources[1] = resourceList[GameControl.FOOD];
        resources[2] = resourceList[GameControl.VINES];
        resources[3] = resourceList[GameControl.SURVIVORS];

        
        rescueOptions[0] = rescueList[GameControl.FIRE];
        
        location.setResources(resources);
        location.setRescue(rescueOptions);
        
        locationList[MapControl.JUNGLE] = location; 
        
        location = new Location("Stream");
        
        resources = new Resource[2];
        
        resources[0] = resourceList[GameControl.WATER];
        resources[1] = resourceList[GameControl.ROCKS];
        
        location.setResources(resources);
        
        locationList[MapControl.STREAM] = location;
        
        location = new Location("Cliff Tops");
        
        resources = new Resource[2];
        rescueOptions = new Rescue[1];
        
        resources[0] = resourceList[GameControl.ROCKS];
        resources[1] = resourceList[GameControl.SURVIVORS];
        
        rescueOptions[0] = rescueList[GameControl.PLANE];
        
        location.setResources(resources);
        location.setRescue(rescueOptions);
        
        locationList[MapControl.CLIFF_TOPS] = location;
        
        location = new Location("Cave");
        
        resources = new Resource[3];
        
        resources[0] = resourceList[GameControl.FOOD];
        resources[1] = resourceList[GameControl.WATER];
        resources[2] = resourceList[GameControl.ROCKS];
        resources[3] = resourceList[GameControl.LOGS];
        
        location.setResources(resources);
        
        locationList[MapControl.CAVE] = location;
        return locationList;
    }
    
   private static void assignLocationsToBeachMap(Map map, Location[] locationList) {
        Location[][] locations = map.getLocations();
        
        locations[0][0] = locationList[MapControl.PLANE_CRASH];
        locations[0][1] = locationList[MapControl.OCEAN];
        locations[1][0] = locationList[MapControl.TREELINE];
        locations[1][1] = locationList[MapControl.SHELTER];
   }

    private static void assignLocationsToCliffMap(Map map, Location[] locationList) {
        Location[][] locations = map.getLocations();
        
        locations[0][0] = locationList[MapControl.JUNGLE];
        locations[0][1] = locationList[MapControl.STREAM];
        locations[1][0] = locationList[MapControl.CLIFF_TOPS];
        locations[1][1] = locationList[MapControl.CAVE];
    }
    
}
