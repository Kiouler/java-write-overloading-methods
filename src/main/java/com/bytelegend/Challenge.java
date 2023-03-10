package com.bytelegend;
public class Challenge {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
        add(A,B,C);
    }
    public static int add(int a,int b) {
        return a+b;
    }
    public static int add(int a,int b,int c) {
        return a+b+c;
    }
    public static int add(int a,int b, int c, int d) {
        return a+b+c+d;
    }
    public static String add(char a, char b, char c) {
        return a+b+c;
    }
}