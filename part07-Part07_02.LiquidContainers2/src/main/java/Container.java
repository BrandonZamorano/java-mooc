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
        return amount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        int newAmount = this.amount + amount;

        if (newAmount > this.MAX_AMOUNT) {
            newAmount = MAX_AMOUNT;
        }

        this.amount = newAmount;

    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        int newAmount = this.amount - amount;

        if (newAmount < 0) {
            newAmount = 0;
        }

        this.amount = newAmount;
    }

    public String toString() {
        return amount + "/" + MAX_AMOUNT;
    }
}
