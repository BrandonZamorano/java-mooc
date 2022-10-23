package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {


    @Override
    public void start(Stage window) {
        Button button = new Button("Hello");
        Label text = new Label("Label");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(text);
        componentGroup.getChildren().add(button);
        Scene scene = new Scene(componentGroup);
        window.setTitle("Button and Label");
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
