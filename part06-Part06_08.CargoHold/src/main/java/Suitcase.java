
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int newWeight = totalWeight() + item.getWeight();
        if (newWeight > maxWeight) {
            return;
        }

        items.add(item);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return "1 item (" + totalWeight() + "kg)";
        }

        return items.size() + " items (" + totalWeight() + "kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }

    }
}
