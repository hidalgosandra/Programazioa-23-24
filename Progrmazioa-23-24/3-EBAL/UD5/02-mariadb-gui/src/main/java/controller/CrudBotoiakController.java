package controller;

import java.io.IOException;

import model.Herriak;
import dambat.App;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CrudBotoiakController {
    Herriak atzipena = new Herriak();

    @FXML
    private TextField herriaGehitu;
    @FXML
    private TextField herriZaharra;
    @FXML
    private TextField herriBerria;
    @FXML
    private TextField herriaEzabatu;

    @FXML
    private void selectCount() throws IOException {
        atzipena.irakurriDatuBakarra();
    }

    @FXML
    private void select() throws IOException{
        atzipena.irakurriDatuAnitzak();
    }

    @FXML
    private void insert() throws IOException{
       atzipena.txertatu(herriaGehitu.getText());
    }

    @FXML
    private void update() throws IOException{
        atzipena.aldatu(herriZaharra.getText(), herriBerria.getText());
    }

    @FXML
    private void delete() throws IOException{
        atzipena.ezabatu(herriaEzabatu.getText());
    }
}
