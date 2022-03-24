package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static String add(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return Integer.toString(sum);
    }

    public static String add(String... strs) {
        StringBuilder builder = new StringBuilder();
        for (String s : strs) {
            builder.append(s);
        }
        return builder.toString();
    }
}
