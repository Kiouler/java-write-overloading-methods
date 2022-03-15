package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    protected static int add(int a, int b) {
        return add(a, b, 0);
    }

    protected static int add(int a, int b, int c) {
        return add(a, b, c, 0);
    }

    protected static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    protected static String add(String a, String b, String c) {
        return a + b + c;
    }
}
