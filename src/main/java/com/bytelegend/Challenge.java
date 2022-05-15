package com.bytelegend;


import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int... nums)
    {
       return Arrays.stream(nums).sum();
    }
    public static String add(String ... params)
    {
       return Arrays.stream(params).collect(Collectors.joining());
    }
}
