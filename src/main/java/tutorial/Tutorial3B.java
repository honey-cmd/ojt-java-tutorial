package main.java.tutorial;

import java.util.ArrayList;

public class Tutorial3B {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(25);

		System.out.println("Before Remove: " + arr);

		arr.remove(3);

		System.out.println("After Remove: " + arr);

	}

}