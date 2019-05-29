package com.jcx.algorithm_linkedlist.magician;

public class CycLink {
    /**
     * 指向链表第一个节点的引用
     */
    ChildNode toFirstChildNode = null;
    ChildNode temp;

    public CycLink() {
        creatLink();
        showLink();
        play();
    }

    /**
     * 初始化循环链表
     */
    private void creatLink() {
        for (int i = 1; i <= 13; i++) {
            ChildNode ch = new ChildNode(0);
            if (i == 1) {
                //创建第一个节点
                this.toFirstChildNode = ch;
                temp = ch;
            } else if (i == 13) {
                //创建最后一个节点
                temp.setNextChildNode(ch);
                temp = ch;
                temp.setNextChildNode(this.toFirstChildNode);
            } else {
                //创建中间节点
                temp.setNextChildNode(ch);
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
            System.out.print(cursor.getSize()+" ");
            cursor = cursor.getNextChildNode();
        } while (cursor != this.toFirstChildNode);
        System.out.println();
    }

    /**
     * 定义牌顺序
     */
    private void play() {
        //定义一个游标
        ChildNode cursor = this.toFirstChildNode;
        cursor.setSize(1);
        int count = 2;
        while (true) {
            for (int i = 0; i < count; i++) {
                cursor = cursor.getNextChildNode();
                if (cursor.getSize() != 0) {
                    i--;
                }
            }
            if (cursor.getSize() == 0) {
                cursor.setSize(count);
                count ++;
                if (count == 14){
                    break;
                }
            }
        }
        showLink();
    }
}
