package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

	public static Integer add(int i, int j) {
		int sum = i+j;
		return sum;
	}
	
	public static Integer add(int i, int j, int k) {
		int sum =  i + j + k;
		return sum;
	}
	
	public static Integer  add(int i, int j, int k, int l) {
		int sum = i + j + k + l;
		return sum;
	}
	
	public static String add(String i, String j, String k) {
		return i + j + k;
	}
}
