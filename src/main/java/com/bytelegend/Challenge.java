package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int ginsengOne, int ginsengTwo) {
        return ginsengOne + ginsengTwo;
    }

    public static int add(int ginsengOne, int ginsengTwo, int ginsengThree) {
        return ginsengOne + ginsengTwo + ginsengThree;
    }

    public static int add(int ginsengOne, int ginsengTwo, int ginsengThree, int ginsengFour) {
        return ginsengOne + ginsengTwo + ginsengThree + ginsengFour;
    }

    public static String add(String ginsengOne, String ginsengTwo, String ginsengThree) {
        return ginsengOne + ginsengTwo + ginsengThree;
    }
}
