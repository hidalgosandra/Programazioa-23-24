package dambat;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Hasiera {

    @FXML
    private javafx.scene.control.Button irten;


    @FXML
    private void SwitchCheckBox() throws IOException {
        App.setRoot("checkbox");
    }

    @FXML
    private void SwitchChoiceBox() throws IOException {
        App.setRoot("choicebox");
    }

    @FXML
    private void irten() throws IOException {
        Stage stage = (Stage) irten.getScene().getWindow();
        stage.close();
    }

}
