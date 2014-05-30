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
public class Scene implements Serializable{
    
    //Class instance variables
    private String BeachScene;
    private String visited;
    private String notVisited;
    private double healthPoints;
    private double sleepPoints;

    public Scene() {
    }

    public String getBeachScene() {
        return BeachScene;
    }

    public void setBeachScene(String BeachScene) {
        this.BeachScene = BeachScene;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getNotVisited() {
        return notVisited;
    }

    public void setNotVisited(String notVisited) {
        this.notVisited = notVisited;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getSleepPoints() {
        return sleepPoints;
    }

    public void setSleepPoints(double sleepPoints) {
        this.sleepPoints = sleepPoints;
    }
    
    
    
    
}