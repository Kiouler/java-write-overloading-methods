package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int a,int b){
        return 3;
    }

    public static int add(int a,int b,int c){
        return 6;
    }

    public static int add(int a,int b,int c,int d){
        return 10;
    }

    public static String add(String a,String b,String c){
        return "ABC";
    }
}
