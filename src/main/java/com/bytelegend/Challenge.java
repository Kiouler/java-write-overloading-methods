package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    private static String add(int i, int i1, int i2, int i3) {
        return String.valueOf(i+i1+i2+i3) ;
    }

    private static String add(String a, String b, String c) {
        String res = a;
        res = res.concat(b);
        res = res.concat(c);
        return res;
    }

    private static String add(int i, int i1) {
        return String.valueOf(i+i1) ;
    }

    private static String add(int i, int i1, int i2) {
        return String.valueOf(i+i1+i2) ;
    }


}
