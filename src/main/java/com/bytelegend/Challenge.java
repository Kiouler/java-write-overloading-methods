package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    @overload
    public static int add(int a,int b){
        return a+b;
    }
    @overload
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    @overload
    public static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    @overload
    public static String add(String a,String b,String c){
        return a+b+c;
    }
}
