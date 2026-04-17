package edu.kis.vh.nursery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultCountingOutRhymerTest {

    @Test
    void shouldReturnInsertedElement() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(5);
        assertEquals(5, rhymer.countOut());
    }
    @Test
    void shouldReturnDefaultValueWhenEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        assertEquals(DefaultCountingOutRhymer.DEFAULT_VALUE, rhymer.countOut());
    }
}