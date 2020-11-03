package com.java.assigment;

public class StringsCalculator {

	public int returnValue(String str)//method parses and returns the value of the current string
	{
		if(!str.isEmpty() && str.indexOf('n') != -1)//this snippet will handle the new line characters if any in the current string
		{
			int newCharIndex = str.indexOf('n');
			String num1 = str.substring(0,newCharIndex-1);
			String num2 = str.substring(newCharIndex+1);

			return returnValue(num1)+returnValue(num2);
		}
		return str.isEmpty()?0:Integer.parseInt(str);
	}

	public int add(String numbers)
	{
		int sum = 0;
		if(numbers.isEmpty())
		{
			return sum;
		}
		else if(numbers.indexOf(',') != -1)//this is for more than one number scenario
		{
			String[] strs = numbers.split(",");
			for(String s:strs) 
			{
				sum += returnValue(s);
			}
		}
		else//this is for single number scenario
		{
			return returnValue(numbers);
		}

		return sum;
	}
}
