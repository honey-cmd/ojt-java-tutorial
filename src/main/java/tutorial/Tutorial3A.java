package main.java.tutorial;

import java.util.ArrayList;

public class Tutorial3A {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 3, 4, 5, 7, 9 };
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / arr.length;

		System.out.println("Average Value is : " + avg);
	}
}
