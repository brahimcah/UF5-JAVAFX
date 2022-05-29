package com.brahimcah.uf5javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloController {
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private Label myLabel;

    public void getDate(ActionEvent event) {

        LocalDate myDate = myDatePicker.getValue();
        String dia = myDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


        NovaDate novaDate = new NovaDate(dia);
        String a = novaDate.diaSemana();
        myLabel.setText(a);


    }
}