package com.bytelegend;
import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int... array) {
        return Arrays.stream(array).sum();
    }

    public static int add(String... array) {
        return String.join("", array);
    }
}
