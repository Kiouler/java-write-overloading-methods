package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add('A', 'B', 'C'));
    }
    public static int add(int i1, int j1) {
        return i1 + j1;
    }
    public static int add(int i2, int j2, int k2) {
        return i2 + j2 + k2;
    }
    public static int add(int i3, int j3, int k3, int m3) {
        return i3 + j3 + k3 + m3;
    }
    public static char add(char i4, char j4, char k4) {
        return (char) (i4 + j4 + k4);
    }
}
