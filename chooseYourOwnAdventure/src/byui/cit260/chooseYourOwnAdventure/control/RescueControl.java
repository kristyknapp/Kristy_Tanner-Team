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
public class RescueControl {
    public double calcRandomRescueOutcome(double totalPoints, double resourcesCollected, double selectedRescueOption) {
        
        double randomNumber; 
        
        if(totalPoints < 0 || totalPoints >100) {
            return -1;
        }
        
        if(resourcesCollected <0 || resourcesCollected >30) {
            return -1;
        }
        
        if(selectedRescueOption < 1 || selectedRescueOption > 5){
            return -1;
        }
        
        randomNumber = Math.random() * 10;
        
        int randomOutcome = (int)randomNumber;
        
        if(randomOutcome % 2 == 0){
            System.out.println("Rescue is a Failure");
        }
        
        else {
            System.out.println("Rescue is a Success");
        }
        
        return 0;
  
    } 

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
