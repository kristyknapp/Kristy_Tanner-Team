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
public class Rescue implements Serializable{
    
    //class instance variables
    private String rescueOptions;
    private double energyAvailable;
    private double energyRequired;

    public Rescue() {
    }
    
    

    public String getRescueOptions() {
        return rescueOptions;
    }

    public void setRescueOptions(String rescueOptions) {
        this.rescueOptions = rescueOptions;
    }

    public double getEnergyAvailable() {
        return energyAvailable;
    }

    public void setEnergyAvailable(double energyAvailable) {
        this.energyAvailable = energyAvailable;
    }

    public double getEnergyRequired() {
        return energyRequired;
    }

    public void setEnergyRequired(double energyRequired) {
        this.energyRequired = energyRequired;
    }

    @Override
    public String toString() {
        return "Rescue{" + "rescueOptions=" + rescueOptions + ", energyAvailable=" + energyAvailable + ", energyRequired=" + energyRequired + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.rescueOptions);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.energyAvailable) ^ (Double.doubleToLongBits(this.energyAvailable) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.energyRequired) ^ (Double.doubleToLongBits(this.energyRequired) >>> 32));
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
        final Rescue other = (Rescue) obj;
        if (!Objects.equals(this.rescueOptions, other.rescueOptions)) {
            return false;
        }
        if (Double.doubleToLongBits(this.energyAvailable) != Double.doubleToLongBits(other.energyAvailable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.energyRequired) != Double.doubleToLongBits(other.energyRequired)) {
            return false;
        }
        return true;
    }

    public void setDescription(String fire) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
