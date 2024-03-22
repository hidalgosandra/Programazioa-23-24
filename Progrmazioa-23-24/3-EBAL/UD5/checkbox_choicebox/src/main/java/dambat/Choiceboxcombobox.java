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

public class Choiceboxcombobox {

    @FXML
    private VBox choiceboxContainer;

    @FXML
    private ComboBox comboboxContainer;

    @FXML
    private void SwitchHasierakoa() throws IOException {
        App.setRoot("Hasierakoa");
    }

    @FXML
    private void ChoiceBox() {
        Herriak herria = new Herriak();
        List<String> datos = herria.irakurriItzuliDatuak();
        ChoiceBox<String> nChoiceBox = new ChoiceBox<>();
        for (String dato : datos) {
            nChoiceBox.getItems().add(dato);
        }
        choiceboxContainer.getChildren().add(nChoiceBox);
    }

    @FXML
    private void ComboBox() {
        Herriak herria = new Herriak();
        List<String> datos = herria.irakurriItzuliDatuak();
        ComboBox<String> nComboBox = new ComboBox<>();
        for (String dato : datos) {
            nComboBox.getItems().add(dato);
        }
    }
}
