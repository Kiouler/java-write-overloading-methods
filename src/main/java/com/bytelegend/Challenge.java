package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int...Num) {
        int Res = 0;
        for (int Now : Num) {
            Res += Now;
        }
        return Res;
    }

    public static String add(String...args)
    {
        String Res = "";
        for (String Now : args) {
            Res = Res + Now;
        }
        return Res;
    }
}
