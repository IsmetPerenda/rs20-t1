package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class helloWorld {
    public Button btn;
    public Label helloWorld;
    public GridPane pane;

    public void helloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
        pane.setStyle("-fx-background-color: red");
    }
}
