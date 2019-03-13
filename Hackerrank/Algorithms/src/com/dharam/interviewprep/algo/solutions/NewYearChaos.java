package com.dharam.interviewprep.algo.solutions;

import java.util.Scanner;

public class NewYearChaos {

	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int n = q.length-1;
    	int countBribes = 0;
    	for(int i=n; i>=0; i--){
    		if(q[i]-(i+1) > 2){ //value is same
    			System.out.println("Too chaotic");
    			return;
    		}
			for(int j= Math.max(0, q[i]-2); j<i; j++){
				if(q[i] < q[j]){
					countBribes++;
				}
			}
    	}
    	System.out.println(countBribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
          //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            //String[] qItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                //int qItem = Integer.parseInt(qItems[i]);
                //q[i] = qItem;
            	q[i] = scanner.nextInt();
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

/* OUTPUT : 
 * Input (stdin) 
2
8
5 1 2 3 7 8 6 4
8
1 2 5 3 7 8 6 4

Expected Output
Too chaotic
7

1
8
1 2 5 3 4 7 8 6

Expected Output
4
 * 
 */