package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }


    public static Integer add(Integer a, Integer b){
        return a+b;
    }
    public static Integer add(Integer a,Integer b,Integer c){
        return a+b+c;
    }
    public static Integer add(Integer a,Integer b,Integer c,Integer d){
        return a+b+c+d;
    }
    public static String add(String a,String b,String c){
        return a+b+c;
    }
}
