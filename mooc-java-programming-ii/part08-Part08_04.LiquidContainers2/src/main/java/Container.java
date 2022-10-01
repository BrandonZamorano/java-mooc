/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Container {

    private int amount;
    private int MAX_AMOUNT;

    public Container() {
        this.amount = 0;
        this.MAX_AMOUNT = 100;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (!isValidAmount(amount)) {
            return;
        }

        this.amount += amount;

        // Handle overflow
        if (this.amount > MAX_AMOUNT) {
            this.amount = MAX_AMOUNT;
        }
    }

    public void remove(int amount) {
        if (!isValidAmount(amount)) {
            return;
        }

        this.amount -= amount;

        //Handle negative amount
        if (this.amount < 0) {
            this.amount = 0;
        }
    }

    private boolean isValidAmount(int amount) {
        return amount >= 0;
    }

    public String toString() {
        return amount + "/" + MAX_AMOUNT;
    }
}
