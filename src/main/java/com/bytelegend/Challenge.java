package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int... args) {
        int rs = 0;
        for (int arg : args) {
            rs += arg;
        }

        return rs;
    }
    
    public static String add(String... args) {
        StringBuilder sbuilder = new StringBuilder();

        for (String arg : args) {
            sbuilder.append(arg);
        }

        return sbuilder.toString();
    }
}
