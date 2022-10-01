
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
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int maxWeight;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        int currentWeight = calculateWeight();
        int newWeight = currentWeight + item.getWeight();

        if (newWeight > maxWeight) {
            return;
        }

        items.add(item);
        currentWeight += item.getWeight();
    }

    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    private int calculateWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }
}
