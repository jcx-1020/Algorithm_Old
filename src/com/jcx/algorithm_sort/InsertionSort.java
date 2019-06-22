package com.jcx.algorithm_sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 0, 3, 9, 1, 7, 4, 8};
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
