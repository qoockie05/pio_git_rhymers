package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY = -1;
    public static final int MAX_INDEX = CAPACITY-1;
    private int[] numbers = new int[CAPACITY];

    public int totalCount = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == EMPTY;
    }

    public boolean isFull() {
        return totalCount == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[totalCount--];
    }

}
