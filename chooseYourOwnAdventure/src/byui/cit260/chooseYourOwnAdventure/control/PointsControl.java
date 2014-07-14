/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.control;

import static byui.cit260.chooseYourOwnAdventure.control.GameControl.FOOD;
import static byui.cit260.chooseYourOwnAdventure.control.GameControl.WATER;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author kristyknapp
 */
public class PointsControl {

    public double calcTotalPoints(double sleepPoints, double healthPoints) {

        if (sleepPoints < 0 || sleepPoints > 40) { // sleep points OUT OF RANGE?
            return -1;
        }
        if (healthPoints < 0 || sleepPoints > 60) { // health points OUT OF RANGE?
            return -1;
        }

        double totalPoints = sleepPoints + healthPoints;

        return totalPoints;

    }
    
    public static int letPlayerSleep() {
     //get players location 
        Point playerLocation = ChooseYourOwnAdventure.getPlayer().getLocation();
       //IF player location is in shelter or cave
        if (playerLocation.equals(MapControl.SHELTER) || playerLocation.equals(MapControl.SHELTER)) {
            //THEN make totalSleep = 40pts
            int sleepPoints = 40;
        }
        
        else {
            //ELSE Inform user they are not in right location to sleep
            System.out.println("You cannot sleep in this location");
        }
        return 0;
        
    }

    public static int calcHealth() {
        ArrayList<Resource> resources = ChooseYourOwnAdventure.getPlayer().getResources();
        int sum = 0;
        int i = 5;

        while (sum < 100) {
            for (Resource resource : resources) {
                if (resource.getDescription().equals(GameControl.FOOD)) {
                    i++;
                }
                if (resource.getDescription().equals(GameControl.WATER)) {
                    i++;
                }
            }
            sum += i;

        }
        System.out.println("Total Health Points: " + sum);
        return sum;
    }

}
