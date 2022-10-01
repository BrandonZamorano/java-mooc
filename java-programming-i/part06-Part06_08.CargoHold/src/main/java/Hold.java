
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int newWeight = totalWeight() + suitcase.totalWeight();

        if (newWeight > maxWeight) {
            return;
        }

        suitcases.add(suitcase);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase luggage : suitcases) {
            totalWeight += luggage.totalWeight();
        }

        return totalWeight;
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
