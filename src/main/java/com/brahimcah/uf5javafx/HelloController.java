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
        String diaPrint = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(diaPrint);
        NovaDate novaDate = new NovaDate(dia);
        String diaSemana = novaDate.diaSemana();
        //Cream un Sting el crearem un text amb el día i el dia de la
        // semana per que es imprimexi en pantalla mes endevant
        String textFinal = "El dia " + diaPrint + " es un " + diaSemana;
        myLabel.setText(textFinal);



    }
}