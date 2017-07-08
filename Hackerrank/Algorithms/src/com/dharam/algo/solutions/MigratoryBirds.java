package com.dharam.algo.solutions;

import java.util.Scanner;

public class MigratoryBirds {

	static int count[] = new int[5];
	
	static int migratoryBirds(int n, int[] ar) {
        // Complete this function
		for(int i=0; i<n;i++) {
			count[--ar[i]]++;
		}
		
		int result = 0, index = 0;
		
		for(int i=0;i<5;i++){
			if(result < count[i]){
				result = count[i];
				index = i;
			}
		}
		
		return index+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
        in.close();
    }

}
