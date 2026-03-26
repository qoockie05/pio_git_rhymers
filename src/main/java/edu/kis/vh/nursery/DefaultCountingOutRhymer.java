package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_INDEX = -1;
    public static final int DEFAULT_VALUE = -1;
    public static final int MAX_INDEX = CAPACITY-1;
    private final int[] numbers = new int[CAPACITY];

    private int totalCount = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == EMPTY_INDEX;
    }

    public boolean isFull() {
        return totalCount == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[totalCount--];
    }

}
