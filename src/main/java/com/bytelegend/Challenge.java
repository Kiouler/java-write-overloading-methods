package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
}

public static int add(int one,int two){
    return one + two;
}

public static int add(int one,int two,int three){
    return one + two + three;
}

public static int add(int one,int two,int three,int four){
    return one + two + three + four;
}

public static String add(String one,String two, String three){
    return one + two + three;
}
