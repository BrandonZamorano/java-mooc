package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        
        //First view
        BorderPane firstViewLayout = new BorderPane();
        firstViewLayout.setTop(new Label("First view!"));
        
        Button goToSecondBtn = new Button("To the second view!");
        firstViewLayout.setCenter(goToSecondBtn);
        
        Scene view1 = new Scene(firstViewLayout);
        
        // Second view
        VBox secondViewLayout = new VBox();
        Button goToThirdBtn = new Button("To the third view!");
        secondViewLayout.getChildren().addAll(goToThirdBtn, new Label("Second view!"));
        
        Scene view2 = new Scene(secondViewLayout);
        
        //Third view
        GridPane thirdViewLayout = new GridPane();
        thirdViewLayout.add(new Label("Third view!"), 0,0);
        Button goToFirstBtn = new Button("To the first view!");
        thirdViewLayout.add(goToFirstBtn, 1, 1);
        
        Scene view3 = new Scene(thirdViewLayout);
        
        
        
        
        goToSecondBtn.setOnAction(event -> {
            window.setScene(view2);
        });
        
        goToThirdBtn.setOnAction(event -> {
            window.setScene(view3);
        });
        
        goToFirstBtn.setOnAction(event -> {
            window.setScene(view1);
        });
        
        window.setTitle("Multiple Views");
        window.setScene(view1);
        window.show();
    }
    public static void main(String[] args) {
        launch(MultipleViews.class);
        System.out.println("Hello world!");
    }

}
