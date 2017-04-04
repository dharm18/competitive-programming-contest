package com.dharam.algo.solutions;

import java.util.Scanner;

public class LuckyNumberEight {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number = in.next();
        in.close();
        // your code goes here
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
			a[i] = number.charAt(i)-'0';
		}
        
        for (int i = 0; i < a.length; i++) {
			int j = a[i];
			
		}
        
        System.out.println(a[0]);
	}

}
