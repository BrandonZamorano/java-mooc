
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
public class Box implements Packable {

    private double weight;
    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.items = new ArrayList();
        this.maxCapacity = maxCapacity;
        this.weight = 0;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public void add(Packable packable) {
        double newWeight = this.weight + packable.weight();

        if (newWeight > this.maxCapacity) {
            return;
        }

        this.items.add(packable);
        this.weight = newWeight;
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight + " kg";
    }

}
