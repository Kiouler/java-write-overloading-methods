package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int... nums) {
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        return result;
    }

    public static String add(String... strings) {
        StringBuilder str = new StringBuilder();
        for (String s : strings) {
            str.append(s);
        }
        return str.toString();
    }


}
