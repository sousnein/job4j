package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result;
        result = first > second
                 ? first > third
                 ? first : third
                 : second;
        return result;
    }
}