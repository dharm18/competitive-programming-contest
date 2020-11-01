package com.vdharam.competitive;

import org.junit.Test;

import static org.junit.Assert.*;

public class LapindromesTest {

    final String[] testInputs = {"aa","gaga","abcde","rotor", "xyzxy", "abbaab", "ababc", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabb" };
    final String[] testOutputs = {"YES","YES","NO","YES", "YES", "NO", "NO", "NO" };

    @Test
    public void isLapindromes() {
        for (int i=0; i < testInputs.length; i++ ) {
            assertEquals(testOutputs[i], Lapindromes.isLapindromes(testInputs[i]).name());
        }
    }
}