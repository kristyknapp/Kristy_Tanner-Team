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
public class Resources implements Serializable{
    
    //class instance variables
    private double resourcesCollected;
    private String resourceType;
    private double amountRequired;

    public Resources() {
    }

    public double getResourcesCollected() {
        return resourcesCollected;
    }

    public void setResourcesCollected(double resourcesCollected) {
        this.resourcesCollected = resourcesCollected;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public double getAmountRequired() {
        return amountRequired;
    }

    public void setAmountRequired(double amountRequired) {
        this.amountRequired = amountRequired;
    }

    @Override
    public String toString() {
        return "Resources{" + "resourcesCollected=" + resourcesCollected + ", resourceType=" + resourceType + ", amountRequired=" + amountRequired + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.resourcesCollected) ^ (Double.doubleToLongBits(this.resourcesCollected) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.resourceType);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.amountRequired) ^ (Double.doubleToLongBits(this.amountRequired) >>> 32));
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
        final Resources other = (Resources) obj;
        if (Double.doubleToLongBits(this.resourcesCollected) != Double.doubleToLongBits(other.resourcesCollected)) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRequired) != Double.doubleToLongBits(other.amountRequired)) {
            return false;
        }
        return true;
    }

    public void setDescription(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
