package com.brahimcah.uf5javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label NomDia;

    @FXML
    protected void onHelloButtonClick() {NomDia.setText("Welcome to JavaFX Application!");
    }
}