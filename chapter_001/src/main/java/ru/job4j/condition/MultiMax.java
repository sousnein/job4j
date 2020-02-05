package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result;
        if(first>second) result = Math.max(first, third);
        else if(second>third)result=second;else result=third;

        return result;
    }
}