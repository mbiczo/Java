/*
* Only with Java 7 and later can you use a switch statement with Strings, otherwise, it was only available for primitive data types.
*
/*

import java.util.Scanner;

public class SimpleSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How are you feeling today?");
		String input = sc.nextLine();

		switch (input) {

			case "Great!":
				System.out.println("I'm happy, keep doing what you're doing!");
				break; // be sure to add breaks so additonal code doesn't run
			case "Ok":
				System.out.println("Well, that's better than the alternative...");
				break;
			case "Sad":
				System.out.println("I'm sorry to hear that, maybe take a walk in nature?");
				break;
			default:
				System.out.println("I'm not sure how to interpret that.");

		} // end of switch
	
	} // end of main method
 
} // end of SimpleSwitch class
