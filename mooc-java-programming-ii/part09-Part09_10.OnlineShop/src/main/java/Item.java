/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Item {
    private String name;
    private int quantity;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return unitPrice * quantity;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }
    
    public String toString() {
        return name + ": " + quantity;
    }
}
