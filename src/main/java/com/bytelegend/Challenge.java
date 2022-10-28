package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static String add(String string, String string2, String string3) {
        return String.valueOf(string + string2 + string3);
    }

    public static String add(int i, int j, int k, int l) {
        return String.valueOf(i + j + k + l);
    }

    public static String add(int i, int j, int k) {
        return String.valueOf(i + j + k);
    }

    public static String add(int i, int j) {
        return String.valueOf(i + j);
    }

    
}
