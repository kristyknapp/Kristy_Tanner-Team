/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.MapControl;
import byui.cit260.chooseYourOwnAdventure.exceptions.ChooseYourOwnAdventureException;
import byui.cit260.chooseYourOwnAdventure.exceptions.MapControlException;
import byui.cit260.chooseYourOwnAdventure.exceptions.ViewException;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Map;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.awt.Point;

/**
 *
 * @author kristyknapp
 */
public class NewLocation extends MenuView{

    public NewLocation(String menu) {
        super(menu);
    }

    private Point getCoordinates() throws ViewException {
        //prompt and get the row and column numbers
        System.out.println("\nEnter in the coordinates for the new location. (eg., 1 0)");
        String value = this.getInput();
        value = value.trim().toUpperCase();
        if (value.equals("Q")) 
            return null;
        
        //tokenize values into an array of strings
        String[] values = value.split(" ");
        
        if (values.length < 2) {
            throw new ViewException("You must enter both a row and column number");
        }
        
        //parse out row and column strings
        try {
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);
            return new Point(row, column);
        } catch (NumberFormatException nf) {
            throw new ViewException("At least one of the entered values is not a number");
        }
    }
    
  
    @Override
    public boolean doAction(String choice) {
        try { 
            //move player to chosen location
            MapControl.movePlayerToLocation(player, coordinates);
        } catch (MapControlException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
