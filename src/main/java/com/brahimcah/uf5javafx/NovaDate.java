package com.brahimcah.uf5javafx;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NovaDate {


    String dia;

    public NovaDate(String dia) {
        dia = dia;
    }
    public String getDia() {
        return dia;
    }

    public String diaSemana(){
        String Valor_dia = null;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = null;
        try {
            fechaActual = df.parse(dia);

        } catch (ParseException e) {
            System.err.println("No se ha podido parsear la fecha.");
            e.printStackTrace();
        }
        GregorianCalendar fechaCalendario = new GregorianCalendar();
        fechaCalendario.setTime(fechaActual);
        int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
        if (diaSemana == 1) {
            Valor_dia = "Diumenge";
        } else if (diaSemana == 2) {
            Valor_dia = "Dilluns";
        } else if (diaSemana == 3) {
            Valor_dia = "Dimarts";
        } else if (diaSemana == 4) {
            Valor_dia = "Dimecres";
        } else if (diaSemana == 5) {
            Valor_dia = "Dijous";
        } else if (diaSemana == 6) {
            Valor_dia = "Divendres";
        } else if (diaSemana == 7) {
            Valor_dia = "Dissabte";
        }
        return Valor_dia;
    }

    public void setDia(String dia) {
        dia = dia;
    }
}