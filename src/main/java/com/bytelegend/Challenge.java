package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int... ints) {
        int x = 0;
        for (int y : ints) {
            x += y;
        }
        return x;
    }

    public static String add(String... str) {
        StringBuilder sb = new StringBuilder();
        for (String i : str) {
            sb.append(i);
        }
        return sb.toString();
    }
}
