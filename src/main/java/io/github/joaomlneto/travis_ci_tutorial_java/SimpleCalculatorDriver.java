package io.github.joaomlneto.travis_ci_tutorial_java;

public class SimpleCalculatorDriver {
	public static void main (String[] args) {
		SimpleCalculator newCalc = new SimpleCalculator();
		
		int num = 12;
		
		num = newCalc.mul(num, 3);
		num = newCalc.mul(num, 7);
		num = newCalc.mul(num, 13);
		num = newCalc.mul(num, 37);
		
		System.out.println("The result is: " + num);
	}
}
