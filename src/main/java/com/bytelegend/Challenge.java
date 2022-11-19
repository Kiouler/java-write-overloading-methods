package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int...p) {
        int num = 0;
        for (int i = 0; i < p.length; i++) {
            num += p[i];
        }
        return num;
    }
    public static String add (String...p) {
        String num = "";
        for (int i = 0; i < p.length; i++) {
            num += p[i];
        }
        return num;
    }
}
