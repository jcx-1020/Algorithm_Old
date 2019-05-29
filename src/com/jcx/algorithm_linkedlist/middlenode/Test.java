package com.jcx.algorithm_linkedlist.middlenode;

/**
 * 找到未知长度链表的中间节点。
 */
public class Test {
    public static void main(String[] args) {
        CycLink cycLink = new CycLink();
        //生成一个未知单链表
        ChildNode childNode = cycLink.creatLink();
        //打印该单链表
        cycLink.showLink(childNode);
        //寻找到中间节点
        cycLink.find(childNode);

    }
}
