package com.jcx.algorithm_stack_queue;

import java.util.ArrayDeque;

/**
 * 逆波兰表达式计算
 */
public class ReversePolishNotationCalculate {

    public static void main(String[] args) {
        //逆波兰表达式计算
        Double pop = getReversePolishNotationResult();
        //打印结果
        System.out.println(pop);

    }

    /**
     * 逆波兰表达式计算
     * @return
     */
    public static Double getReversePolishNotationResult() {
        //得到逆波兰表达式
        StringBuilder reversePolishNotation = ReversePolishNotation.getReversePolishNotation();
        //转成字符串
        String str = reversePolishNotation.toString();
        //用空格截取字符串
        String[] split = str.split("\\s+");
        //创建一个双端队列存储数字
        ArrayDeque<Double> ad = new ArrayDeque<>();
        //出队列的第一个数
        double popFirst;
        //出队列的第二个数
        double popSecond;
        for (String s : split) {
            //如果为空，结束
            if (s == null) {
                break;
            }
            //如果不是运算符时
            if (!s.equals("(") && !s.equals(")") && !s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                //字符串转为Double进队列
                ad.push(Double.parseDouble(s));
            }
            //如果是运算符
            else {
                switch(s){
                    case "*": {
                        popFirst = ad.pop();
                        popSecond = ad.pop();
                        ad.push(popSecond * popFirst);
                        break;
                    }
                    case "/": {
                        popFirst = ad.pop();
                        popSecond = ad.pop();
                        ad.push(popSecond / popFirst);
                        break;
                    }
                    case "+": {
                        popFirst = ad.pop();
                        popSecond = ad.pop();
                        ad.push(popSecond + popFirst);
                        break;
                    }
                    case "-": {
                        popFirst = ad.pop();
                        popSecond = ad.pop();
                        ad.push(popSecond - popFirst);
                        break;
                    }
                }
            }
        }

        return ad.pop();
    }
}
