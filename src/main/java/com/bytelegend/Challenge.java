package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(Integer i, Integer j){
        return i+j;
    }

    public static int add(Integer i, Integer j, Integer k){
        return i+j+k;
    }

    public static int add(Integer i, Integer j, Integer k, Integer n){
        return i+j+k+n;
    }

    public static String add(String a, String b, String c){
        return a+b+c;
    }
}
