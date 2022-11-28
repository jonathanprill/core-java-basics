package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {
		generateArray();
		middleElement();
		stringArray();
		exceptionArray();
		loopArray();
		multipleArray();
		middleException();
		stringSwap();
		sortArr();
		multiTypeArr();
		userArray();

	}

	public static void generateArray() {
//		Write a program that creates an array of integers with a length of 3. 
//		Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		int [] intArray = new int [3];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;

		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
	
	public static void middleElement() {
//	Write a program that returns the middle element in an array. 
//	Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
		int [] intArray = {13, 5, 7, 68, 2};
		int i = intArray.length/2;
		System.out.println(intArray[i]);
	}
	
	public static void stringArray() {
//	Write a program that creates an array of String type and initializes it with the strings
//	“red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. 
//	Use the Arrays.toString( ) method on the new array to verify that the original array was copied
		String [] stringArray = {"red", "green", "blue", "yellow"};
		System.out.println(stringArray.length);
		
		String [] clonedArray = stringArray.clone();
		System.out.println(Arrays.toString(clonedArray));
	}
	
	
	public static void exceptionArray() {
//	Write a program that creates an integer array with 5 elements (i.e., numbers). 
//	The numbers can be any integers.  Print out the value at the first index and the 
//	last index using length - 1 as the index. Now try printing the value at index = length 
//	( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. 
//	Now try to assign a value to the array index 5. You should get the same type of exception.
		int [] intArray = {1, 3, 4, 6, 8, 9};
		System.out.println(intArray[0]);
		System.out.println(intArray[intArray.length-1]);
	}
	
	public static void loopArray() {
//	Write a program where you create an integer array with a length of 5. 
//	Loop through the array and assign the value of the loop control variable
//	(e.g., i) to the corresponding index in the array.
		int [] intArray = new int [5];
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
		}
		System.out.println(Arrays.toString(intArray));
	}
	
	public static void multipleArray() {
//	Write a program where you create an integer array of 5 numbers. 
//	Loop through the array and assign the value of the loop control variable
//	multiplied by 2 to the corresponding index in the array.
		int [] intArray = new int [5];
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = i*2;
		}
		System.out.println(Arrays.toString(intArray));
	}
	
	
	public static void middleException() {
//	Write a program where you create an array of 5 elements. 
//	Loop through the array and print the value of each element, except for the middle (index 2) element.
		int [] intArray = {2, 5, 7, 8, 9};
		int arrayMid = intArray.length/2;
		
		for(int i = 0; i < intArray.length; i++) {
			if (i == arrayMid) {
				System.out.print("");
			} else {
				System.out.print(intArray[i] + " ");
			}
		}
		
	}
	
	public static void stringSwap() {
//	Write a program that creates a String array of 5 elements and swaps the first 
//	element with the middle element without creating a new array.
		String [] stringArr = {"red", "green", "blue", "yellow", "black"};
		stringArr[0] = stringArr[2];
		System.out.println(Arrays.toString(stringArr));
		
	}
	
	public static void sortArr() {
//	Write a program to sort the following int array in ascending order: 
//	{4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest 
//	and the largest element of the array. The output will look like the following:
//		Array in ascending order: 0, 1, 2, 4, 9, 13
//		The smallest number is 0
//		The biggest number is 13
		int [] intArr = {4, 2, 9, 13, 1, 0};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		System.out.println("The smallest number is: " + intArr[0]);
		System.out.println("The biggest number is: " + intArr[intArr.length-1]);
	}
	
	
	public static void multiTypeArr() {
//	Create an array that includes an integer, 3 strings, and 1 double. Print the array.
		Object[] objArray = {18, "a", "b", "c", 2.3};
		System.out.println(Arrays.toString(objArray));
	}
	
	public static void userArray() {
//		Write some Java code that asks the user how many favorite things they have. 
//		Based on their answer, you should create a String array of the correct size. 
//		Then ask the user to enter the things and store them in the array you created. 
//		Finally, print out the contents of the array.
//		Example
//		How many favorite things do you have?
//		7
//		Enter your thing: phone
//		Enter your thing: tv
//		Enter your thing: xbox
//		Enter your thing: wine
//		Enter your thing: beer
//		Enter your thing: sofa
//		Enter your thing: book
//		Your favorite  things are:
//		phone tv xbox wine beer sofa book
		Scanner input = new Scanner(System.in);
		System.out.print("How many favorite things do you have? ");
		int arrLength = input.nextInt();
		String [] thingsArr = new String [arrLength];
		input.nextLine();
		
		for(int i = 0; i < thingsArr.length; i++) {
			System.out.println("Enter a favorite thing: ");
			String newThing = input.nextLine();
			thingsArr[i] = newThing;
		}
		System.out.println(Arrays.toString(thingsArr));
	}

	
}
