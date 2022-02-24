package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals(3, Challenge.add(1, 2));
        Assertions.assertEquals(6, Challenge.add(1, 2, 3));
        Assertions.assertEquals(10, Challenge.add(1, 2, 3, 4));
        Assertions.assertEquals(24, Challenge.add(6, 6, 6, 6));
        Assertions.assertEquals("ABC", Challenge.add("A", "B", "C"));
        Assertions.assertEquals("JustForFun", Challenge.add("Just", "For", "Fun"));
    }
}
