package main.java.tutorial;

import java.util.Random;
import java.util.Scanner;

public class Tutorial5 {

	public static void main(String[] args) {

		int user;
		int computer;
		int rock = 0;
		int paper = 1;
		int scissors = 2;

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		System.out.println("Please enter one: 0=ROCK, 1=PAPER, 2=SCISSORS");
		user = sc.nextInt();

		if (user == rock) {
			System.out.println("User choose ROCK");
		} else {
			if (user == paper) {
				System.out.println("User choose PAPER");
			} else {
				System.out.println("User choose SCISSORS");
			}
		}
		computer = random.nextInt(3);

		if (computer == rock) {
			System.out.println("Computer choose ROCK");
		} else {
			if (computer == paper) {
				System.out.println("Computer choose PAPER");
			} else {
				System.out.println("Computer choose SCISSORS");
			}
		}

		while (user == computer) {
			System.out.println("It's a tie");

			user = sc.nextInt();
			while (user > 2) {
				System.out.println("Please input number between 0 and 2");
				user = sc.nextInt();
			}
			computer = random.nextInt(3);
			if (user == rock) {
				System.out.println("User choose ROCK");
			} else {
				if (user == paper) {
					System.out.println("User choose PAPER");
				} else {
					System.out.println("User choose SCISSORS");
				}
			}

			if (computer == rock) {
				System.out.println("Computer choose ROCK");
			} else {
				if (computer == paper) {
					System.out.println("Computer choose PAPER");
				} else {
					System.out.println("Computer choose SCISSORS");
				}
			}
		}

		if (computer == rock) {
			if (user == paper) {
				System.out.println("User Win");
			} else {
				System.out.println("Computer Win");
			}
		} else if (computer == paper) {
			if (user == rock) {
				System.out.println("Computer Win");
			} else {
				System.out.println("User Win");
			}
		} else if (user == rock) {
			System.out.println("User Win");
		} else {
			System.out.println("Computer Win");
		}
	}

}
