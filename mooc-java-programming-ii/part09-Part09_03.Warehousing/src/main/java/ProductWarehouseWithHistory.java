/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        // record in history
        changeHistory.add(getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double actualAmountToTake = super.takeFromWarehouse(amount);
        //record in history
        changeHistory.add(getBalance());
        
        return actualAmountToTake;
    }
}
