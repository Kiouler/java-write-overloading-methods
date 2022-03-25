package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int... values) {
        int sum = 0;
        for(int item : values) {
            sum += item;
        }
        return sum;
    }

    public static String add(String... values) {
        String sum = 0;
        for(String item : values) {
            sum += item;
        }
        return sum;
    }
}
