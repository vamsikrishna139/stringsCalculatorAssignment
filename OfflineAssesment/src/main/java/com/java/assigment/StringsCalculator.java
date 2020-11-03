package com.java.assigment;

public class StringsCalculator {

	public int returnValue(String str)//method parses and returns the value of the current string
	{
		if(!str.isEmpty() && str.contains("\n"))//this snippet will handle the new line characters if any in the current string
		{
			String[] lines = str.split("\n");
			return calculateValue(lines);
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
		else if(numbers.indexOf("//") == 0)//this scenario handles the variable delimiter scenario
		{
			sum += variableDelimiter(numbers);
		}
		else if(numbers.indexOf(',') != -1)//this is for more than one number scenario
		{
			sum += calculateValue(numbers,",");
		}
		else//this is for single number scenario
		{
			return returnValue(numbers);
		}

		return sum;
	}

	public int calculateValue(String numbers, String delimiter) //utility method for various purposes
	{
		int curr = 0;

		String[] strs = numbers.split(delimiter);
		for(String s:strs) 
		{
			curr += returnValue(s);
		}

		return curr;
	}

	public int calculateValue(String[] numbers) //utility method for various purposes
	{
		int curr = 0;
		for(String s:numbers) 
		{
			curr += returnValue(s);
		}

		return curr;
	}

	private int variableDelimiter(String numbers)// this figures out the delimiter and then process the numbers string accordingly
	{
		int curr = 0;

		if(numbers.length() > 3)
		{
			String currDelimiter = numbers.substring(2,3);
			String[] splitLines = numbers.split("\n");
			curr = calculateValue(splitLines[1], currDelimiter);
		}
		return curr;
	}
}
