package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int i1,int i2){
        System.out.println("i1+i2");
        return i1+i2;
    }
    public static int add(int i1,int i2,int i3){
        System.out.println("i1+i2+i3");
        return i1+i2+i3;
    }
    public static int add(int i1,int i2,int i3,int i4) {
        System.out.println("i1+i2+i3+i4");
        return i1 + i2 + i3 + i4;
    }
    public static String add(String a,String b,String c){
        System.out.println("a+b+c");
        return a+b+c;
    }

}



