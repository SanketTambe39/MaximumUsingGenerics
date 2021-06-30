package com.bridgelabz.maxusinggenerics;

public class MaximumUsingGenerics {
	
	static Integer maxInt;
	static Float maxFloat;
	static String maxString;
	
	public static <E extends Comparable<E>> E maximum(E first,E second,E third) {
		E max = first;
		if(second.compareTo(max) > 0)
		{
			max = second;
		}
		if(third.compareTo(max) > 0)
		{
			max = third;
		}
		return max;
	}
		
	public static void main(String[] args) {
		
		Integer intFirst = 23, intSecond = 52, intThird = 92;
		Float floatFirst = 121.03f, floatSecond = 235.736f, floatThird = 119.009f;
		String stringFirst = "Apple", stringSecond = "Peach", stringThird = "Banana";
		
		System.out.println("The Maximum Integer Number is  :: "+ maximum(intFirst,intSecond,intThird));	
		System.out.println("The Maximum Float Number is  :: "+ maximum(floatFirst, floatSecond, floatThird));
		System.out.println("The Maximum String Number is  :: "+maximum(stringFirst, stringSecond,stringThird));
	}
}
