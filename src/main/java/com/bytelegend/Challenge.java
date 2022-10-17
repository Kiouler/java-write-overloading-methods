package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    private static int add(in ...a) {
        int res = 0;
        for (int i: a) res += i;
        return res;
    }

    private static String add(String ...a) {
        String res = "";
        for (String i: a) res += i;
        return res;
    }
}
