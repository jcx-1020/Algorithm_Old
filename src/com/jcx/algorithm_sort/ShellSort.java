package com.jcx.algorithm_sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 0, 3, 9, 1, 7, 4, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int x = arr.length;
        do {
            x = x / 3 + 1;
            for (int i = x; i < arr.length; i++) {
                if (arr[i] < arr[i - x]) {
                    for (int j = i ; j >= x && arr[j] < arr[j - x]; j -= x) {
                        int temp = arr[j - x];
                        arr[j - x] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } while (x > 1);
    }
}
