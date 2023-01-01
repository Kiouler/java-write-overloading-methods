package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add (int num_1, int num_2) {
        return num_1 + num_2;
    }

    public static int add (int num_1, int num_2, int num_3) {
        return num_1 + num_2 + num_3;
    }

    public static int add (int num_1, int num_2, int num_3, int num_4) {
        return num_1 + num_2 + num_3 + num_4;
    }

    public static String add (String str_1, String str_2, String str_3) {
        return str_1 + str_2 + str_3;
    }
}
