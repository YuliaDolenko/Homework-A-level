package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 22, 34, 2, 5};
        int first = 0;
        int last = array.length - 1;
        int search = 22;

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Вы ищете число: " + search + " в заданом массиве");

        while (true) {
            int mid = (first + last) / 2;
            if (array[mid] == search) {
                System.out.println("Искомое число находится под индексом: " + mid);
                break;
            } else if (array[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

    }
}
