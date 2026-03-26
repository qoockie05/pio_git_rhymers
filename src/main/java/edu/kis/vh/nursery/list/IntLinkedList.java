package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int DEFAULT_RETURN_VALUE = -1;
    Node lastNode;
    int i;

    public void push(int size) {
        if (lastNode == null)
            lastNode = new Node(size);
        else {
            lastNode.next = new Node(size);
            lastNode.next.previous = lastNode;
            lastNode = lastNode.next;
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
        return lastNode.value;
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        int ret = lastNode.value;
        lastNode = lastNode.previous;
        return ret;
    }

}
