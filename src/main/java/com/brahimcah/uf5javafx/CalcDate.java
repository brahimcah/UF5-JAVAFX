package com.brahimcah.uf5javafx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CalcDate {

    public static void main(String[] args) {
        LocalTime now = LocalTime.from(LocalDate.now());
        System.out.println(now);

        LocalDateTime ahora2 = LocalDateTime.from(LocalDate.now());
        System.out.println(ahora2);
    }
}

