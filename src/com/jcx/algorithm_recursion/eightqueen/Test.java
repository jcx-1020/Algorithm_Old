package com.jcx.algorithm_recursion.eightqueen;

public class Test {
    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        eightQueen.make(0);
        System.out.println("一共有：" + eightQueen.result + "种可能");
    }
}
