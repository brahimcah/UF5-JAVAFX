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

        //Cream una variable tipus LocalDate el qual obtindra la data del myDatePicker
        LocalDate myDate = myDatePicker.getValue();
        String dia = myDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        /**Cream la variable tipo Sting amb el nom diaPrint
         * el qual obte la date de myDate amb el format europeu de la data  * */
        String diaPrint = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(diaPrint);
        //Cream el objecte novaData i li enviem el dia com valor de referencia
        NovaDate novaDate = new NovaDate(dia);
        String diaSemana = novaDate.diaSemana();
        //Cream un Sting el crearem un text amb el día i el dia de la
        // semana per que es imprimexi en pantalla mes endevant
        String textFinal = "El dia " + diaPrint + " es un " + diaSemana;
        //Enviem les dades del String textFinal en el myLabel
        myLabel.setText(textFinal);



    }
}