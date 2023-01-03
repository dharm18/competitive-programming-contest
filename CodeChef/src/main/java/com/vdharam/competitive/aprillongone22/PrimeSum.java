package main.java.com.vdharam.competitive.aprillongone22;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(a == 1 || b == 1)
				System.out.println(-1);
			else {
				if(new BigInteger(a+"").gcd(new BigInteger(b+"")).longValue() != 1L)
					System.out.println(0);
				else
					System.out.println(1);
			}
		}
		sc.close();

	}
	
	/*# cook your dish here
	from math import gcd
	for _ in range(int(input())):
	    X,Y = map(int,input().split(" "))
	    if X==1 or Y==1:
	     print(-1)
	    else:
	        G_XY = gcd(X,Y)
	        if G_XY != 1:
	            print(0)
	        else:
	            print(1)
	*/
}
