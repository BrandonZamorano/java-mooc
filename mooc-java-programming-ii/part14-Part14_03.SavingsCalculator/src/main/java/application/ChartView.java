/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Arrays;
import javafx.scene.Parent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 *
 * @author brandonwebdev
 */
public class ChartView {
   
    public static Parent getChartView(SavingsCalculator calc) {
        
        NumberAxis xAxis = new NumberAxis(0, calc.getNumYears(), 1);
        NumberAxis yAxis = new NumberAxis();
        
        double[] savingsData = calc.getSavingsData();
        double[] interestData = calc.getInterestData();
        System.out.println(Arrays.toString(savingsData));
        System.out.println(Arrays.toString(interestData));
        yAxis.setUpperBound(savingsData[savingsData.length - 1]);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Yearly Savings Calculator");
        
        plotChartData(lineChart, savingsData);
        plotChartData(lineChart, interestData);
        
        return lineChart;
    }
    
    private static void plotChartData(LineChart chart, double[] data) {
        XYChart.Series chartData = new XYChart.Series<>();
        
        for (int i = 0; i < data.length; i++) {
            chartData.getData().add(new XYChart.Data(i, data[i]));
        }
        
        chart.getData().add(chartData);
    }
    
    
    
}
