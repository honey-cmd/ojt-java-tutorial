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
		boolean hasRegx = false;


		Pattern pattern = Pattern.compile(password);
		Matcher matcher = pattern.matcher(password);
		
	
		

		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				hasUpperCase = true;
			} else if (Character.isLowerCase(c)) {
				hasLowerCase = true;

			} else if (Character.isDigit(c)) {
				hasNumber = true;
			}else if (matcher.matches()) {
				hasRegx = true;
			}
			
			if (hasUpperCase && hasLowerCase && hasNumber && hasRegx) {
				break;
			}
			
		}
		return hasUpperCase && hasLowerCase && hasNumber && hasRegx ;
	}

}
