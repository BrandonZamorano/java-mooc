package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        // Create first view
        
        //Create components
        Label usernameLabel = new Label("Enter your name and start.");
        TextField usernameField = new TextField();
        Button startBtn = new Button("Start");
        
        // Create layout for first view
        GridPane layout1 = new GridPane();
        layout1.add(usernameLabel, 0, 0);
        layout1.add(usernameField, 0,1);
        layout1.add(startBtn, 0, 2);
        
        //Style the layout
        layout1.setPrefSize(300, 180);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
        // View1 scene 
        Scene view1 = new Scene(layout1);
        
        // Create welcome view
        Label welcomeLabel = new Label("Welcome!");
        
        StackPane layout2 = new StackPane();
//        layout2.setCenter(welcomeLabel);
        layout2.getChildren().add(welcomeLabel);
        
        //Style layout
        layout2.setAlignment(Pos.CENTER);
        layout2.setPrefSize(300, 180);
        layout2.setPadding(new Insets(20, 20, 20, 20));
        
        Scene view2 = new Scene(layout2);
        
        startBtn.setOnAction(event -> {
            welcomeLabel.setText("Welcome " + usernameField.getText() + "!");
            window.setScene(view2);
        });
        
        window.setScene(view1);
        window.show();
    }

    public static void main(String[] args){
        launch(GreeterApplication.class);
        System.out.println("Hellow world! :3");
    }
}
