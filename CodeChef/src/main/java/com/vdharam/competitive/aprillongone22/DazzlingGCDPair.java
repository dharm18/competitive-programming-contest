package main.java.com.vdharam.competitive.aprillongone22;

import java.util.Scanner;

public class DazzlingGCDPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a%2==0) {
				if((a+2)<=b) 
					System.out.println((a) + " " + (a+2));
			    else
			    	System.out.println(-1);

			}
			else {
				if(a%3==0) {
					if(a+3 <= b)
						System.out.println((a) + " " + (a+3));
					else
						System.out.println(-1);
				}
				else {
					if(a+3 <= b)
						System.out.println((a+1) + " " + (a+3));
					else
						System.out.println(-1);
				}
			}
		}
		
		sc.close();

	}

}
