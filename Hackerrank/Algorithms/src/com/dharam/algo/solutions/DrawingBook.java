package com.dharam.algo.solutions;

import java.util.Scanner;

public class DrawingBook {

	static int solve(int n, int p){
        // Complete this function
        int result = 0;
        int mid = n/2;
        if(mid >= p){//left side
            if(p > 1)
             result = p/2;
        }
        else{//right side
        	int t = n - p;
            if(n%2 == 0 && t == 1) {//even
            	result = 1;
            }
            else {//odd
            	result = t/2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }

}
