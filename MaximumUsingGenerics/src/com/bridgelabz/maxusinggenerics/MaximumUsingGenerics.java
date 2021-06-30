package com.bridgelabz.maxusinggenerics;

public class MaximumUsingGenerics {
	
	static Integer maxInt;
	static Float maxFloat;
	
	public static int maximumInteger(Integer intFirst, Integer intSecond, Integer intThird)
	{
		maxInt = intFirst;
		if(intSecond.compareTo(maxInt) > 0)
		{
			maxInt = intSecond;
		}
		if(intThird.compareTo(maxInt) > 0)
		{
			maxInt = intThird;
		}
		return maxInt;
	}
	
	public static Float maximumFloat(Float floatFirst, Float floatSecond, Float floatThird)
	{
		maxFloat = floatFirst;
		
		if(floatSecond.compareTo(maxFloat) > 0)
		{
			maxFloat = floatSecond;
		}
		if(floatThird.compareTo(maxFloat) > 0)
		{
			maxFloat = floatThird;
		}
		return maxFloat;
	}

	public static void main(String[] args) {
		
		Integer intFirst = 23, intSecond = 52, intThird = 92;
		Float floatFirst = 121.03f, floatSecond = 235.736f, floatThird = 119.009f;
		
		maximumInteger(intFirst, intSecond, intThird);
		System.out.println("The Maximum Integer Number is  :: "+ maxInt);
	
		maximumFloat(floatFirst, floatSecond, floatThird);
		System.out.println("The Maximum Float Number is  :: "+ maxFloat);
	}

}
