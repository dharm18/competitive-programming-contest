package com.dharam.algo.solutions;

import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n+1];
		for(int i=1;i<n+1;i++){
			int tp = sc.nextInt();
			p[tp] = i; 
		}
		
		for(int i=1;i<n+1;i++){
			System.out.println(p[p[i]]);
		}
		
		sc.close();
	}

}
