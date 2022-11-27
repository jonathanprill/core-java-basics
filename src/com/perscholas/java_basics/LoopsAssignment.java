package com.perscholas.java_basics;

import java.util.Scanner;

public class LoopsAssignment {

	public static void main(String[] args) {

		multiplicationTable();
		greatestDivisor();
		futureTuition();

	}

//	Question 1
	public static void multiplicationTable() {
		int[][] multiArray = new int[13][13];
		for (int i = 1; i < 13; i++) {
			for (int j = 1; j < 13; j++) {
				multiArray[i][j] = i * j;
				System.out.print("\t" + multiArray[i][j]);
			}
			System.out.println(" ");
		}
	}

//	Question 2
	public static void greatestDivisor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one positive integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter another positive integer to find their greatest common divisor: ");
		int n2 = input.nextInt();
		int gcd = 1;
		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n2 % k == 0 && n1 % k == 0) {
				if (gcd < k) {
					gcd = k;
				}
			}
		}
		System.out.println("The GCD is: " + gcd);
	}

//	Question 3
	public static void futureTuition() {
		double tuition = 10000.00;
		int years = 0;
		for (int i = 0; i < 100; i++) {
			if (tuition <= 20000) {
				tuition = 1.07 * tuition;
				if (years < i) {
					years = i;
				}
			}
		}
		System.out.println("Years until tuition is doubled " + years);

	}

}