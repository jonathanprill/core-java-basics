package com.perscholas.java_basics;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class PrillString {
	Scanner input = new Scanner(System.in);
	private String theString;

	public void enterString() {
		System.out.println("Enter a String: ");
		theString = input.nextLine();
		int intValue = Integer.parseInt(theString); // parseIn method converts a string into a primitive data type

		System.out.println("String: " + theString + 2);
		System.out.println("parseInt: " + (intValue + 2));
	}

	public void buildStringBuffers() {
		StringBuffer str = new StringBuffer("Full Stack");

		int len = str.length();
		System.out.println("String Array Length: " + len);

		int cap = str.capacity();
		System.out.println("String Array Capacity: " + cap);

		System.out.println("Appended String: " + str.append("NEw sTuff"));
		System.out.println("Reversed String: " + str.reverse());

	}

	public void buidStringJoiner() {
		StringJoiner joinNames = new StringJoiner(", ", "[", "]");

		joinNames.add("Java");
		joinNames.add("Python");
		joinNames.add("SQL");
		joinNames.add("MongoDB");
		System.out.println(joinNames);
	}

	public void formattingOutput() {
//		System.out.printf("String: %s", "\nThis string. ");
		LocalDate dob = LocalDate.of(1971, Month.MAY, 16);

//		System.out.printf("\n%1$tB %1$td,  %1$tY is %2$s's birth day. Let's go and celebrate.", dob, "Mike");
		
		int k = 3;
		String A = "welcometojava";
		CharSequence lowChar = A.subSequence(0, k);
		String lowString = lowChar.toString();
		for(int i=0; i<A.length()-(k-1); i++) {
			CharSequence currentChar = A.subSequence(i, i+k);
			String currentString = currentChar.toString();
			if (lowString.compareTo(currentString) > 0) {
				lowString = currentString;
			}
		
		}
		System.out.println(lowString);
		for(int i=0; i<A.length()-(k-1); i++) {
			CharSequence currentChar = A.subSequence(i, i+k);
			String currentString = currentChar.toString();
			if (lowString.compareTo(currentString) < 0) {
				lowString = currentString;
			}
		
		}
		System.out.println(lowString);

	}

	public void useMathFunctions() {
		System.out.println(Math.abs(-10.324));
		System.out.println("Max" + Math.max(10, 15));
		System.out.println("Random: " + (int) (Math.random() * 100));
		System.out.println("Min" + Math.min(10, 15));
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

	public void myConditions() {
		int num = 80;

		if (num >= 80) {
			System.out.println("You Pass!");
		} else {
			System.out.println("You fail!");
		}

		if (num > 1)
			if (num > 2)
				System.out.println("True");
			else
				System.out.println("False");

	}

	public void myCases() {
		String output;
		int grade = 80;
		switch (grade / 10) {
		case 10:
			output = "wow";
			break;
		case 9:
			output = "excel";
			break;
		case 8:
			output = "great";
			break;
		case 7:
			output = "good";
			break;
		default:
			output = "keep trying";
			break;
		}
		System.out.println(output);
	}
	
	public int processArgument(String arg) {
		
		int result;
		
		switch (arg) {
		case "a": result = 1; break;
		case "b": //fall through
		case "c": result = 2; break;
		case "d": //fall through
		case "e": //fall through
		case "f": result = 3; break;
		default: result = -1; break;
		}
		System.out.println(result);
		return result;
	}
	
	public void forLoops() {

		int i;
		for (i = 0; i < 10; i++) {
//			System.out.println("i is: " + i);
		}
		System.out.println("i is: " + i);
		
//		NESTED LOOPS
		int days = 7, weeks = 3;
		for(int j = 1; j <= weeks; j++) {
			System.out.println("Week: " + j);
//			inner loop
			for(int z = 1; z <= days; z++) {
				System.out.println("Day: " + z);
			}
		}
		
//		Enhanced For Loops
		String movies [] = {"Troy", "LotR", "Harry Potter"};
		for(String value: movies) {
			System.out.println(value);
		}
		
	}
	
	public void whileLoops() {
		int x = 0;
		while(x<=5) {
			System.out.println("True");
			x++;
		}
	}
	
	public void breakWhileLoop() {
		
		while(true) {
			System.out.println("Enter a color: ");
			String line = input.nextLine();
				if(line.equalsIgnoreCase("exit")) {
					break;
				}
				System.out.println("You entered: " + line + "\n");
		} //end of while loop
		System.out.println("Goodbye");
	}

	public void sentinalAndContinueWhileLoops() {
//		sentinal statement is the exit value
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter a Number: ");
			int number = input.nextInt();
				if(number <= 0) {
					System.out.println("Number must be greater than 0. Try Again.");
					continue;
				}
				System.out.println("You entered: " + number + "\n");
				System.out.println("Continue? Y or N");
				choice = input.next();
				System.out.println();
		}
		System.out.println("Goodbye");
	}
	
	public void doWhileLoops() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
	}
	
	public void arrays() {
//		String mystring[] = {"a", "ab"};
//		double[] arrName = new double[10];
//		arrName[0] = 2.2;
		String[] namesArr;
		namesArr = new String[3];
		namesArr[0] = "Lewis";
		namesArr[1] = "John";
		namesArr[2] = "Morgan";
		
//		enhanced loop
		for(String name : namesArr) {
			System.out.println(name);
		}
		
	}
	
	public void gradeArray() {
		double [] grades = new double[5];
		grades[0] = 98.1;
		grades[1] = 90.9;
		grades[2] = 92.08;
		grades[3] = 91.2;
		grades[4] = 94.03;
		

		
		int count = 0;
		while(count<2) {
			for(double grade : grades) {
				System.out.println(count + " " + grade);
			}
			count++;
		}
		
		System.out.println(Arrays.toString(grades));
		/////////////////////////////////////////////////////
		String[] strArr = {"a", "b", "c"};
		System.out.println("length: " + strArr.length);
	}
	
	
	public void traversingOverAnArray() {
		int [] values = new int [5];
		for(int i = 1; i < values.length; i++) {
			values[i] = i + values[i-1]; //initital values[0]
			
			System.out.println("i is: " + i + " Value is: " + values[i]);
		}
		
	}
	
	public void multiArray() {
//		[row#][column#]
		
		int [][] matrixArr = new int [3][4];
		for(int row = 0; row < matrixArr.length; row++) {
			for(int column = 0; column < matrixArr[row].length; column++) {
				matrixArr[row][column] = (int)(Math.random() * 1000);
				System.out.print(matrixArr[row][column] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void arrMethods() {
		int [] numbers = new int[5];
		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Enter a number: ");
			numbers[i] = input.nextInt();
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	public void copyDeepArray() {
		int [] sourceArray = {1, 2, 2, 5, 7};
		
		int [] targetArray = new int[sourceArray.length];
		System.out.println(Arrays.toString(sourceArray));
		
//		one way to create a deep copy
		for(int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}
		System.out.println(Arrays.toString(targetArray));
//		double equal check memory location same or not
		if(targetArray == sourceArray) {
			System.out.println("Same instance");
		} else {
			System.out.println("Not same instance");
		}
//		clone an array method
		int[] newArr = sourceArray.clone();
		System.out.println(Arrays.toString(newArr));
		
		int [] newnewArr = {2, 4, 6, 8};
		int [] copyNewArr = new int[newnewArr.length];
		
		System.arraycopy(newnewArr, 2, copyNewArr, 1, 2);
		System.out.println("Before Copy : " + Arrays.toString(newnewArr));
		System.out.println("After copy: " + Arrays.toString(copyNewArr));
		
	}
	
	public void scannerInputArray() {
		System.out.println("Enter Num you want to store: ");
		int n = input.nextInt();
		int [] userCreatedArray = new int [10];
		
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < n; i++) {
			userCreatedArray[i] = input.nextInt();
		}
		System.out.println("Array elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(userCreatedArray[i]);
		}
	}
	
	public void sumOfArray() {
		int[] numbers = {2, 2, 2, 2, 2};
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
	}
	
}