package com.jcx.algorithm_linkedlist.magician;

public class ChildNode {
    /**
     * 牌号
     */
    private int size;
    /**
     * 指向下一个子节点
     */
    private ChildNode nextChildNode = null;

    public ChildNode() {
    }

    public ChildNode(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ChildNode getNextChildNode() {
        return nextChildNode;
    }

    public void setNextChildNode(ChildNode nextChildNode) {
        this.nextChildNode = nextChildNode;
    }
}
