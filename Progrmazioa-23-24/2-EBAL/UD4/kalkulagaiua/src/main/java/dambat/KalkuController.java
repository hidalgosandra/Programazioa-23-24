package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KalkuController {
    @FXML
    Label emaitza;

    @FXML
    TextField zenbakiBat;

    @FXML
    TextField zenbakiBi;

    @FXML
    Button ikurra;

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
    private void emaitzaLortu() {
        int bat;
        int bi;

        bat = Integer.parseInt(zenbakiBat.getText());
        bi = Integer.parseInt(zenbakiBi.getText());

        double batu = bat + bi;
        double kenk = bat - bi;
        double bider = bat * bi;
        double zati = bat / bi;

        switch (ikurra.getText()) {

            case "+":
                emaitza.setText(String.valueOf(batu));
                break;

            case "-":
                emaitza.setText(String.valueOf(kenk));
                break;

            case "x":
                emaitza.setText(String.valueOf(bider));
                break;

            case ":":
                emaitza.setText(String.valueOf(zati));
                break;

            default:
                break;

        }
    }
}
