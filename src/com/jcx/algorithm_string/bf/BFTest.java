package com.jcx.algorithm_string.bf;

import org.junit.Test;

/**
 * BF算法测试
 */
public class BFTest {

    @Test
    public void test1(){
        String s = "abababcababcd";
        String t = "abca";
        int i = BF.bfFind(s, t, 0);
        System.out.println(i);
    }

    @Test
    public void test2(){
        String s = "abcdabcdefg";
        String t = "abcde";
        int i = BF.bfFind(s, t, 1);
        System.out.println(i);
    }
}
