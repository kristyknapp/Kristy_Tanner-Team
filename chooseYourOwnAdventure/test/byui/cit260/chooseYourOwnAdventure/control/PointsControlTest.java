/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristyknapp
 */
public class PointsControlTest {
    
    public PointsControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcTotalPoints method, of class PointsControl.
     */
    @Test
    public void testCalcTotalPoints() {
        System.out.println("calcTotalPoints");
        double sleepPoints = 0.0;
        double healthPoints = 0.0;
        PointsControl instance = new PointsControl();
        double expResult = 0.0;
        double result = instance.calcTotalPoints(sleepPoints, healthPoints);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
