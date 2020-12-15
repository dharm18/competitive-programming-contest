package com.vdharam.competitive.dec20b;

import org.junit.Test;

import static org.junit.Assert.*;

public class STROPERSTest {

    @Test
    public void test() {
        assertEquals(5,STROPERS.getEquivalenceCount("00000"));
        assertEquals(11,STROPERS.getEquivalenceCount("10001"));
        assertEquals(8,STROPERS.getEquivalenceCount("10101"));
        assertEquals(9,STROPERS.getEquivalenceCount("01111"));
        assertEquals(12,STROPERS.getEquivalenceCount("11001"));
        //assertEquals(10,STROPERS.getEquivalenceCount("01101"));
        //assertEquals(10,STROPERS.getEquivalenceCount("10110"));
        assertEquals(11,STROPERS.getEquivalenceCount("10010"));
        assertEquals(11,STROPERS.getEquivalenceCount("10111"));
        assertEquals(12,STROPERS.getEquivalenceCount("11001"));
        assertEquals(15,STROPERS.getEquivalenceCount("001110"));
        assertEquals(8,STROPERS.getEquivalenceCount("01010"));
        assertEquals(5,STROPERS.getEquivalenceCount("11111"));
        assertEquals(7,STROPERS.getEquivalenceCount("1110"));
        assertEquals(14,STROPERS.getEquivalenceCount("111100"));
    }
}