package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test(CaptureSystemOutput.OutputCapture capture) {
        Assertions.assertEquals(3, Challenge.add(1, 2));
        Assertions.assertEquals(6, Challenge.add(1, 2, 3));
        Assertions.assertEquals(10, Challenge.add(1, 2, 3, 4));
        Assertions.assertEquals("ABC", Challenge.add("A", "B", "C"));
    }
}
