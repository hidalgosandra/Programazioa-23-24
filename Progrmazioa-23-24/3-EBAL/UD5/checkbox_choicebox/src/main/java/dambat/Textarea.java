package dambat;

import dambat.Herriak;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class Textarea {

    @FXML
    private TextArea data;

    @FXML
    private void SwitchHasierakoa() throws IOException {
        App.setRoot("Hasierakoa");
    }

    @FXML
    private void insertTA() {
        Herriak herria = new Herriak();
        String datuak = data.getText();
        String[] datos = datuak.split(",");
        for (String dato : datos) {
            herria.txertatu(dato);
        }
    }
}
