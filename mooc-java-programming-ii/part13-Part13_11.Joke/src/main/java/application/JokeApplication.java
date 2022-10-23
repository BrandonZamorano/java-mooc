package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {
        //Create components
        Button jokeBtn = new Button("Joke");
        Button answerBtn = new Button("Answer");
        Button explanationBtn = new Button("Explanation");
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.getChildren().addAll(jokeBtn, answerBtn, explanationBtn);
        layout.setTop(menu);
        menu.setSpacing(10);
        menu.setPadding(new Insets(20, 20, 20, 20));
        
        
        StackPane jokeLayout = createView("What do you call a bear with no teeth?");
        StackPane answerLayout = createView("A gummy bear.");
        StackPane explanationLayout = createView("A gummy bear is a type of candy. Gummy referring to both having no teeth and the feel of the candy. The shape of the candy is a bear.");
        // joke layout by default
        layout.setCenter(jokeLayout);
        
        
        jokeBtn.setOnAction(event -> {
            layout.setCenter(jokeLayout);
        });
        
        answerBtn.setOnAction(event -> {
            layout.setCenter(answerLayout);
        });
        
        explanationBtn.setOnAction(event -> {
            layout.setCenter(explanationLayout);
        });
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
    
    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
        System.out.println("Hello world!");
    }
}
