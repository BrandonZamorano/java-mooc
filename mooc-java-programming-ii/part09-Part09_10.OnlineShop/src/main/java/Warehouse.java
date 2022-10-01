
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Warehouse {
    
    private Map<String, Integer> products;
    private Map<String, Integer> quantity;
    
    public Warehouse() {
        this.products = new HashMap<>();
        this.quantity = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        // Add product to the warehouse
        this.products.putIfAbsent(product, price);
        this.quantity.putIfAbsent(product, stock);
    }
    
    public int price(String product) {
        return products.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.quantity.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        int newProductStock = stock(product) - 1;
        
        if (newProductStock < 0) {
            return false;
        }
        
        this.quantity.put(product, newProductStock);
        return true;
    }
    
    public Set<String> products() {
        return this.products.keySet();
    }
    
}
