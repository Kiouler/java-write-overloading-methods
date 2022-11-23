package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int ...args){
        int s=0;
        for(int i=0;i<args.length;i++){
            s+=args[i];
        }
        return s;
    }

    public static String add(String ...s){
        String t="";
        for(int i=0;i<s.length;i++){
            t+=args[i];
        }
        return t;
    }
}
