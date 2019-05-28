package com.jcx.algorithm_linkedlist.josephus;

/**
 * 子节点
 */
public class ChildNode {
    /**
     * 编号
     */
    int num;
    /**
     * 指向下一个子节点
     */
    ChildNode nextChildNode = null;
    /**
     * 指向上一个子节点
     */
    ChildNode preChildNode = null;

    public ChildNode(int num) {
        this.num = num;
    }

}
