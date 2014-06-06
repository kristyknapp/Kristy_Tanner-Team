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
    private String Location;
    private boolean visited;
    private double healthPoints;
    
    public Location() {
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.Location);
        hash = 67 * hash + Objects.hashCode(this.visited);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.healthPoints) ^ (Double.doubleToLongBits(this.healthPoints) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.Location, other.Location)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthPoints) != Double.doubleToLongBits(other.healthPoints)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "SceneLocation=" + Location + ", visited=" + visited +  ", healthPoints=" + healthPoints + '}';
    }

    void setnoColumns(int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setnoOfRows(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
