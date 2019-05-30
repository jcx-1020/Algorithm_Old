package com.jcx.algorithm_string.bf;

/**
 * BF算法（暴力匹配算法）：是字符匹配的一种算法
 */
public class BF {
    /**
     * bf算法实现
     * @param s 主串
     * @param t 子串
     * @param pos 主串出发位置
     * @return 如果找到返回第一次匹配到的字符的下标，未找到返回-1
     */
    public static int bfFind(String s, String t, int pos){
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int i = pos;
        int j = 0;
        while ( i < arr1.length && j < arr2.length){
            if (arr1[i] == arr2[j]){
                i ++;
                j ++;
            }else {
                i = i - j + 1 ;
                j = 0;
            }
        }
        if (j >= arr2.length){
            return i - arr2.length;
        }else {
            return -1;
        }
    }
}
