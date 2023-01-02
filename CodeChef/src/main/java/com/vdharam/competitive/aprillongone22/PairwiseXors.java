package main.java.com.vdharam.competitive.aprillongone22;

import java.util.Scanner;

public class PairwiseXors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		
		for(int i=0; i< t; i++) {
			long n = sc.nextLong();
			long output = n & ~(n-1);
			if((n&1) != 0 || n == output) {
				System.out.println(-1);
			}
			else {
				System.out.println(output/2 + " " + n/2 + " " + (n-output)/2);
			}
		}
		sc.close();

	}

}
