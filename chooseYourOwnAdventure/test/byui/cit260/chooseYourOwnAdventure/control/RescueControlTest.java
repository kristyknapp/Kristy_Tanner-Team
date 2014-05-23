/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristyknapp
 */
public class RescueControlTest {
    
    public RescueControlTest() {
    }

    /**
     * Test of calcRandomRescueOutcome method, of class RescueControl.
     */
    @Test
    public void testCalcRandomRescueOutcome() {
        System.out.println("calcRandomRescueOutcome");
        
        /* Test Case 1 */
        System.out.println("Test case #1");
        
        double totalPoints = 90.0;
        double resourcesCollected = 25.0;
        double selectedRescueOption = 3.0;
        
        RescueControl instance = new RescueControl();
        double expResult = 0.0;
        double result = instance.calcRandomRescueOutcome(totalPoints, resourcesCollected, selectedRescueOption);
        assertEquals(expResult, result, 0.0);
        
        /* Test Case 2 */
        System.out.println("Test case #2");
        
        totalPoints = -1.0;
        resourcesCollected = 25.0;
        selectedRescueOption = 0.0;
        
        instance = new RescueControl();
        expResult = -1.0;
        result = instance.calcRandomRescueOutcome(totalPoints, resourcesCollected, selectedRescueOption);
        assertEquals(expResult, result, 0.0);
        
        /* Test Case 3 */
        System.out.println("Test case #3");
        
        totalPoints = 102.0;
        resourcesCollected = 31.0;
        selectedRescueOption = 3.0;
        
        instance = new RescueControl();
        expResult = -1.0;
        result = instance.calcRandomRescueOutcome(totalPoints, resourcesCollected, selectedRescueOption);
        assertEquals(expResult, result, 0.0);
        
        /* Test Case 4 */
        System.out.println("Test case #4");
        
        totalPoints = 90.0;
        resourcesCollected = -9.0;
        selectedRescueOption = 6.0;
        
        instance = new RescueControl();
        expResult = -1.0;
        result = instance.calcRandomRescueOutcome(totalPoints, resourcesCollected, selectedRescueOption);
        assertEquals(expResult, result, 0.0);
        
        /* Test Case 5 */
        System.out.println("Test case #5");
        
        totalPoints = 0.0;
        resourcesCollected = 30.0;
        selectedRescueOption = 5.0;
        
        instance = new RescueControl();
        expResult = 0.0;
        result = instance.calcRandomRescueOutcome(totalPoints, resourcesCollected, selectedRescueOption);
        assertEquals(expResult, result, 0.0);
        
        /* Test Case 6 */
        System.out.println("Test case #6");
        
        totalPoints = 100.0;
        resourcesCollected = 1.0;
        selectedRescueOption = 3.0;
        
        instance = new RescueControl();
        expResult = 0.0;
        result = instance.calcRandomRescueOutcome(totalPoints, resourcesCollected, selectedRescueOption);
        assertEquals(expResult, result, 0.0);
        
        /* Test Case 7 */
        System.out.println("Test case #7");
        
        totalPoints = 90.0;
        resourcesCollected = 0.0;
        selectedRescueOption = 1.0;
        
        instance = new RescueControl();
        expResult = 0.0;
        result = instance.calcRandomRescueOutcome(totalPoints, resourcesCollected, selectedRescueOption);
        assertEquals(expResult, result, 0.0);

        
    }
    
}
