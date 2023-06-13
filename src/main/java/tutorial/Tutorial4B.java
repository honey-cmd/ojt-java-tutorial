package main.java.tutorial;

import java.util.ArrayList;
import java.util.Collections;

public class Tutorial4B {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Red");
		alist.add("Green");
		alist.add("Black");
		alist.add("White");
		alist.add("Pink");

		System.out.println("Before Swap: " + alist);
		Collections.swap(alist, 0, 2);

		System.out.println("After Swap : " + alist);

	}
}
