package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
     for (int i=0;i<data.length;i++) {
         if(data[i]==false){
             result=false;
             break;}
        }
        return result;
    }
}