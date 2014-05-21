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
        
        /*Test Case #1*/
        System.out.println("Test case #1");
        
        //inpute values for case 1
        double sleepPoints = 37.0;
        double healthPoints = 53.0;
        PointsControl instance = new PointsControl();
        
        double expResult = 90.0; //expected output return value
        
        double result = instance.calcTotalPoints(sleepPoints, healthPoints);
        assertEquals(expResult, result, 0.0);
        
                /*Test Case #2*/
        System.out.println("Test case #2");
        
        //inpute values for case 2
        sleepPoints = -1.0;
        healthPoints = 63.0;
        instance = new PointsControl();
        
        expResult = -1.0; //expected output return value
        
        result = instance.calcTotalPoints(sleepPoints, healthPoints);
        assertEquals(expResult, result, 0.0);
        
                        /*Test Case #3*/
        System.out.println("Test case #3");
        
        //inpute values for case 3
        sleepPoints = 40.0;
        healthPoints = -1.0;
        instance = new PointsControl();
        
        expResult = -1.0; //expected output return value
        
        result = instance.calcTotalPoints(sleepPoints, healthPoints);
        assertEquals(expResult, result, 0.0);
        
                        /*Test Case #4*/
        System.out.println("Test case #4");
        
        //inpute values for case 4
        sleepPoints = 41.0;
        healthPoints = 30.0;
        instance = new PointsControl();
        
        expResult = -1.0; //expected output return value
        
        result = instance.calcTotalPoints(sleepPoints, healthPoints);
        assertEquals(expResult, result, 0.0);
        
                        /*Test Case #5*/
        System.out.println("Test case #5");
        
        //inpute values for case 5
        sleepPoints = 40.0;
        healthPoints = 60.0;
        instance = new PointsControl();
        
        expResult = 100.0; //expected output return value
        
        result = instance.calcTotalPoints(sleepPoints, healthPoints);
        assertEquals(expResult, result, 0.0);
        
                        /*Test Case #6*/
        System.out.println("Test case #6");
        
        //inpute values for case 6
        sleepPoints = 37.0;
        healthPoints = 60.0;
        instance = new PointsControl();
        
        expResult = 97.0; //expected output return value
        
        result = instance.calcTotalPoints(sleepPoints, healthPoints);
        assertEquals(expResult, result, 0.0);
        
                        /*Test Case #7*/
        System.out.println("Test case #7");
        
        //inpute values for case 7
        sleepPoints = 40.0;
        healthPoints = 53.0;
        instance = new PointsControl();
        
        expResult = 93.0; //expected output return value
        
        result = instance.calcTotalPoints(sleepPoints, healthPoints);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
