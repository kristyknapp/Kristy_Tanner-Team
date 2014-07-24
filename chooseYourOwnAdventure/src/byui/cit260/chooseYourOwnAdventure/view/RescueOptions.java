/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.PointsControl;
import byui.cit260.chooseYourOwnAdventure.control.RescueControl;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
/**
 *
 * @author Tanner
 */
public class RescueOptions {
    RescueControl rc = new RescueControl();
    PointsControl pc = new PointsControl();
    Player p = new Player();
    Resource r = new Resource();
    
            String rescue = "\n-------------------------------------------------------------"
            +"\n|Rescue Options                                             |"
            +"\n Please choose which rescue option you would like to perform."
            +"\n-------------------------------------------------------------"
            +"\nF- Build Signal Fire                                         "
            +"\nP - Call out to a Plane                                      "
            +"\nR - Build Raft                                               "
            +"\nM - Write Message in Sand/Vines                                    "
            +"\nE - Exit                                                     "
            +"\n-------------------------------------------------------------";
 
    public void doAction(String choice){
        switch (choice) {
            case "F":  //build fire
            double fire = rc.calcRandomRescueOutcome(pc.calcTotalPoints(p.getSleepPoints(), p.getHealthPoints()), r.getQuantityInStock(), 1);
        System.out.println(fire);
        break;
            
            case "P": // call out to a plane
                double plane = rc.calcRandomRescueOutcome(pc.calcTotalPoints(p.getSleepPoints(), p.getHealthPoints()), r.getQuantityInStock(), 1);
        System.out.println(plane);
        break;
            
            case "R": //build raft
                double raft = rc.calcRandomRescueOutcome(pc.calcTotalPoints(p.getSleepPoints(), p.getHealthPoints()), r.getQuantityInStock(), 1);
        System.out.println(raft);
        break;
            
            case "M": //Write Message
                double message = rc.calcRandomRescueOutcome(pc.calcTotalPoints(p.getSleepPoints(), p.getHealthPoints()), r.getQuantityInStock(), 1);
        System.out.println(message);
        break;
                
            case "E": // Exit the program
                return;
                
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        }
    }
}