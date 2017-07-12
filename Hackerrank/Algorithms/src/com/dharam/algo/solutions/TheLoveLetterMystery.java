package com.dharam.algo.solutions;

import java.util.Scanner;

public class TheLoveLetterMystery {

	 static int theLoveLetterMystery(String s){
	        // Complete this function
		 	int n = s.length();
		 	int count = 0;
		 	for(int i=0;i<n/2;i++){
		 		count +=Math.abs(s.charAt(i)-s.charAt(n-i-1));
		 	}
		 return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            int result = theLoveLetterMystery(s);
	            System.out.println(result);
	        }
	        in.close();
	    }
	
}
