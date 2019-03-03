package com.dharam.interviewprep.algo.solutions;

import java.util.Scanner;

public class NewYearChaos {

	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int n = q.length;
    	int countBribes = 0;
    	boolean fault=false;
    	for(int i=n-1; i>=0; i--){
    		if(q[i]-(i+1) > 2){ //value is same
    			fault=true;
    			break;   			
    		}
    		else if(q[i]-(i+1)> 0){
    			countBribes++;
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
