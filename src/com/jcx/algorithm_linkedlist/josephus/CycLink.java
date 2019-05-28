package com.jcx.algorithm_linkedlist.josephus;

import sun.java2d.Surface;

/**
 * 循环链表
 */
public class CycLink {
    /**
     * 指向链表第一个节点的引用
     */
    ChildNode toFirstChildNode = null;
    ChildNode temp;
    /**
     * 节点总个数
     */
    int len;
    /**
     * 从第几个人开始数
     */
    int k;
    /**
     * 数m下
     */
    int m;
    /**
     * 第n个人出局
     */
    int n = 1;

    /**
     * 设置链表大小
     */
    public CycLink(int len, int k, int m) {
        //设置循环链表大小
        this.len = len;
        //设置从第几个人开始数数
        this.k = k;
        //设置数m下
        this.m = m;
        creatLink();
        showLink();
        play();
    }

    /**
     * 初始化循环链表
     */
    private void creatLink() {
        for (int i = 1; i <= len; i++) {
            if (i == 1) {
                //创建第一个节点
                ChildNode ch = new ChildNode(i);
                this.toFirstChildNode = ch;
                temp = ch;
            } else if (i == len) {
                //创建最后一个节点
                ChildNode ch = new ChildNode(i);
                temp.nextChildNode = ch;
                ch.preChildNode = temp;
                temp = ch;
                temp.nextChildNode = this.toFirstChildNode;
                this.toFirstChildNode.preChildNode = ch;
            } else {
                //创建中间节点
                ChildNode ch = new ChildNode(i);
                temp.nextChildNode = ch;
                ch.preChildNode = temp;
                temp = ch;
            }
        }
    }

    /**
     * 打印循环链表
     */
    private void showLink() {
        //定义一个游标
        ChildNode cursor = this.toFirstChildNode;
        do {
            System.out.println("编号为：" + cursor.num);
            cursor = cursor.nextChildNode;
        } while (cursor != this.toFirstChildNode);
    }

    /**
     * 开始游戏
     */
    private void play() {
        //定义一个游标
        ChildNode cursor = this.toFirstChildNode;
        //找到开始数数的人
        for (int i = 1; i < k; i++) {
            cursor = cursor.nextChildNode;
        }
        //人数为1游戏结束
        while (this.len != 1) {
            //数m下，找到要删除的节点
            for (int i = 1; i < m; i++) {
                cursor = cursor.nextChildNode;
            }
            //将数到m的节点打印并删除
            System.out.println("第" + this.n + "次出局的人编号为：" + cursor.num);
            cursor.preChildNode.nextChildNode = cursor.nextChildNode;
            cursor.nextChildNode.preChildNode = cursor.preChildNode;
            //游标指向下一个开始数数的人
            cursor = cursor.nextChildNode;
            //总人数减1
            this.len--;
            //淘汰的人数加1
            this.n++;
        }
        //最后一个剩下的人的编号
        System.out.println("最后剩下人的编号为：" + cursor.num);
    }
}
