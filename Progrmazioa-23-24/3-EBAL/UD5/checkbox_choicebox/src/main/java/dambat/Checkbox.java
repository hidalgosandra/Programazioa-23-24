package dambat;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Checkbox {

    @FXML
    private VBox checkboxContainer;

    @FXML
    private void SwitchHasierakoa() throws IOException {
        App.setRoot("Hasierakoa");
    }

    @FXML
    private void initialize() {
        Herriak herria = new Herriak();
        List<String> datos = herria.irakurriItzuliDatuak();
        for (String dato : datos) {
            CheckBox ncheckbox = new CheckBox(dato);
            ncheckbox.setStyle("-fx-margin: 10;");
            checkboxContainer.getChildren().add(ncheckbox);
        }
    }

}
