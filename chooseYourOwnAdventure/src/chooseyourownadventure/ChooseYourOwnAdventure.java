/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseyourownadventure;

import byui.cit260.chooseYourOwnAdventure.model.Player;

/**
 *
 * @author kristyknapp
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Kristy");
        playerOne.setSleepPoints(28);
        playerOne.setHealthPoints(30);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
