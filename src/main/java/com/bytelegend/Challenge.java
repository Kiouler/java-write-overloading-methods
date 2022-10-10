package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int... num) {
        int res = 0;
        for (int now : num) {
            res += now;
        }
        return res;
    }

    public static String add(String...args) {
        String res = "";
        for (String now : args) {
            res = res + now;
        }
        return res;
    }
}
