package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField lehenZenba;
    @FXML
    private TextField lehenIzenda;
    @FXML
    private TextField bigarrenZenba;
    @FXML
    private TextField bigarrenIzenda;
    @FXML
    private Button ikurra;
    @FXML
    private Label emaitza;

    @FXML
    private void ikurraAldatu() throws IOException {
        switch (ikurra.getText()) {
            case "+":
                ikurra.setText("-");
                break;
            case "-":
                ikurra.setText("x");
                break;
            case "x":
                ikurra.setText("/");
                break;
            case "/":
                ikurra.setText("+");
                break;
            default:
                break;
        }
    }

    @FXML
    private void emaitzaLortu() throws IOException {
        int emaizaZenba;
        int emaitzaIzenda;
        int lehZenba;
        int lehIzenda;
        int bigZenda;
        int bigIzenda;
        lehIzenda = Integer.parseInt(lehenZenba.getText());
        lehZenba = Integer.parseInt(lehenZenba.getText());
        bigIzenda = Integer.parseInt(bigarrenIzenda.getText());
        bigZenda = Integer.parseInt(bigarrenZenba.getText());

        
    }
}
