package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }
    public int max(int first, int second, int third) {

        return max(first, max(second, third));
    }
    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}
