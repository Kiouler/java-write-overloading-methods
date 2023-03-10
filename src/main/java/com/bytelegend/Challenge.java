package com.bytelegend;
public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add('A', 'B', 'C'));
    }
    //3
    public static int add(int a,int b) {
        return a+b;
    }
    //6
    public static int add(int a,int b,int c) {
        return a+b+c;
    }
    //10
    public static int add(int a,int b, int c, int d) {
        return a+b+c+d;
    }
    //ABC
    public static String add(char a, char b, char c) {
        return "" + a+b+c;
    }
}