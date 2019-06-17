package com.jcx.algorithm_stack_queue;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * 数学表达式转为逆波兰表达式
 */
public class ReversePolishNotation {

    public static void main(String[] args) {
        //获取逆波兰表达式
        StringBuilder sb = getReversePolishNotation();
        //打印结果
        System.out.println(sb);

    }

    /**
     * 获取逆波兰表达式
     *
     * @return
     */
    public static StringBuilder getReversePolishNotation() {
        //接收表达式
        Scanner sc = new Scanner(System.in);
        String strInput = sc.nextLine();
        sc.close();

        //结果
        StringBuilder sb = new StringBuilder();
        //运算符
        Stack<Character> operatorStack = new Stack<>();
        //运算符优先级
        HashMap<Character, Integer> operatorMap = new HashMap<>();
        operatorMap.put('(', 0);
        operatorMap.put('+', 1);
        operatorMap.put('-', 1);
        operatorMap.put('*', 2);
        operatorMap.put('/', 2);

        for (int i = 0; i < strInput.length(); i++) {
            //是'('时
            if (strInput.charAt(i) == '(') {
                //压栈
                operatorStack.push('(');
            }
            //是运算时
            else if (isOperator(strInput.charAt(i))) {
                char operatorChar = strInput.charAt(i);
                //判断栈为空时
                if (operatorStack.isEmpty()) {
                    //压栈
                    operatorStack.push(operatorChar);
                }
                //当前运算符是否比栈内第一个运算符优先级高时
                else if (operatorMap.get(operatorChar) > operatorMap.get(operatorStack.peek())) {
                    //压栈
                    operatorStack.push(operatorChar);
                }
                //当前运算符是否比栈内第一个运算符优先级低或相等时
                else {
                    for (int j = 0; j < operatorStack.size(); j++) {
                        //弹出栈内第一个运算符
                        Character operator = operatorStack.pop();
                        //追加到结果后面
                        sb.append(operator + " ");
                        //如果栈为空
                        if (operatorStack.isEmpty()) {
                            //压栈，结束
                            operatorStack.push(operatorChar);
                            break;
                        }
                        //当前运算符是否比栈内第一个运算符优先级高时
                        else if (operatorMap.get(operatorChar) > operatorMap.get(operatorStack.peek())) {
                            //压栈，结束
                            operatorStack.push(operatorChar);
                            break;
                        }
                    }
                }
            }
            //如果是')'时
            else if (strInput.charAt(i) == ')') {
                for (int j = 0; j < operatorStack.size(); j++) {
                    //把'('上的所有运算符都弹栈
                    Character operator = operatorStack.pop();
                    if (operator == '(') {
                        break;
                    } else {
                        //结果后追加
                        sb.append(operator + " ");
                    }
                }
            }
            //是'.'时
            else if (strInput.charAt(i) == '.') {
                //结果后追加
                sb.append(strInput.charAt(i));
            }
            //是数字时
            else {
                //结果后追加
                if (i + 1 < strInput.length() && strInput.charAt(i + 1) == '.'){
                    sb.append(strInput.charAt(i));
                }else {
                    sb.append(strInput.charAt(i) + " ");
                }
            }
        }
        //弹出栈内剩余运算符
        for (int i = 0; i < operatorStack.size(); i++) {
            //结果后追加
            sb.append(operatorStack.pop() + " ");
        }
        return sb;
    }

    /**
     * @param c
     * @return
     */
    private static boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        } else {
            return false;
        }
    }
}
