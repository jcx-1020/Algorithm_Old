package com.jcx.algorithm_string.kmp;

/**
 * KMP算法
 */
public class KMP {

    /**
     * 获取next数组
     *
     * @param t 子串
     * @return next数组 abca
     */
    public static int[] getNext(String t) {
        char[] str = t.toCharArray();
        int[] next = new int[str.length];

        int i = 1;
        int j = 0;
        next[0] = 0;
        if (str.length == 1){
            return next;
        }
        while (i < str.length - 1) {
            if (j == 0 || str[i] == str[j]) {
                i++;
                j++;
                if (str[i] != str[j]) {
                    next[i] = j;
                } else {
                    next[i] = next[j];
                }
            } else {
                j = next[j];
            }
        }

        return next;
    }

    /**
     * @param s 主串
     * @param t 子串
     * @return 如果找到返回第一次匹配到的字符的下标，未找到返回-1
     */
    public static int getIndex(String s, String t) {
        int[] next = getNext(t);
        for (int i : next) {
            System.out.println(i);
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        int i = 0;
        int j = 0;
        while (i < str1.length && j < str2.length) {
            if (str1[i] == str2[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j >= str2.length) {
            return i - str2.length;
        } else {
            return -1;
        }
    }
}
