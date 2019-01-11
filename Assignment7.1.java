package com.acad.assignments;

public class ConvertIntToString {

	public static void main(String[] args) {
		int ivar = 111;
		String str = Integer.toString(ivar);

		System.out.println("Converted value of ivar=" + str);
		System.out.println("Type of ivar is:" + str.getClass().getName());
	}

}
