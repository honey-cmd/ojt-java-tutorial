package main.java.tutorial;

import java.util.Scanner;

public class Tutorial6 {

	public static void main(String[] args) {
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");
		password = sc.nextLine();

		if (strongPassword(password)) {
			System.out.println("Password is strong");
		} else {
			System.out.println("Password is not strong");
		}

	}

	public static boolean strongPassword(String password) {
		if (password.length() < 8) {
			return false;
		}
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasNumber = false;

		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				hasUpperCase = true;
			} else if (Character.isLowerCase(c)) {
				hasLowerCase = true;

			} else if (Character.isDigit(c)) {
				hasNumber = true;
			}
			if (hasUpperCase && hasLowerCase && hasNumber) {
				break;
			}
		}
		return hasUpperCase && hasLowerCase && hasNumber;
	}

}
