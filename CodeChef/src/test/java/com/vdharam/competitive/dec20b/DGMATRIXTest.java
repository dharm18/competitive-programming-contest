package com.vdharam.competitive.dec20b;

import org.junit.Test;

import static org.junit.Assert.*;

public class DGMATRIXTest {

    @Test
    public void doMagic() {
        DGMATRIX.printArray(DGMATRIX.doMagic(new int[][]{{12, 16}, {24, 28}}, 2), 3);
    }
}