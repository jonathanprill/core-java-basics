package com.perscholas.java_basics;

import java.util.Scanner;

public class ConfrolFlowConditionals {
	public static void main(String[] args) {
//		1.Write a program that declares 1 integer variable x, 
//		and then assigns 7 to it. Write an if statement to print 
//		out “Less than 10” if x is less than 10. Change x to equal 15, 
//		and notice the result (console should not display anything).
		int x = 15;
		if(x<10) {
			System.out.println("Less than 10");
		}
		
//		2. Write a program that declares 1 integer variable x, and then assigns 7 to it. 
//		Write an if-else statement that prints out “Less than 10” 
//		if x is less than 10, and “Greater than 10” if x is greater than 10. Change x
//		to 15 and notice the result.
		int xx = 15;
		if(xx<10) {
			System.out.println("xx is less than 10");
		} else {
			System.out.println("xx is greater than 10");
		}
		
//		3. Write a program that declares 1 integer variable x, and then assigns 15 to it.
//		Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
//		“Between 10 and 20” if x is greater than 10 but less than 20, 
//		and “Greater than or equal to 20” if x is greater than or equal to 20. 
//		Change x to 50 and notice the result.
		int xxx = 50;
		if(xxx<10) {
			System.out.println("xxx is less than 10");
		} else if (xxx<20){
			System.out.println("xxx is between 10 and 20");
		} else {
			System.out.println("xxx is greater than or equal to 20");
		}
		
//		4. Write a program that declares 1 integer variable x, and then assigns 15 to it.
//		Write an if-else statement that prints “Out of range” if the number is less than 10 
//		or greater than 20 and prints “In range” if the number is between 10 and 20 
//		(including equal to 10 or 20). Change x to 5 and notice the result.
		int xxxx = 5;
		if(xxxx<10 || xxxx>20) {
			System.out.println("xxxx is out of range");
		} else {
			System.out.println("xxxx is in range");
		}
		
//		5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F according 
//		to the following criteria:
//			A: 90-100
//			B: 80-89
//			C: 70-79
//			D: 60-69
//			F: <60
//		Use the Scanner class to accept a number score from the user to determine the letter grade. 
//		Print out “Score out of range” if the score is less than 0 or greater than 100.
		Scanner input = new Scanner(System.in);
		System.out.println("What was your score?");
		int grade = input.nextInt();
		
		if(grade < 0) {
			System.out.println("Out of Range");
		} else if(grade <= 60) {
			System.out.println("You Got a F");
		} else if(grade < 70) {
			System.out.println("You Got a D");
		} else if(grade < 80) {
			System.out.println("You Got a C");
		} else if(grade < 90) {
			System.out.println("You Got a B");
		} else if(grade <= 100) {
			System.out.println("You Got an A");
		} else {
			System.out.println("Score Out of Range");
		}
		
		
		
////		6. Write a program that accepts an integer between 1 and 7 from the user. 
////		Use a switch statement to print out the corresponding weekday. Print “Out of range” if 
////		the number is less than 1 or greater than 7. Do not forget to include “break” 
////		statements in each of your cases.
		System.out.print("Input an integer: ");
		int userInt = input.nextInt();
		
		switch (userInt) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Out of range"); break;
		
		}
		
		
		
//		7. Create a program that lets the users input their filing status and income.
//		Display how much tax the user would have to pay according to status and income.
//		-The U.S. federal personal income tax is calculated based on the filing status and taxable income. 
//		-There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household. 
//		-The tax rates for 2009 are shown below.

		System.out.println("Input your filing status. Choose an option:");
		System.out.println("1 for Single");
		System.out.println("2 for Married Filing Jointly or Qualified Widow(er)");
		System.out.println("3 for Married Filing Separately");
		System.out.println("4 for Head of Household");
		int userStatus = input.nextInt();
		
		switch(userStatus) {
		case 1: System.out.println("What is your income?");
		int userIncome = input.nextInt();
		if(userIncome >= 0 && userIncome <= 8350) {
			System.out.println("Your marginal tax rate is 10%");
		} else if(userIncome >= 8351 && userIncome <= 33950) {
			System.out.println("Your marginal tax rate is 15%");
		} else if(userIncome >= 33951 && userIncome <= 82250) {
			System.out.println("Your marginal tax rate is 25%");
		} else if(userIncome >= 82251 && userIncome <= 171550) {
			System.out.println("Your marginal tax rate is 28%");
		} else if(userIncome >=171551 && userIncome <= 372950) {
			System.out.println("Your marginal tax rate is 33%");
		} else if(userIncome >= 372951) {
			System.out.println("Your marginal tax rate is 35%");
		} else {
			System.out.println("Enter a valid income.");
		}
		case 2: System.out.println("What is your income?");
		userIncome = input.nextInt();
		if(userIncome >= 0 && userIncome <= 16700) {
			System.out.println("Your marginal tax rate is 10%");
		} else if(userIncome >= 16701 && userIncome <= 67900) {
			System.out.println("Your marginal tax rate is 15%");
		} else if(userIncome >= 67901 && userIncome <= 137050) {
			System.out.println("Your marginal tax rate is 25%");
		} else if(userIncome >= 137051 && userIncome <= 208850) {
			System.out.println("Your marginal tax rate is 28%");
		} else if(userIncome >=208851 && userIncome <= 372950) {
			System.out.println("Your marginal tax rate is 33%");
		} else if(userIncome >= 372951) {
			System.out.println("Your marginal tax rate is 35%");
		} else {
			System.out.println("Enter a valid income.");
		}
		case 3: System.out.println("What is your income?");
		userIncome = input.nextInt();
		if(userIncome >= 0 && userIncome <= 8350) {
			System.out.println("Your marginal tax rate is 10%");
		} else if(userIncome >= 8351 && userIncome <= 33950) {
			System.out.println("Your marginal tax rate is 15%");
		} else if(userIncome >= 33951 && userIncome <= 68525) {
			System.out.println("Your marginal tax rate is 25%");
		} else if(userIncome >= 68526 && userIncome <= 104425) {
			System.out.println("Your marginal tax rate is 28%");
		} else if(userIncome >=104426 && userIncome <= 186475) {
			System.out.println("Your marginal tax rate is 33%");
		} else if(userIncome >= 186476) {
			System.out.println("Your marginal tax rate is 35%");
		} else {
			System.out.println("Enter a valid income.");
		}
		case 4: System.out.println("What is your income?");
		userIncome = input.nextInt();
		if(userIncome >= 0 && userIncome <= 11950) {
			System.out.println("Your marginal tax rate is 10%");
		} else if(userIncome >= 11951 && userIncome <= 45500) {
			System.out.println("Your marginal tax rate is 15%");
		} else if(userIncome >= 45501 && userIncome <= 117450) {
			System.out.println("Your marginal tax rate is 25%");
		} else if(userIncome >= 117451 && userIncome <= 190200) {
			System.out.println("Your marginal tax rate is 28%");
		} else if(userIncome >=190201 && userIncome <= 372950) {
			System.out.println("Your marginal tax rate is 33%");
		} else if(userIncome >= 372951) {
			System.out.println("Your marginal tax rate is 35%");
		} else {
			System.out.println("Enter a valid income.");
		}
		
		}
		
		
		
		
		
		
		
		input.close();
	}
}
