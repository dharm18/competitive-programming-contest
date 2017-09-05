package com.dharam.algo.solutions;

import java.util.Scanner;

public class CircularArrayRotation {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String in[] = input.split(" ");
		int n = Integer.parseInt(in[0]),k = Integer.parseInt(in[1]) ,q = Integer.parseInt(in[2]);
		int a[] = new int[n];
		input = scanner.nextLine();
		in = input.split(" ");
		for (int i = 0; i < in.length; i++) {
			a[i] = Integer.parseInt(in[i]);
		}
		
		rotate(a,k);
		
		int index = 0;
		for (int i = 0; i < q; i++) {
			 index = scanner.nextInt();
			 System.out.println(a[index]);
		}
		scanner.close();
	}
	
	private static void rotate(int a[],int orderToRotate){
		int offset = a.length - orderToRotate%a.length;
		if(offset > 0){
			int copy[] = a.clone();
			for (int i = 0; i < a.length; i++) {
				 int j = (i + offset)%a.length;
		            a[i] = copy[j];
			}
		}
		
	}
	
}
