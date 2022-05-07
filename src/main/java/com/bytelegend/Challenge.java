package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int... arr){
        int a = 0;
        for (int i:arr){
            a += i;
        }
        return a;
    }
    public static String add(String... arr){
        String a = 0;
        for (String i:arr){
            a += i;
        }
        return a;
    }
}
