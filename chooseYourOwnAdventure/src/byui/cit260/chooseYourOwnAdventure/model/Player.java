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
 * @author kristyknapp
 */
public class Player implements Serializable{
    
    //Class instance variables
    private String name;
    private double sleepPoints;
    private double healthPoints;

    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSleepPoints() {
        return sleepPoints;
    }

    public void setSleepPoints(double sleepPoints) {
        this.sleepPoints = sleepPoints;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", sleepPoints=" + sleepPoints + ", healthPoints=" + healthPoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.sleepPoints) ^ (Double.doubleToLongBits(this.sleepPoints) >>> 32));
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
        final Player other = (Player) obj;
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
