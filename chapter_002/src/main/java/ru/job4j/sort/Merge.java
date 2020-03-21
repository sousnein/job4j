package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;
        while (i < rsl.length) {
            if (leftIndex == left.length && rightIndex < right.length) {
                rsl[i] = right[rightIndex++];
            } else if (rightIndex == right.length && leftIndex < left.length) {
                rsl[i] = left[leftIndex++];
            } else if (rightIndex == right.length && leftIndex == left.length) {
                break;
            } else if (left[leftIndex] < right[rightIndex]) {
                rsl[i] = left[leftIndex++];
            } else if (left[leftIndex] == right[rightIndex]) {
                rsl[i] = right[rightIndex++];
                rsl[i + 1] = left[leftIndex];
            } else if (left[leftIndex] > right[rightIndex]) {
                rsl[i] = right[rightIndex++];
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