package org.test.programming;

import java.util.Scanner;

public class Lighthouse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		boolean mat[][] = new boolean[t][t];
		String temp = null;
		for (int i = 0; i < t; i++) {
			temp = scanner.nextLine();
			char a[] = temp.toCharArray();
			for (int j = 0; j < a.length; j++) {
				mat[i][j] = a[i] == '*' ? false: true;
			}
			// 
     	}
		System.out.println(mat);	
		scanner.close();

	}
	
}
