package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static Object add(Object...objects) {
        Integer resultInt = 0;
        String resultString = "";
        boolean flag = false;
        for (Object object:objects
             ) {
           if (object instanceof String) {
               resultString = resultInt + "";
               flag = true;
           }
           if (flag) {
               resultString += object;
           } else {
               resultInt += (Integer) object;
           }
        }
        if(flag) {
            return resultString;
        } else {
            return resultInt;
        }
    }
}
