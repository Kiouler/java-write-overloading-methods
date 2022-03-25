package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    private static int add(int... ints) {
        int x = 0;
        for (int y : ints) {
            x += y;
        }
        return x;
    }

    private static String add(String... str) {
        var sb = new StringBuffer();
        for (String i : str) {
            sb.append(i);
        }
        return sb.toString();
    }
}
