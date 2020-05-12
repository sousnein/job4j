package ru.job4j.Golovach.oop;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print(" ");
    }
}
