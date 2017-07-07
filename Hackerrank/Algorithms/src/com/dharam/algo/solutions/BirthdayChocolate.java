package com.dharam.algo.solutions;

import java.util.*;

public class BirthdayChocolate {

	static int solve(int n, int[] s, int d, int m){
        // Complete this function
		int count = 0;
		for(int i=0;i<n;i++){
			int tmp = 0;
			for(int j=i;j<n && (j-i) < m ;j++){
				tmp += s[j];
			}
			if(tmp == d)
				count++;
		}
        return count;
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
        in.close();
	}
	
}
