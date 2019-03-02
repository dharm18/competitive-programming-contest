package com.dharam.interviewprep.algo.solutions;

import java.util.Scanner;

public class NewYearChaos {

	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int n = q.length;
    	int countBribes = 0;
    	int steps = 2;
    	boolean fault=false;
    	while(n > 1){
    		if(n == q[n-1]){ //value is same
    			n--;
    		}
    		else if(n != q[n-1] & steps > 0){
    			countBribes++;
    			steps--;
    			n--;
    			if(steps==0)
    				steps = 2;
    		}
    		else{
    			fault=true;
    			break;
    		}
    	}
    	
    	if(!fault)
    		System.out.println(countBribes);
    	else
    		System.out.println("Too chaotic");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
	
}
