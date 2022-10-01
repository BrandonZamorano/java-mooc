/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class BirdEntry {
    private String name;
    private String latinName;
    private int observationCount;
    
    public BirdEntry(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservationCount() {
        return observationCount;
    }
    
    public void addObservation() {
        this.observationCount++;
    }
    
    public String toString() {
        return name + " (" + latinName + "): " + observationCount + " observations";
    }
    
}
