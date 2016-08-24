package org.test.programming;

import java.util.Scanner;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
            if(n>=10)
			generateSum(n);
		}

		scanner.close();

	}
	
	private static void generateSum(long n){
		long a = 1;
		long b = 2, d;
		long sum = 0;
		while(b < n) {
		    sum += b;
		    d = a+(b<<0x01);
		    b = d+a+b;
		    a = d;
		}
		System.out.println(sum);
	}

}
