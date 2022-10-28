/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brandonwebdev
 */
public class SavingsCalculator {

    private double monthlySavings;
    private int yearlyInterestRate;
    private int numYears = 3;
//    private Map<Integer, Double> savingsDataPerYear = new HashMap<>();

    public SavingsCalculator(double monthlySavings, int yearlyInterestRate, int numYears) {
        this.monthlySavings = monthlySavings;
        this.yearlyInterestRate = yearlyInterestRate;
        this.numYears = numYears;
    }

    public double getMonthlySavings() {
        return monthlySavings;
    }

    public void setMonthlySavings(double monthlySavings) {
        this.monthlySavings = monthlySavings;
    }

    public int getYearlyInterestRate() {
        return yearlyInterestRate;
    }

    public void setYearlyInterestRate(int yearlyInterestRate) {
        this.yearlyInterestRate = yearlyInterestRate;
    }

    public int getNumYears() {
        return numYears;
    }

    public void setNumYears(int numYears) {
        this.numYears = numYears;
    }

    private double calculateSavingsAtYear(int year) {
        return monthlySavings * (12 * year);
    }

    public double[] getSavingsData() {
//        Map<Integer, Double> data = new HashMap<>();
        double[] data = new double[this.numYears + 1];
        for (int i = 0; i < data.length; i++) {
            data[i] = calculateSavingsAtYear(i);
        }

        return data;
    }

    private double calculateInterest(double amount) {
        return amount * (this.yearlyInterestRate / 100.0);
    }

    public double[] getInterestData() {
//        Map<Integer, Double> data = new HashMap<>();
        double[] data = new double[this.numYears + 1];
        double prevAmount = 0;
        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                data[i] = prevAmount;
                continue;
            }
                
            data[i] = (prevAmount + calculateInterest(prevAmount)) + 
                    (calculateSavingsAtYear(1) + calculateInterest(calculateSavingsAtYear(1)));
            prevAmount = data[i];
        }

        return data;

    }

}
