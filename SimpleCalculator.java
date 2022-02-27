package com.example.java;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String args[]) {
		System.out.println("Enter the first value");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		double d1 = Double.parseDouble(s1);

		System.out.println("Enter the second value");
		String s2 = s.nextLine();
		double d2 = Double.parseDouble(s2);

		double result = d1 + d2;
		System.out.println("The obtained result is " + result);

	}
}
