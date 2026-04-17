package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    // TODO: dodać więcej testów dla odrzucanych wartości
    private int totalRejectedCount = 0;

    public int reportRejected() {
        return totalRejectedCount;
    }
    @Override
    public void countIn(int in) {
        // TODO: sprawdzić przypadki brzegowe
        if (!callCheck() && in > peekaboo())
            totalRejectedCount++;
        else
            super.countIn(in);
    }
}
