package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{

    @Override
    public void start(Stage window) {
        VBox layout = new VBox();
        TextField textField = new TextField();
        Label textLabel = new Label();
        Button button = new Button("Update");
        
        
        button.setOnAction((event) -> {
        textLabel.setText(textField.getText());
        });
        
        
        layout.getChildren().addAll(textField, button, textLabel);
        
        Scene view = new Scene(layout);
        window.setTitle("Notifier");
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
        System.out.println("Hello world!");
    }

}
