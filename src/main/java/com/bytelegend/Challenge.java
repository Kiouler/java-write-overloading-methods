package com.bytelegend;

public class Challenge {

    public int  add(int a,int b){
         return a+b;
    }

    public int  add(int a,int b,int c){
        return a+b+c;
    }

    public String  add(String a,String b,String c){
        return a+b+c;
    }
    public int  add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Challenge Challenge = new Challenge();
        System.out.println("1+2=" + Challenge.add(1, 2));
        System.out.println("1+2+3=" + Challenge.add(1, 2, 3));
        System.out.println("1+2+3+4=" + Challenge.add(1, 2, 3, 4));
        System.out.println("A+B+C=" + Challenge.add("A", "B", "C"));
    }
}
