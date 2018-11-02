//***********************************************************
// Name:  Anthony Weringer
// Title: Lab4.java
// Description: User puts in integers and then when zero is entered program will return smallest/largest/total/total even/total odd integers as well as the average 
// Time spent: 2 hours
// Date: 8/31/17
//***********************************************************

import java.util.Scanner;

public class Lab4 
{
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner(System.in); /*Create Scanner*/

		
		System.out.println("Enter an integer (0 to quit): "); /*Prompt user for their input*/

		
		boolean complete = false; /*Initialize loop control variable*/

		/*Declare the variables*/
		int count = 0;
		int even = 0;
		int odd = 0;
		double average = 0;
		int sum = 0;

		/*Read in first value to hold input and largest & smallest variables*/
		int value = input.nextInt();
		int largest = value;
		int smallest = value;

		/*Update initial sum, integer count, even & odd number count*/
		int remainder = value % 2;
		if (remainder == 0)even++;
		if (remainder != 0)odd++;
		sum = sum +value;
		count++;

		/*Message output if only zero is entered*/
		if (value == 0)
		{
			System.out.println("Warning: No data was entered");
			complete = true;
		}

		/*While loop*/
		while (!complete)
			{
				/*Input next value*/
				value = input.nextInt();
				if (value != 0)
				{
					/*Update sum, largest integer, smallest integer, integer count, even and odd number count, as well as the average*/
					sum = sum + value;
					if (value > largest)largest=value;
					if (value < smallest)smallest=value; ///////
					remainder = value % 2;
					if (remainder == 0)even++;
					if (remainder != 0)odd++;
					count++;
					average = (double)sum / count;
				}
				/*Else statement if zero is entered*/
				else
				{
					/*Output smallest integer, largest integer, number of integers, number of even and odd integers, average of all integers entered*/
					complete = true;
					System.out.println("The smallest integer is: " + smallest);
					System.out.println("The largest integer is: " + largest);
					System.out.println("Total number of integers is: " + count);
					System.out.println("Total even numbers entered is: " + even);
					System.out.println("Total odd numbers entered is: " + odd);
					System.out.printf("The average value is: %.1f", average);
					System.out.println();
				}
			} 
	} 

}
