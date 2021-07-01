package com.bridgelabz.maxusinggenerics;

public class MaximumUsingGenerics<T extends Comparable<T>> {
	
	private T firstVariable;
	private T secondVariable;
	private T thirdVariable;
		
	public MaximumUsingGenerics(T firstVariable, T secondVariable, T thirdVariable) {
		super();
		this.firstVariable = firstVariable;
		this.secondVariable = secondVariable;
		this.thirdVariable = thirdVariable;
	}

	public void findMax() 
	{
		maximum(this.firstVariable, this.secondVariable, this.thirdVariable);
	}
	
	public static <E extends Comparable<E>> E maximum(E firstVariable,E secondVariable,E thirdVariable) {
		E max = firstVariable;
		if(secondVariable.compareTo(max) > 0)
		{
			max = secondVariable;
		}
		if(thirdVariable.compareTo(max) > 0)
		{
			max = thirdVariable;
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
