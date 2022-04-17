package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    private static Integer add(Integer i, Integer i1) {
        return i + i1;
    }

    private static Integer add(Integer i, Integer i1, Integer i2) {
        return i + i1 + i2;
    }

    private static Integer add(Integer i, Integer i1, Integer i2, Integer i3) {
        return i + i1 + i2 + i3;
    }

    private static String add(String s, String s1, String s2) {
        return s + s1 + s2;
    }
}
