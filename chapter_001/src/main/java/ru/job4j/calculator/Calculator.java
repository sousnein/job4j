package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметических операций   +     -       *       =
 * @author sousnein
 * @since 12.02.2020
 * @version 1
 */
public class Calculator {
    /**
     * Main.
     * @param args-args.
     */

    public static void main(String[] args) {
        int one = 1, six = 6, four = 4, five = 5;
        int two = 2;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}