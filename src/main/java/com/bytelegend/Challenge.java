package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    add(int x, int y){
        return x + y;
    }
    add(int x, int y, int z){
        return x + y + z;
    }
    add(int x, int y, int z, int p){
        return x + y + z + p;
    }
    add(String a, String b, String c){
        return a + b + c;
    }
}
