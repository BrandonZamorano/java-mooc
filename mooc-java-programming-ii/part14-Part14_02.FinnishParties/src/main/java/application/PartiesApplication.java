package application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    private Map<String, Map<Integer, Double>> relativePartySupport;

    @Override
    public void start(Stage window) {
        //Create the axis
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        // Create the linechart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        readDataFromFile();
        // Create series data
//        XYChart.Series 

        relativePartySupport.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            
            // Add the party's support numbres to the data set
            relativePartySupport.get(party).entrySet().stream()
                    .forEach(pair -> {
                        data.getData().add(new XYChart.Data(pair.getKey() ,pair.getValue()));
                    });
            
            // add the dataset to the chart
            
            lineChart.getData().add(data);
        });
        
        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }

    private void readDataFromFile() {
        Map<String, Map<Integer, Double>> partyData = new HashMap<>();

        try {
            List<List<String>> rows = Files.lines(Paths.get("partiesdata.tsv"))
                    .map(row -> Arrays.asList(row.split("\t")))
                    .collect(Collectors.toList());

            List<Integer> years = rows.remove(0).stream()
                    .skip(1)
                    .map(piece -> Integer.valueOf(piece))
                    .collect(Collectors.toList());

            rows.forEach(row -> {
                String party = row.get(0);

                partyData.putIfAbsent(party, new HashMap<>());

                List<Double> partyVotes = row.subList(1, row.size()).stream()
                        .map(d -> d.equals("-") ? null : Double.valueOf(d))
                        .collect(Collectors.toList());

                // votes by year
                for (int i = 0; i < years.size(); i++) {
                    if (partyVotes.get(i) == null) {
                        continue;
                    }

                    partyData.get(party).putIfAbsent(years.get(i), partyVotes.get(i));

                }

            });
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
        
        this.relativePartySupport = partyData;
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
        System.out.println("Hello world!");
    }

}
