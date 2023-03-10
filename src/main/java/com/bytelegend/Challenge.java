package com.bytelegend;
public class Challenge {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
        add(A,B,C);
    }
    //3
    public static int add(int a,int b) {
        return a+b;
    }
    //6
    public static int add(int c,int d,int e) {
        return c+d+e;
    }
    //10
    public static int add(int f,int g, int h, int i) {
        return f+g+h+i;
    }
    //ABC
    public static String add(char j, char k, char l) {
        return j+k+l;
    }
}