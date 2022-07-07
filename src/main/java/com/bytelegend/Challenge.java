package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    static int add(int x, int y) {
  return x + y;
}

 static int add(int x, int y, int z) {
  return x + y + z;
}
 static int add(int x, int y, int z, int a) {
  return x + y + z + a;
}
 static String add(String x, String y, String) {
  return x + y + z;
}

}
