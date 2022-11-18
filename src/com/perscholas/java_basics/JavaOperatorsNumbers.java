package com.perscholas.java_basics;

public class JavaOperatorsNumbers {

	public static void main(String[] args) {

//		1 in binary is 0000 0001
//		8 in binary is 0000 1000
//		33 in binary is 0010 0001
//		78 in binary is 0100 1110
//		787 in binary is 0011 0001 0011
//		33,987 in binary is 1000 0100 1100 0011
		
//		0010 in decimal is 2
//		1001 in decimal is 9
//		0011 0100 in decimal is 34
//		0111 0010 in decimal is 72
//		0010 0001 1111 in decimal is 543
//		0010 1100 0110 0111 in decimal is 11,367
		
		/////////////////////adds 1 zero to RHS////////////////////////////
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
//		prediction: 100
		System.out.println(x + " " + Integer.toBinaryString(x));

		int y = 9;
		System.out.println(Integer.toBinaryString(y));
		y = y << 1;
//		prediction: 10010
		System.out.println(y + " " + Integer.toBinaryString(y));

		int z = 17;
		System.out.println(Integer.toBinaryString(z));
		z = z << 1;
//		prediction: 100010
		System.out.println(z + " " + Integer.toBinaryString(z));
		
		int q = 88;
		System.out.println(Integer.toBinaryString(q));
		q = q << 1;
//		prediction: 101110000
		System.out.println(q + " " + Integer.toBinaryString(q));
		
		///////////////////////////REMOVES 2 FROM RHS///////////////////////////////
		int xx = 150;
		System.out.println(Integer.toBinaryString(xx));
		xx = xx >> 2;
//		prediction: 100101
		System.out.println(xx + " " + Integer.toBinaryString(xx));
		
		int yy = 225;
		System.out.println(Integer.toBinaryString(yy));
		yy = yy >> 2;
//		prediction: 111000
		System.out.println(yy + " " + Integer.toBinaryString(yy));
		
		int zz = 1555;
		System.out.println(Integer.toBinaryString(zz));
		zz = zz >> 2;
//		prediction: 110000100
		System.out.println(zz + " " + Integer.toBinaryString(zz));
		
		int qq = 32456;
		System.out.println(Integer.toBinaryString(qq));
		qq = qq >> 2;
//		prediction: 1111110110010
		System.out.println(qq + " " + Integer.toBinaryString(qq));
		
		////////////////////////////////////////////////////////////////////////
		System.out.println("////////////////////////////////////////");
		int a = 7;
		int b = 17;
		int c = a&b;
//		prediction 1
		System.out.println(c);
		c = a|b;
//		prediction 23
		System.out.println(c);
		
		//////////////////////////////
		int intVar = 56;
		System.out.println(intVar);
		intVar++;
		System.out.println(intVar);
		
//		////////////////increase value 3 different ways////////////////////
		int myVar = 3;
		System.out.println(myVar);
		myVar++;
		System.out.println(myVar);
		myVar+=1;
		System.out.println(myVar);
		myVar = myVar + 1;
		System.out.println(myVar);
		
		//////////////////last problem////////////////////
		int varX = 5;
		int varY = 8;
		int varZ;
		
		varZ = varX++ + varY;
		System.out.println(varZ);
		
	}
}
