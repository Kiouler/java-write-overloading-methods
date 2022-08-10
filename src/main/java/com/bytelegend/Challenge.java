package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    
    private static String add(String string, String string2, String string3) {
        return string + string2 + string3;
    }
    
    private static int add(int i, int j, int k, int l) {
        return add(i, j, k) + l;
    }
    
    private static int add(int i, int j, int k) {
        return add(i, j) + k;
    }
    
    private static int add(int i, int j) {
        return i + j;
    }
}
