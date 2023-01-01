package main.java.com.vdharam.competitive.aprillongone22;

import java.util.Scanner;

public class DazzlingAXNODRChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		
		for(int i=0; i< t; i++) {
			long n = sc.nextLong();
			long output = n;
			if(n%4 == 0) {
				output = n+3;
			}
			else if(n%4 == 3 || n%4 == 2) {
				output = 3;
			}
			System.out.println(output);
		}
		sc.close();

	}

}
