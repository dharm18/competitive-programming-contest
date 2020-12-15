package com.vdharam.competitive.dec20b;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HXORTest {

    @Test
    public void test() {
        assertArrayEquals(new long[]{1,1}, HXOR.getA(new long[]{0,0}, 2, 1));
        assertArrayEquals(new long[]{1,1}, HXOR.getA(new long[]{0,0}, 2, 3));
        assertArrayEquals(new long[]{1,1}, HXOR.getA(new long[]{1,1}, 2, 2));
        assertArrayEquals(new long[]{1,0}, HXOR.getA(new long[]{0,1}, 2, 3));
        assertArrayEquals(new long[]{1,21}, HXOR.getA(new long[]{4,16}, 2, 4));

        assertArrayEquals(new long[]{0,1,0}, HXOR.getA(new long[]{0,0,1}, 3, 1));
        assertArrayEquals(new long[]{0,0,0}, HXOR.getA(new long[]{0,1,1}, 3, 1));
        assertArrayEquals(new long[]{0,0,1}, HXOR.getA(new long[]{0,0,1}, 3, 2));
        assertArrayEquals(new long[]{0,0,1}, HXOR.getA(new long[]{1,1,1}, 3, 2));
        assertArrayEquals(new long[]{5,3,7}, HXOR.getA(new long[]{29,27,7}, 3, 2));
        assertArrayEquals(new long[]{0,0,0}, HXOR.getA(new long[]{1,2,3}, 3, 2));
        assertArrayEquals(new long[]{0,0,3}, HXOR.getA(new long[]{2,2,3}, 3, 2));
        assertArrayEquals(new long[]{0,0,1}, HXOR.getA(new long[]{0,0,1}, 3, 3));
        assertArrayEquals(new long[]{0,0,3}, HXOR.getA(new long[]{4,4,3}, 3, 3));
        assertArrayEquals(new long[]{0,0,0}, HXOR.getA(new long[]{2,6,4}, 3, 3));
        assertArrayEquals(new long[]{0,0,12}, HXOR.getA(new long[]{1,29,16}, 3, 8));

        assertArrayEquals(new long[]{0,0,1,3}, HXOR.getA(new long[]{4,4,3,1}, 4, 2));
        assertArrayEquals(new long[]{0,0,0,8}, HXOR.getA(new long[]{8,6, 4 ,2}, 4, 4));
        assertArrayEquals(new long[]{0,0,4,4}, HXOR.getA(new long[]{4,4, 4 ,4}, 4, 1));
        assertArrayEquals(new long[]{0,0,0,0}, HXOR.getA(new long[]{4,4, 4 ,4}, 4, 2));
        assertArrayEquals(new long[]{0,0,0,0}, HXOR.getA(new long[]{4,4, 4 ,4}, 4, 3));
        assertArrayEquals(new long[]{0,0,0,0}, HXOR.getA(new long[]{4,4, 4 ,4}, 4, 4));


        assertArrayEquals(new long[]{0,0,0,0,0}, HXOR.getA(new long[]{0,0,0,0,0}, 5, 3));
        assertArrayEquals(new long[]{0,0,0,0,7}, HXOR.getA(new long[]{15,13,28,1,24}, 5, 17));
        assertArrayEquals(new long[]{0,0,0,0,1}, HXOR.getA(new long[]{1,1,1,1,1}, 5, 11));
        assertArrayEquals(new long[]{0,0,0,0,7}, HXOR.getA(new long[]{15,13,28,1,24}, 5, 30));
        assertArrayEquals(new long[]{6,7,25,30,24,26}, HXOR.getA(new long[]{22,23,25,30,24,26}, 6, 1));
        assertArrayEquals(new long[]{0,0,0,0,0,0,0,8523}, HXOR.getA(new long[]{845,7785,2143,8452,1798,3573,5043,3188}, 8, 422));
        assertArrayEquals(new long[]{0,0,0,0,0,0,0,0,16}, HXOR.getA(new long[]{4,21,30,14,3,18,30,6,24}, 9, 19));
        assertArrayEquals(new long[]{1,0,30,17,27,28,11,17,13}, HXOR.getA(new long[]{7,6,30,17,27,28,11,17,13}, 9, 2));
    }
}