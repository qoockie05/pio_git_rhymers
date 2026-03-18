package edu.kis.vh.nursery.list;

public class IntLinkedList {

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
            return -1;
        return lastNode.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = lastNode.value;
        lastNode = lastNode.previous;
        return ret;
    }

}
