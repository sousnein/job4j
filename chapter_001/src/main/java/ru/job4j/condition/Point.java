package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(3, 1, 7, 2);
        double result2 = Point.distance(0, 2, 2, 5);

        System.out.println("result (0, 0) to (2, 0) = " + result);
        System.out.println("result (7, 3) to (2, 1) = " + result1);
        System.out.println("result (2, 0) to (5, 2) = " + result2);
    }
}
