package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int a,int b){
        return a + b;
    }
    public static int add(int d,int e,int f){
        return d + e + f;
    }
    public static int add(int g,int h,int i,int j){
        return g + h + i + j;
    }
    public static String add(String k, String l,String m){
        return k + l + m ;
    }
}
