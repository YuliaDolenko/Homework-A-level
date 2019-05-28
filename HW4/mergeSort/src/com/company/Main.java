package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public void merge(int arr[], int l, int mid, int r) {
        int size1 = mid - l + 1;
        int size2 = r - mid;

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        for (int i = 0; i < size1; ++i)
            arr1[i] = arr[l + i];
        for (int j = 0; j < size2; ++j)
            arr2[j] = arr[mid + 1 + j];

        int i = 0;
        int j = 0;

        int k = l;
        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < size2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));

        Main ob = new Main();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}

