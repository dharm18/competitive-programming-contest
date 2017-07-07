package test;

import java.util.Scanner;

public class SeperateNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			String s = sc.next();
			//1234
			seperateNumbers(12345+"");
		}
		sc.close();
	}

	static void seperateNumbers(String s){
		
		int d = 0,next=0;
		for(int i=0;i<s.length()/2;i++) {
			for(int j=0; j<0 ; j++) { 
				d = Integer.parseInt(s.substring(j, i));
				
			}
		}
		
	}
	
}
