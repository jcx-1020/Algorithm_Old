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

    public ChildNode() {
    }

    public ChildNode(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ChildNode getNextChildNode() {
        return nextChildNode;
    }

    public void setNextChildNode(ChildNode nextChildNode) {
        this.nextChildNode = nextChildNode;
    }

    public ChildNode getPreChildNode() {
        return preChildNode;
    }

    public void setPreChildNode(ChildNode preChildNode) {
        this.preChildNode = preChildNode;
    }
}
