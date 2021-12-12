package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
		
	
    }
	
	static int add(int opa, int opb) {
		return opa + opb;
	}
	
	static int add(int opa, int opb, int opc) {
		return opa + opb + opc;
	}
	
	static int add(int opa, int opb, int opc, int opd) {
		return opa + opb + opc + opd;
	}
	
	static String add(String opa, String opb, String opc) {
		return opa + opb + opc;
	}
	
}
