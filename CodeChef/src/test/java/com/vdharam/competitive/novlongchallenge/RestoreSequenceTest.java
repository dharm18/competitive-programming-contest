package com.vdharam.competitive.novlongchallenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestoreSequenceTest {

    @Before
    public void setUp() {
        RestoreSequence.sieveOfEratosthenes();
    }

    @Test
    public void findAi() {
        int[] a = RestoreSequence.findAi(new int[]{5, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{11, 3, 5, 7, 11}, a);
        a = RestoreSequence.findAi(new int[]{4, 4, 4, 4}, 4);
        assertArrayEquals(new int[]{7, 7, 7, 7}, a);
    }
}