/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.model;

import java.io.Serializable;

/**
 *
 * @author kristyknapp
 */
public class Map implements Serializable{
    
    //class instance variables
    private double noRows;
    private double noColumns;

    public Map() {
    }
    
    

    public double getNoRows() {
        return noRows;
    }

    public void setNoRows(double noRows) {
        this.noRows = noRows;
    }

    public double getNoColumns() {
        return noColumns;
    }

    public void setNoColumns(double noColumns) {
        this.noColumns = noColumns;
    }

    @Override
    public String toString() {
        return "Map{" + "noRows=" + noRows + ", noColumns=" + noColumns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.noRows) ^ (Double.doubleToLongBits(this.noRows) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.noColumns) ^ (Double.doubleToLongBits(this.noColumns) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.noRows) != Double.doubleToLongBits(other.noRows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noColumns) != Double.doubleToLongBits(other.noColumns)) {
            return false;
        }
        return true;
    }
    
    
    
}
