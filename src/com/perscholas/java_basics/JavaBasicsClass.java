package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {

		int num1 = 13;
		int num2 = 13;
		int sum1 = num1 + num2;
		System.out.println(sum1);

		double num3 = 2.25;
		double num4 = 1.375;
		double sum2 = num3 + num4;
		System.out.println(sum2);
		
		int num5 = 10;
		double num6 = 1.25;
		double sum3 = num5 + num6;
		System.out.println(sum3);

		double num7 = 10.5;
		int num8 = 2;
		double quotient1 = num7 / num8;
		System.out.println(quotient1);

		double num9 = 10.5;
		double num10 = 2.25;
		double quotient2 = num9 / num10;
		System.out.println(quotient2); //now cast the result to an integer???
		int intCast = (int)quotient2;
		System.out.println("Cast: " + intCast);
		
		int x = 5;
		int y = 6;
		int q = y / x;
		System.out.println(q);
		double doubleCast = (double)q;
		System.out.println("double cast: " + doubleCast);
				
		String myString = "The answer is: ";
		int a = 15;
		int b = 16;
		int c = a + b;
		System.out.println(myString + c);

		
		double cortado = 4.50;
		double espresso = 2.50;
		double latte = 4.00;
		double subtotal;
		double totalSale;
		
		subtotal = (cortado*3)+(espresso*4)+(latte*2);
		final double SALES_TAX = 2.40;
		totalSale = subtotal + SALES_TAX;
		System.out.println("Total Sale: " + String.format("%.2f",totalSale));
	}

}
