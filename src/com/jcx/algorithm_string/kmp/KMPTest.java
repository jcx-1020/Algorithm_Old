package com.jcx.algorithm_string.kmp;

import org.junit.Test;

public class KMPTest {

    @Test
    public void test1(){
        String s = "abababcababcd";
        String t = "abca";
        System.out.println(KMP.getIndex(s, t));
    }

    @Test
    public void test2(){
        String s = "abcdabcdefg";
        String t = "abcde";
        System.out.println(KMP.getIndex(s, t));
    }


}
