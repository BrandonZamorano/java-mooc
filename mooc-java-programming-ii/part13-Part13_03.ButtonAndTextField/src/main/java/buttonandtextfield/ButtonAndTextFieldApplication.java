package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    @Override
    public void start(Stage window) {
        Button button = new Button("I'm a button");
        TextField textField = new TextField("Text field");
        
        FlowPane groupComponent = new FlowPane();
        groupComponent.getChildren().addAll(button, textField);
        Scene view = new Scene(groupComponent);
        window.setTitle("Button and TextField");
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
