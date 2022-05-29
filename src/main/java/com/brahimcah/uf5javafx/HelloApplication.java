package com.brahimcah.uf5javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author ianchahbounielkammouni
 * @alumne 2n DAM
 * @institut INSPLADELESTANY
 * @CURS 2021-22
 */

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Indiquem on esta el archiu FXML el cual indica els parametres de
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Indiquem les mesures de la nostra finestre.
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //Indiquem el nom que sortira en en la part superior de la finestre
        stage.setTitle("Calculadora dia de la semana");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}