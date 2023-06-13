package main.java.tutorial;

import java.util.Scanner;

public class Tutorial2B {
	
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number ");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		System.out.println("Enter third number");
		num3 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("Greatest Number is : " + num1);
		} else if (num2 > num3) {
			System.out.println("Greatest Number is : " + num2);
		} else {
			System.out.println("Greatest Number is : " + num3);
		}
	}
}