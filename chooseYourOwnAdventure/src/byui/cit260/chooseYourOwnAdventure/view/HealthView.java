/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.PointsControl;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;
import java.util.ArrayList;

/**
 *
 * @author kristyknapp
 */
public class HealthView extends MenuView {

    public HealthView() {
        super("\nCalculating your current total Health"
                + PointsControl.calcHealth());
    }

    @Override
    public boolean doAction(String value) {
        System.out.println("Players helath points view stub function called");
        return false;
    }

}
