package com.java.assignment.tests;

import com.java.assigment.StringsCalculator;

public class TestStringNumbers {

	public static void main(String[] args) {
		StringsCalculator str = new StringsCalculator();
		System.out.println(" Test 1, String is:empty, the result is:" + str.add(""));
		System.out.println(" Test 2, String is:1 , the result is:" + str.add("1"));
		System.out.println(" Test 3, String is: 1,2, the result is:" + str.add("1,2"));
	}
}
