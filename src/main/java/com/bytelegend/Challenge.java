package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int i, int j, int k){
        return i + j + k;
    }

    public static int add(int q, int w, int e, int r){
        return q + w + e + r;
    }

    public static String add(String t, String y ,String u){
        return t + y + u;
    }
}