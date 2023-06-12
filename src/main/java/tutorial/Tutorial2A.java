package main.java.tutorial;

import java.util.Scanner;

public class Tutorial2A {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One Number : ");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.println(num + "is a positive number");

		} else {
			System.out.println(num + " is a negative number");
		}

	}
}
