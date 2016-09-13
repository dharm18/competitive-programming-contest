package org.test.programming;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			System.out.println(largestPrimeFactor(n));
		}

		scanner.close();
		long endTime = System.nanoTime();
		System.out.println(((endTime-startTime)/1000000000)+" seconds");
	}
	
	private static long largestPrimeFactor(long n){
		long i=2;
		//n/=2;
		for(i=2 ; i<=n; ){
			if(n%i==0){
				n/=i;
				
			}
			else
				i++;
		}
		/*long max=0;
		while(n > 1){
			while(n%i ==0){
				n = n/i;
				max=i;
			}
			i++;
		}
		return max;*/
		return i;
	}

}
