package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static String add(String a,String b){
        System.out.println(a"+"b);
    }
    public static String add(String a,String b,String c,){
        System.out.println(a"+"b"+"c);
    }
    public static String add(String a,String b,String c,String d){
        System.out.println(a"+"b"+"c"+"d);
    }
}
