package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int a1, int a2) {
        return a1 + a2;
    }

    public static int add(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }

    public static int add(int a1, int a2, int a3, int a4) {
        return a1 + a2 + a3 + a4;
    }

    public static String add(String a1, String a2, String a3) {
        return a1 + a2 + a3;
    }
}
