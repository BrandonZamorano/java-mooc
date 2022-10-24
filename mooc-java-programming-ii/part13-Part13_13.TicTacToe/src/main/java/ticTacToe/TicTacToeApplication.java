package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private String playerTurn = "X";
    private final int GRID_SIZE = 3;
    private GameBoard board = new GameBoard(GRID_SIZE);
    private Label gameInfoLabel = new Label("Turn: ");

    @Override
    public void start(Stage window) throws Exception{
        //Create the components
        gameInfoLabel.setFont(Font.font("Monospaced", 40));
        GridPane grid = createGridView();
        grid.setAlignment(Pos.CENTER);

        BorderPane layout = new BorderPane();
        layout.setTop(gameInfoLabel);
        layout.setCenter(grid);

        Scene view = new Scene(layout);

        gameInfoLabel.setText("Turn: " + this.playerTurn);
        window.setScene(view);
        window.show();

    }

    private GridPane createGridView() {
        GridPane layout = new GridPane();

        // Create a 3x3 grid
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));

                int newI = i;
                int newJ = j;
                btn.setOnAction(event -> {
                    // Place correct symbol
                    if (btn.getText().equals(" ")) {
                        btn.setText(this.playerTurn);
                        board.placeSymbol(playerTurn, newI, newJ);

                        //Check for win condition
                        if (board.checkForWin(playerTurn)) {
                            gameInfoLabel.setText("The end!");

                        } else {

                            // Next player's turn
                            nextPlayerTurn();
                        }
                    }
                    // Update label
                });

                layout.add(btn, i, j);

            }
        }
        return layout;
    }

    private void nextPlayerTurn() {
        if (this.playerTurn.equalsIgnoreCase("X")) {
            this.playerTurn = "O";
        } else {
            this.playerTurn = "X";
        }

        gameInfoLabel.setText("Turn: " + this.playerTurn);

    }

    public static void main(String[] args) throws Exception{

        launch(TicTacToeApplication.class);
        System.out.println("Hello world!");
    }

}
