package ru.job4j.TrgArea;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p=(a+b+c)*0.5;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
