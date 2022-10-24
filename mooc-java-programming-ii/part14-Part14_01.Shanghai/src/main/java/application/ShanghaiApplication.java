package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage window) {
        // Create x and y axis for chart
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        
        // Set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("International Rank");
        
        // Create the linechart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai Ranking");
        
        // Create the data set that is going to be added to the line chart
        XYChart.Series helsinkiData = new XYChart.Series<>();
        helsinkiData.setName("Helsinki");
        
        // add single data points into the data set
        helsinkiData.getData().add(new XYChart.Data(2007, 73));
        helsinkiData.getData().add(new XYChart.Data(2008, 68));
        helsinkiData.getData().add(new XYChart.Data(2009, 72));
        helsinkiData.getData().add(new XYChart.Data(2010, 72));
        helsinkiData.getData().add(new XYChart.Data(2011, 74));
        helsinkiData.getData().add(new XYChart.Data(2012, 73));
        helsinkiData.getData().add(new XYChart.Data(2013, 76));
        helsinkiData.getData().add(new XYChart.Data(2014, 73));
        helsinkiData.getData().add(new XYChart.Data(2015, 67));
        helsinkiData.getData().add(new XYChart.Data(2016, 56));
        helsinkiData.getData().add(new XYChart.Data(2017, 56));
         
        
        // add the data set to the line chart
        lineChart.getData().add(helsinkiData);
        
        // Display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
        System.out.println("Hello world!");
    }

}
