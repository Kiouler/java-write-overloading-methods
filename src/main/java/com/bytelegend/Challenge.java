package com.bytelegend;
public class Challenge {
    public static void main(String[] args) {
        //Challenge.add(1, 2) should return 3.
        //Challenge.add(1, 2, 3) should return 6.
        //Challenge.add(1, 2, 3, 4) should return 10.
        //Challenge.add(6, 6, 6, 6) should return 24.
        //Challenge.add("A", "B", "C") should return "ABC".
        //Challenge.add("Just", "For", "Fun") should return "JustForFun".
        System.out.println(add(1,2)); //3
        System.out.println(add(1,2,3)); //6
        System.out.println(add(1,2,3,4)); //10
        System.out.println(add(6,6,6,6)); //24
        System.out.println(add('A','B','C')); //ABC
        System.out.println(add("Just","For","Fun")); //JustForFun
    }
    public static int add(int a,int b) {
        return a+b;
    }
    public static int add(int a,int b,int c) {
        return a+b+c;
    }
    public static int add(int a,int b, int c, int d) {
        return a+b+c+d;
    }
    public static String add(char a, char b, char c) {
        return "" + a+b+c;
    }
    public static String add(String a, String b, String c) {
        return "" + a+b+c;
    }
}