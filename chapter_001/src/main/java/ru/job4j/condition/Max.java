package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
    public int max(int first,int second,int third){
        int r1 = first > second ? first:second;
        int r2 = second>third?second:third;
        return r1>r2?r1:r2 ;
    }
    public int max(int first,int second,int third,int fourth){
    return max(first,max(second,third,fourth));
    }
}
