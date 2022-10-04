package week1.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for factorial need");
		
		int n=sc.nextInt();
		//int n =5; //Factorial number
		int fact=1;
		
		if (n>=0)
		{
		
		for (int i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of "+n +" is " +fact);
		}
		
		else
		{
			System.out.println("Invalid input. Enter number from 0");
		}

	}

}
