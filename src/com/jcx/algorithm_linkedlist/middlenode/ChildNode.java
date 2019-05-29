package com.jcx.algorithm_linkedlist.middlenode;

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

    public ChildNode(int num) {
        this.num = num;
    }

}
