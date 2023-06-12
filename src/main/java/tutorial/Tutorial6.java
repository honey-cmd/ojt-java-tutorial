package main.java.tutorial;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tutorial6 {

	public static void main(String[] args) {

		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");
		password = sc.nextLine();

		if (strongPassword(password) == true) {
			System.out.println("Your password is strong");

		} else {
			System.out.println("Your password is not strong");
		}

	}

	public static boolean strongPassword(String password) {

		if (password.length() < 8) {
			return false;

		}
		if (!(password.matches(password))) {
			return false;

		}

		String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

		Pattern regex = Pattern.compile(pattern);

		Matcher matcher = regex.matcher(password);

		return matcher.matches();
	}

}
