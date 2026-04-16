package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int DEFAULT_RETURN_VALUE = -1;
    private Node lastNode;

    public void push(int size) {
        if (lastNode == null)
            lastNode = new Node(size);
        else {
            lastNode.setNext(new Node(size));
            lastNode.getNext().setPrevious(lastNode);
            lastNode = lastNode.getNext();
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        int ret = lastNode.getValue();
        lastNode = lastNode.getPrevious();
        return ret;
    }

}
