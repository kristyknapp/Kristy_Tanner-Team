/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.view;

import byui.cit260.chooseYourOwnAdventure.control.ProgramControl;
import java.util.Scanner;

/**
 *
 * @author Tanner
 *
**/

public abstract class RaftView extends MenuView{

    public RaftView() {
        super("\n-----------------------------------------------------------"
                + "\n|Build a Raft                                              "
                + "\n-----------------------------------------------------------"
                + "\n In order to get off the island, you must collect enough   "
                + "\n resources to build a raft. 1/2x6 logs are needed to create  "
                + "\n a large enough raft to float you and other survivors.     "
                + "\n One person requires at least a 3x6 raft.                  "
                + "\n Two people require at least a 3x12 raft.                  "
                + "\n Three people require ate least a 3x18 raft.               "
                + "\n-----------------------------------------------------------"
                + "\n Please enter the ammount of logs you have to build your raft. "
                + "\n Remember, you must have at least 6 logs if it is only you,    "
                + "\n 12 logs if it's you an another survivor,                      "
                + "\n and 18 logs if you have two others with you.                  "
                + "\n\n-------------------------------------------------------------");
    }
   
        }
    }
    