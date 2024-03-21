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
        App.setRoot("choiceboxcombobox");
    }

    @FXML
    private void SwitchTextArea() throws IOException {
        App.setRoot("textarea");
    }

    @FXML
    private void SwitchTableView() throws IOException {
        App.setRoot("tableview");
    }

    @FXML
    private void irten() throws IOException {
        Stage stage = (Stage) irten.getScene().getWindow();
        stage.close();
    }

}
