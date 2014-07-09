/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseyourownadventure;

import byui.cit260.chooseYourOwnAdventure.frames.StartProgramFrame;
import byui.cit260.chooseYourOwnAdventure.model.Game;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Map;
import byui.cit260.chooseYourOwnAdventure.model.Player;
import byui.cit260.chooseYourOwnAdventure.model.Rescue;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import byui.cit260.chooseYourOwnAdventure.view.StartProgramView;

/**
 *
 * @author kristyknapp
 */
public class ChooseYourOwnAdventure {


    private static Game currentGame = null;
    private static Player player = null;
    private static Location location = null;
    private static Map map = null;

    
    public static void main(String[] args) {
        

    try {
        java.awt.EventQueue.invokeLater(
                    new Runnable(){
                public void run(){
                    StartProgramFrame startProgramView = new StartProgramFrame();
                    startProgramView.setVisible(true);
                }
                }
            );
    } catch (Exception e) {
        System.out.println(e.getMessage());
        
    }

//       StartProgramView startProgramView = new StartProgramView();
//       startProgramView.startProgram();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ChooseYourOwnAdventure.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ChooseYourOwnAdventure.player = player;
    }
    
        public static Location getLocation() {
        return location;
    }

    public static void setLocation(Location location) {
        ChooseYourOwnAdventure.location = location;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        ChooseYourOwnAdventure.map = map;
    }
    
    
    
}
