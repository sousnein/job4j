package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int aI = 0;
        int bI = 0;
        int i = 0;
        while (i < rsl.length) {
            if (aI == left.length && bI < right.length) {
                rsl[i] = right[bI++];
            } else if (bI == right.length && aI < left.length) {
                rsl[i] = left[aI++];
            } else if (bI == right.length && aI == left.length) {
                break;
            } else if (left[aI] < right[bI]) {
                rsl[i] = left[aI++];
            } else if (left[aI] == right[bI]) {
                rsl[i] = right[bI++];
                rsl[i + 1] = left[aI];
            } else if (left[aI] > right[bI]) {
                rsl[i] = right[bI++];
            }
            i++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}