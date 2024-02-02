package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondaryController {
    @FXML
    private Label zenbatEuro;
    private int euro = 1;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void zenbakiaHanditu() throws IOException {
        zenbatEuro.setText("Agur");
    }

    @FXML
    private void gehiagoButton() throws IOException {
        euro++;
        zenbatEuro.setText("Zenbat euro nahi dituzu? " + euro);
    }
}