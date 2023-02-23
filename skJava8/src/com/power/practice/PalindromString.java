package com.power.practice;

import java.util.Scanner;

public class PalindromString {
	public static void main(String args[]) {
		System.out.print("Enter String: ");
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		
		String palindrom = "";
	
		for (int i=s.length()-1;i>=0;i--) {
			palindrom=palindrom + (s.charAt(i));
		}
		if(palindrom.equals(s)) {
			System.out.println("It is palindrom string ");
		}else {
			System.out.println("It is not palindrom");
		}
	}

}
