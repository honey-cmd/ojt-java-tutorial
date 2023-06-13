package main.java.tutorial;

import java.util.ArrayList;

public class Tutorial4A {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Red");
		alist.add("Green");
		alist.add("Orange");
		alist.add("White");

		alist.add("Black");

	System.out.println("ArrayList : " + alist);
		
		
	String [] arr = alist.toArray(new String [alist.size()]);
	
for(String array : alist) {
	System.out.println(array);
}
		
		
		
		


			}
}
