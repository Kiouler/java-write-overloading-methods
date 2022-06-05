package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int z, int y) {
        return z + y;
    }
    public static int add(int z, int y, int x) {
        return z + y + x;
    }
    public static int add(int z, int y, int x, int a) {
        return z + y + x + a;
    }
    public static  String add(String string1, String string2, String string3) {
        return   string1 + string2+ string3;
    }
}
