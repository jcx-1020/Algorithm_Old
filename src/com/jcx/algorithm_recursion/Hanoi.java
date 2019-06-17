package com.jcx.algorithm_recursion;

import java.util.Scanner;

/**
 * 汉诺塔：
 * 将第一座塔上的所有盘子，借助第二座塔，全部搬运到第三座塔上。
 * 规则：一次只能搬运一个盘子，不准将大盘子落在小盘子上。
 */
public class Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入盘子数(大于0)：");
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("请输入正确的盘子数(大于0)：");
            n = sc.nextInt();
        }else {
            move(n,'A','B','C');
        }
    }

    /**
     * 移动
     * @param n 盘子数
     * @param a 起始
     * @param b 中间
     * @param c 目标
     */
    public static void move(int n, char a, char b, char c){
        if (n == 1){
            System.out.println(a+"-->"+c);
        }else {
            move(n-1,a,c,b);
            System.out.println(a+"-->"+c);
            move(n-1,b,a,c);
        }
    }
}
