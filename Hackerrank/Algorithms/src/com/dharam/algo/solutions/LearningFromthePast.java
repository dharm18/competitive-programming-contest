package com.dharam.algo.solutions;

import java.util.Scanner;

public class LearningFromthePast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int max = 0;
        int result = 0;
        for(int i=0;i<n;i++){
            String trades = sc.nextLine();
            String trade[] = trades.split(" ");
            result = maxProfit(trade);
            if(result > max )
                max = result;
        }
        System.out.println(max);
	}
	
	 private static int maxProfit(String nums[]){
	        int maxOne = 0;
	        int maxTwo = 0;
	        for(String n : nums){
	            int num = Integer.parseInt(n);
	            if(maxOne < num){
	                maxTwo = maxOne;
	                maxOne =num;
	            } else if(maxTwo < num){
	                maxTwo = num;
	            }
	        }
	        
	        return maxOne+maxTwo;
	    }

}
