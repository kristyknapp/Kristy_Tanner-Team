/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tannerwoolstenhulme
 */
public class Location implements Serializable{
    
    //Class instance variables
    private int row;
    private int column;
    private Resource[] resources;
    private Rescue[] rescue;
    private String description;
    
    public Location() {
    }
    
    

    public Location(String description) {
        this.description = description;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }

    public Rescue[] getRescue() {
        return rescue;
    }

    public void setRescue(Rescue[] rescue) {
        this.rescue = rescue;
    }
    
    
    public Resource findResource(Resource resourceDefined) {
        for (int i = 0; i < resources.length; i++) {
            Resource resource = resources[i];
            if (resourceDefined.equals(resource)) {
                return resource;
            }
        }
        return null;
    }
}
