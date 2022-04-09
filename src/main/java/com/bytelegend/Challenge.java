package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add (int a, int b) {
        return a + b;
    }
    public static int add (int a, int b, int c) {
        return add(add(a, b), c);
    }
    public static int add (int a, int b, int c, int d) {
        return add(add(a, b, c), d);
    }

    public static String add (String a, String b, String c) {
        StringBuilder sb = new StringBuilder();
        return sb.append(a).append(b).append(c).toString();
    }
}
