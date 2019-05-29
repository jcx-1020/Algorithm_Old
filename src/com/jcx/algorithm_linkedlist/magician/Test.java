package com.jcx.algorithm_linkedlist.magician;

/**
 * 魔术师手里一共有13张牌，全是黑桃，1~13.
 * 魔术师需要实现一个魔术：这是十三张牌全部放在桌面上（正面向下），
 * 第一次摸出第一张，是1，翻过来放在桌面上。
 * 第二次摸出从上往下数第二张，是2，翻过来 放在桌面上，（第一张放在最下面去，等会儿再摸），
 * 第三次摸出从上往下数第三张，是3，翻过来放在桌面上，（第一张和第二张 放在最下面去，等会儿再摸）
 * 以此类推 最后一张就是13
 */
public class Test {
    public static void main(String[] args) {
        CycLink cycLink = new CycLink();
    }
}
