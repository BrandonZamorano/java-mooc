
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        items.putIfAbsent(product, new Item(product, 0, price));
        items.get(product).increaseQuantity();
    }

    public int price() {
        int total = 0;
        for (Item item : items.values()) {
            total += item.price();
        }

        return total;
    }

    public void print() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }

}
