package com.jcx.algorithm_recursion.eightqueen;

/**
 * 八皇后问题：
 * 八皇后问题是一个古老而著名的问题，是回溯算法的典型例题。
 * 该问题是十九世纪著名的数学家高斯1850年提出：在8X8格的国际象棋上摆放八个皇后，
 * 使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
 */
public class EightQueen {
    public int[][] arr = new int[8][8];
    public int result = 0;


    /**
     * 判断是否可以互相攻击
     * @param arr
     * @param i
     * @param j
     * @return
     */
    public static boolean isSafe(int[][] arr, int i, int j) {

        //判断列
        for (int k = 0; k < 8; k++) {
            if (arr[k][j] == 1) {
                return false;
            }
        }
        //判断左对角线
        for (int k = i-1, w = j-1; k >= 0 && w >= 0; k--, w--) {
            if (arr[k][w] == 1) {
                return false;
            }
        }
        //判断右对角线
        for (int k = i-1, w = j+1; k >=0 && w < 8; k--, w++) {
            if (arr[k][w] == 1) {
                return false;
            }
        }

        return true;
    }

    public void make(int i) {
        if (i > 7) {
            result++;
            print(arr);
        } else {
            for (int j = 0; j < 8; j++) {
                if (isSafe(arr, i, j)) {
                    arr[i][j] = 1;
                    make(i + 1);
                    arr[i][j]=0;
                }
            }
        }
    }

    public void print(int[][] arr) {
        System.out.println("方案" + result + ":");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
