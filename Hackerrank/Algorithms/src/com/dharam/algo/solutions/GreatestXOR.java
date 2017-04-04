package com.dharam.algo.solutions;

import java.util.Scanner;

public class GreatestXOR {

	public static void main(String[] args) {
//7179869183 
		 Scanner in = new Scanner(System.in);
	        int q = in.nextInt(); //10000000000 
	        for(int a0 = 0; a0 < q; a0++){
	            long x = in.nextLong();
	            System.out.println(countValid(x));
	        }
	}
	
	static long countValid(long x){
        long count = 0;
        /*for(long i=1;i<x;i++) {
            if((i^x) > x)
                count++;
        }*/
        System.out.println(Long.bitCount(x));
        count = x | Long.bitCount(x);
        return count;
    }
}
