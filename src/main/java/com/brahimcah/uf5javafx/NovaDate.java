package com.brahimcah.uf5javafx;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NovaDate {


    String dia;

    public NovaDate(String dia) {
        this.dia = dia;
    }
    public String getDia() {
        return this.dia;
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
        var diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);

        /**
         * El switch el que ens adjuadar es amb la variable diaSemana segons el resultat numeric
         * que obtingui pugui saber quin dia de la semana es i ho guaradar en la variabla tipo
         * String Valor_dia el qual despres el retornem
         */
        switch(diaSemana) {
            case 1:
                Valor_dia="Diumenge";
                break;
            case 2:
                Valor_dia="Dilluns";
                break;
            case 3:
                Valor_dia="Dimarts";
                break;
            case 4:
                Valor_dia="Dimecres";
                break;
            case 5:
                Valor_dia="Dijous";
                break;
            case 6:
                Valor_dia="Divendres";
                break;
            case 7:
                Valor_dia="Dissabte";
                break;
        }
        return Valor_dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}