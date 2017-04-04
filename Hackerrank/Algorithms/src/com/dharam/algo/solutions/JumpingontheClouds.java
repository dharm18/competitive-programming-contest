package com.dharam.algo.solutions;

import java.util.Scanner;

public class JumpingontheClouds {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count = 0;
        int i=0;
        for(i=0;i<n-1;i++,count++){
            if(i+2 < n && c[i+2] == 0){
                i++;
            }
        }
        System.out.println(count);

	}

}
