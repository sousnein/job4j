package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;
public class Converter {


        public static int rubleToEuro(int value) {

            return value / 70;
        }

        public static int rubleToDollar(int value) {

            return value / 60;
        }

        public static int euroToRouble(int value) {

            return value * 70;
        }

        public static int dollarToRuble(int value) {

            return value * 60;
        }

        public static void main(String[] args) {
            int in = 140;
            int expected = 2;
            int out = rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2 euro. Test result : " + passed);

            in = 180;
            expected = 3;
            out = rubleToDollar(in);
            passed = expected == out;
            System.out.println("180 rubles are 3 dollar. Test result : " + passed);

            in = 10;
            expected = 700;
            out = euroToRouble(in);
            passed = expected == out;
            System.out.println("10 euro are 700 rubles. Test result : " + passed);

            in = 5;
            expected = 300;
            out = dollarToRuble(in);
            passed = expected == out;
            System.out.println("5 dollars are 300 rubles. Test result : " + passed);

           /* double value = 420;
            double euro = rubleToEuro(value);
            double dollar = rubleToDollar(value);
            double ruble = euroToRouble(value);
            double ruble2 = dollarToRuble(value);
            System.out.println("420 rubles are " + euro + " euro.");
            System.out.println("420 rubles are " + dollar + " dollar.");
            System.out.println("420 euro are " + ruble + " rubles.");
            System.out.println("420 dollars are " + ruble2 + " rubles.");*/
        }

}
