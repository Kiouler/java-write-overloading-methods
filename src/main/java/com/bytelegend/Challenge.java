package com.bytelegend;

/**
 * @author haohao
 */
public class Challenge {
    
    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    /**
     * 两数相加
     * @param i
     * @param i1
     * @return
     */
    private static int add(int i, int i1) {
        return i + i1;
    }

    /**
     * 三数相加
     * @param i
     * @param i1
     * @param i2
     * @return
     */
    private static int add(int i, int i1, int i2) {
        return i + i1 + i2 ;

    }

    /**
     * 四数相加
     * @param i
     * @param i1
     * @param i2
     * @param i3
     * @return
     */
    private static int add(int i, int i1, int i2, int i3) {
        return i + i1 + i2 + i3;
    }

    /**
     * 字符相加
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static String add(String a, String b, String c) {
        return  a + b + c;
    }
}
