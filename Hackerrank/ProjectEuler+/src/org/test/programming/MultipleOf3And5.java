package org.test.programming;

import java.util.Scanner;

public class MultipleOf3And5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			long multipleOfThree = sumOfNumbers(3,n);
			System.out.println(multipleOfThree);
			long multipleOfFive = sumOfNumbers(5,n);
			System.out.println(multipleOfFive);
			long multipleOfFiveAndThree = sumOfNumbers(15,n);
			System.out.println(multipleOfFiveAndThree);
			System.out.println(multipleOfThree + multipleOfFive - multipleOfFiveAndThree);
		}
		
		scanner.close();
		
	}
	
	private static long sumOfNumbers(int multiplier, int limit){
		
		long sum = 0;
		long maxValue = (limit-1)/multiplier;
		System.out.println(maxValue);
		sum = multiplier*(maxValue*(maxValue+1)/2);
		/*for(int i=1; value<limit; i++){
			//System.out.println(value);
			sum +=(value);
			value = i*multiplier;
		}*/
		//System.out.println("return");
		return sum;
	}
	
}
