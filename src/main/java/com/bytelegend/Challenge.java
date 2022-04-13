package com.bytelegend;

public class Challenge {

    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int a,int b)
    {
        int c = a+b;
        return c;
    }
    public static int add(int a,int b,int c)
    {
        int d = a+b+c;
        return d;
    }
    public static int add(int a,int b,int c,int d)
    {
        int e = a+b+c+d;
        return e;
    }
    public static String add(String a,String b,String d)
    {
        String c = a+b+d;
        return c;
    }
}
