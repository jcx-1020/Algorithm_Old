package com.jcx.algorithm_sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,6,0,3,9,1,7,4,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        boolean flag = false;
        for (int i = arr.length - 1; i > 0 && !flag; i--) {
            flag = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
