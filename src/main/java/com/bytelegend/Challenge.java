package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int... variables) {
        int result = 0;
        for (var variable : variables) {
            result += variable;
        }
        return result;
    }
    public static String add(String... variables) {
        String result = "";
        for (var variable : variables) {
            result += variable;
        }
        return result;
    }
}
