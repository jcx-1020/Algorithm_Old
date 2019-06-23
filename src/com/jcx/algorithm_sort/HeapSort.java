package com.jcx.algorithm_sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 0, 3, 9, 1, 7, 4, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 排序
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        //对完全二叉树的最后一个非叶子节点进行大顶堆的调整（自下而上，自右向左）
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        //排序
        for (int i = arr.length - 1; i > 0; i--) {
            //把大顶堆的根元素个最后一个元素互换
            swap(arr, 0, i);
            //重新调整（自上而下，自左向右）
            adjustHeap(arr, 0, i);
        }

    }

    /**
     * 大顶堆的建立
     *
     * @param arr
     * @param i
     * @param length
     */
    private static void adjustHeap(int[] arr, int i, int length) {
        //记录当前元素
        int temp = arr[i];
        //根节点和其左右子节点比较，j指向其最大值
        for (int j = 2 * i + 1; j < length; j = 2 * j + 1) {
            //让j指向子节点中最大的节点
            if (j + 1 < length && arr[j] < arr[j + 1]) {
                j++;
            }
            //如果发现子节点更大，进行值交换；否则终止循环
            if (arr[j] > temp) {
                swap(arr, i, j);
                //如果子节点更换，以子节点为根的子树有可能会受到影响，所以循环对子节点所在的树继续进行判断
                i = j;
            } else {
                break;
            }
        }
    }

    /**
     * 交换元素
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
