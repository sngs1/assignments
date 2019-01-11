package com.acad.assignments;

import java.util.Scanner;

public class SubstringUsingInbuilt {

	public static void main(String args[]) {
		String string, sub, check = null;
		int i, c,k = 0,length;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		string = in.nextLine();

		System.out.println("Enter the substring to be checked for: ");
		check = in.next();
		length = string.length();

		for (c = 0; c < length; c++) {
			for (i = 1; i <= length - c; i++) {
				sub = string.substring(c, c + i);
				if (check.equals(sub)) {
					System.out.println("Substring  \"" + check
							+ "\" is present inside  :" + string);
					k++;
				}
			}
		}
		System.out.println("The required substring is " + k + " times present");
		k=0;
		in.close();

	}
}