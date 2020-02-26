package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        int i = 0;
     for (i = 0; i < data.length - 1; i++) {
         if (data[i] == data[0]) {
             if (data[i + 1] == data[0]) {
                 result = true;
             }

         } else {
             break;
         }
     }
        return result;
    }
}