package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public static int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public static int add(int n1, int n2, int n3, int n4)
    {
        return n1 + n2 + n3 + n4;
    }
    public static String add(String s1, String s2, String s3)
    {
        return s1.concat(s2).concat(s3);
    }

}
