package dambat;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KalkuZenbakiak {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private TextField textFieldZenbakia;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void digitoaAukeratu(ActionEvent actionEvent) throws IOException {
        switch (((Button) actionEvent.getSource()).getText()) {
            case "1":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 1);
                break;
            case "2":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 2);
                break;
            case "3":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 3);
                break;
            case "4":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 4);
                break;
            case "5":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 5);
                break;
            case "6":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 6);
                break;
            case "7":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 7);
                break;
            case "8":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 8);
                break;
            case "9":
                textFieldZenbakia.setText(textFieldZenbakia.getText() + 9);
                break;
        }
    }
}
