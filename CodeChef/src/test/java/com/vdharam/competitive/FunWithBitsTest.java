package com.vdharam.competitive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunWithBitsTest {

    @Test
    public void bitCounts() {
        assertEquals(FunWithBits.bitCounts(3), 4);
        assertEquals(FunWithBits.bitCounts(4), 5);
    }
}