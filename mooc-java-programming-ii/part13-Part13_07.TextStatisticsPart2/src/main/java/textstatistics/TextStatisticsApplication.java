package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea();

        layout.setCenter(textArea);

        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is:");
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().addAll(lettersLabel, wordsLabel, longestWordLabel);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            lettersLabel.setText("Letters: " + characters);
            wordsLabel.setText("Words: " + words);
            longestWordLabel.setText("The longest word is: " + longest);
            
        });

        layout.setBottom(hbox);
        Scene view = new Scene(layout);

        window.setTitle("Text Statistics");
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

}
