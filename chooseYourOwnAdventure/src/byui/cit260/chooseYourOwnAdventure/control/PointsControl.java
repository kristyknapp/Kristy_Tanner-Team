/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

/**
 *
 * @author kristyknapp
 */
public class PointsControl {
    
    public double calcTotalPoints(double sleepPoints, double healthPoints){
        
        if(sleepPoints < 0 || >40) { // sleep points OUT OF RANGE?
                return -1;
        }
        if(healthPoints < 0 || >60) { // health points OUT OF RANGE?
                return -1;
        }
        
        double totalPoints = sleepPoints + healthPoints;
        
        return totalPoints;
       
    }
}
