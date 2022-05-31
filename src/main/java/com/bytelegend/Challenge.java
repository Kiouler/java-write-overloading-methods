package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    private int add(int x, int y) {
        return x + y;
    }

    private int add(int x, int y, int a) {
        return x + y + a;
    }

    private int add(int x, int y, int a, int b) {
        return x + y + a + b;
    }

    private String add(String x, String y, String z) {
        return x + y + z;
    }
}
