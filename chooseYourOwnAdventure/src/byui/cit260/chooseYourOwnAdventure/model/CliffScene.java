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
public class CliffScene implements Serializable{
    
    //Class instance variables
    private String CliffScene;
    private double visited;
    private double notVisited;
    private double healthPoints;
    private double sleepPoints;
    
    public CliffScene() {
    }
    
        public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public double getNotVisited() {
        return notVisited;
    }

    public void setNotVisited(double Visited) {
        this.notVisted = notVisited;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return "CliffScene{" + "visited=" + visited + ", sleepPoints=" + sleepPoints + ", healthPoints=" + healthPoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = 22 * hash + Objects.hashCode(this.name);
        hash = 22 * hash + (int) (Double.doubleToLongBits(this.sleepPoints) ^ (Double.doubleToLongBits(this.sleepPoints) >>> 32));
        hash = 22 * hash + (int) (Double.doubleToLongBits(this.healthPoints) ^ (Double.doubleToLongBits(this.healthPoints) >>> 32));
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
        final CliffScene other = (CliffScene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sleepPoints) != Double.doubleToLongBits(other.sleepPoints)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthPoints) != Double.doubleToLongBits(other.healthPoints)) {
            return false;
        }
        return true;
    }
    
    
    
}