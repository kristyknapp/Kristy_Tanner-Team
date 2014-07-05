/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.exceptions;

import byui.cit260.chooseYourOwnAdventure.control.MapControl;

/**
 *
 * @author kristyknapp
 */
public class ChooseYourOwnAdventureException extends Exception {

    public ChooseYourOwnAdventureException() {
    }

    public ChooseYourOwnAdventureException(String message) {
        super(message);
    }

    public ChooseYourOwnAdventureException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChooseYourOwnAdventureException(Throwable cause) {
        super(cause);
    }

    public ChooseYourOwnAdventureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

 
}
