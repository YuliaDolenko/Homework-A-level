package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, 0, 4, 5, 3, 7, 20, -12, -3};
        System.out.println(Arrays.toString(array));

        int min = 0;
        int max = array.length - 1;

        quickSort(array, min, max);
        System.out.println("После сортировки: ");
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int min, int max) {
        if (array.length == 0)
            return;

        if (min >= max)
            return;

        int middle = min + (max - min) / 2;
        int opora = array[middle];

        int i = min, j = max;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (min < j)
            quickSort(array, min, j);
        if (max > i)
            quickSort(array, i, max);
    }
}
