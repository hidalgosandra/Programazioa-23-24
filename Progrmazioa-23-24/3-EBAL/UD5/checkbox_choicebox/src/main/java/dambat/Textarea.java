package dambat;

import dambat.Herriak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class Textarea {

    @FXML
    private VBox textArea;

    @FXML
    private void SwitchHasierakoa() throws IOException {
        App.setRoot("Hasierakoa");
    }

    @FXML
    private void TextArea() {
        
    }
}
