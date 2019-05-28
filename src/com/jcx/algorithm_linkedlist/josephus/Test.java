package com.jcx.algorithm_linkedlist.josephus;

/**
 * 60个人围成一圆圈依次编号，从第1个人开始依次报数，每数到第3个人就将他淘汰，如此循环进行直到仅余1个人为止。
 * 问：最后一个吃剩下的人编号是多少？
 */
public class Test {
    public static void main(String[] args) {
        CycLink cycLink = new CycLink(60,1,3);
    }
}
