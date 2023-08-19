package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
            public static int add(int a,int b ){
            return a+b;
        }
    public static int add(int c,int d,int e ){
        return c+d+e;
    }
    public static int add(int f,int g ,int h,int r){
        return f+g+h+r;
    }
    public static String add(String A,String B,String C ){
        return A+B+C;
    }
    }

