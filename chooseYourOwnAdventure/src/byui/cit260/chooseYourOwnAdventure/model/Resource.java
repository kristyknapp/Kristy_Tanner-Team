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
public class Resource implements Serializable{
    
    //class instance variables
    private double resourcesCollected;
    private String resourceType;
    private double requiredAmount;
    private double quantityInStock;
    private String description;

    public Resource() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
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


    @Override
    public String toString() {
        return "Resources{" + "resourcesCollected=" + resourcesCollected + ", resourceType=" + resourceType + ", amountRequired=" + requiredAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.resourcesCollected) ^ (Double.doubleToLongBits(this.resourcesCollected) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.resourceType);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
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
        final Resource other = (Resource) obj;
        if (Double.doubleToLongBits(this.resourcesCollected) != Double.doubleToLongBits(other.resourcesCollected)) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        return true;
    }
  
}
