package com.dharam.algo.solutions;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String s = sc.next();
	        int count = 0,tmp=0;
	        char t[]=s.toCharArray();
	        for(char ch:t){
	            if(ch=='U'){
	                tmp++;
	                if(tmp==0){
		                count++;
		            }
	            }
	            else{
	                tmp--;
	            }
	        }
	        System.out.println(count);
	        sc.close();
	}

}
