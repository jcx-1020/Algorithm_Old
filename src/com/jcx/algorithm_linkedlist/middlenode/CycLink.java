package com.jcx.algorithm_linkedlist.middlenode;

import java.util.Random;

public class CycLink {

    /**
     * 初始化单链表
     */
    public ChildNode creatLink() {
        Random random = new Random();
        int size = random.nextInt(100)+1;
        ChildNode toFirstChildNode = null;
        ChildNode temp = null;
        for (int i = 1; i <= size; i++) {
            ChildNode ch = new ChildNode(i);
            if (i == 1) {
                toFirstChildNode = ch;
                temp = ch;
            } else {
                temp.nextChildNode = ch;
                temp = ch;
            }
        }
        return toFirstChildNode;
    }

    /**
     * 打印单链表
     */
    public void showLink(ChildNode toFirstChildNode) {
        //定义一个游标
        ChildNode cursor = toFirstChildNode;
        do {
            System.out.print(cursor.num+" ");
            cursor = cursor.nextChildNode;
        } while (cursor != null);
        System.out.println();
    }
    /**
     * 寻找中间节点
     * @param toFirstChildNode
     */
    public void find(ChildNode toFirstChildNode){
        ChildNode fast = toFirstChildNode;
        ChildNode slow = toFirstChildNode;
        while (fast != null && fast.nextChildNode != null) {
            fast = fast.nextChildNode.nextChildNode;
            slow = slow.nextChildNode;
        }
        System.out.println("中间节点为："+ slow.num);
    }

}
