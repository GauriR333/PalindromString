package com.power.practice;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String args[]) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String output = "";

		for(int i=input.length();i<=0;i--) {
			output = output+input.charAt(i);
		}
		if (input.equalsIgnoreCase(input)) {
			System.out.println("This is Palindrome Number ");
		}else {
			System.out.println("This is not Plindrome Number ");
		}
	}

}
