package com.java.assignment.tests;

import com.java.string.calculator.StringsCalculator;

public class TestStringNumbers {

	public static void main(String[] args) {
		StringsCalculator obj = new StringsCalculator();
		System.out.println(" Test 1, String is:empty, the result is:" + obj.add(""));
		System.out.println(" Test 2, String is: 1, the result is:" + obj.add("1"));
		System.out.println(" Test 3, String is: 1,2, the result is:" + obj.add("1,2"));
		System.out.println(" Test 4, String is: 1,2,3 the result is:" + obj.add("1,2,3"));
		System.out.println(" Test 5, String is: 1,,3 the result is:" + obj.add("1,,3"));
		System.out.println(" Test 6, String is: 1, the result is:" + obj.add("1,"));
		System.out.println(" Test 7, String is: ,3 the result is:" + obj.add(",3"));
		System.out.println(" Test 8, String is: 1\\n2,3 the result is:" + obj.add("1\n2,3"));
		System.out.println(" Test 9, String is: 1\\n2,3\\4 the result is:" + obj.add("1\n2,3\n4"));
		System.out.println(" Test 10, String is: 1\\n2,3\\n4,5,6\\n7,9 the result is:" + obj.add("1\n2,3\n4,5,6\n7,9"));
		System.out.println(" Test 11,String is: 10\\n,3\\n5,6 the result is:" + obj.add("10\n,3\n5,6"));
		System.out.println(" Test 12,String is: 10\\n,3\\n5,\\n the result is:" + obj.add("10\n,3\n5,\n"));
		System.out.println(" Test 13,String is: //;\\n1;2 the result is:" + obj.add("//;\n1;2"));
		System.out.println(" Test 14,String is: //:\\n1:2:4:5\\n6 the result is:" + obj.add("//:\n1:2:4:5\n6"));
		System.out.println(" Test 15,String is: //;\\n1;2;4;5\\n6;7;8;0\\n9 the result is:" + obj.add("//;\n1;2;4;5\n6;7;8;0\n9"));
		System.out.println(" Test 16,String is: //;\\n1;2;4;-5\\n6;7;-8;0\\n9 the result is:" + obj.add("//;\n1;2;4;-5\n6;7;-8;0\n9"));
		System.out.println(" Test 17, String is: 1,-2,3 the result is:" + obj.add("1,-2,3"));
		System.out.println(" Test 18, String is: ,-3 the result is:" + obj.add(",-3"));
		System.out.println(" Test 19, String is: -1, the result is:" + obj.add("-1"));
		System.out.println(" Test 20, String is: -1\\n2,3\\4 the result is:" + obj.add("-1\n2,3\n4"));
		System.out.println(" Test 21, String is: -1\\n2,-3\\4 the result is:" + obj.add("-1\n2,-3\n4"));
		System.out.println(" Test 22, String is: -1\\n2,-3\\n4,-5,6\\n7,9 the result is:" + obj.add("-1\n2,-3\n4,-5,6\n7,9"));
		System.out.println(" Test 23,String is: //;\\n1;2;-4;5\\n6;-7;8;0\\n-9 the result is:" + obj.add("//;\n1;2;-4;5\n6;-7;8;0\n-9"));

	}
}
