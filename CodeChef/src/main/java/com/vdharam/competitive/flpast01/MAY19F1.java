package main.java.com.vdharam.competitive.flpast01;

import java.util.Scanner;

public class MAY19F1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int N = scanner.nextInt();
            int Q = scanner.nextInt();
            int nums[] = new int[N];
            int queries[] = new int[Q];
            int max[] = new int[N];
            int maxValue = Integer.MIN_VALUE;
            for(int i=0; i<N; i++) {
            	nums[i] = scanner.nextInt();
            	maxValue = Math.max(nums[i], maxValue);
            	max[i] = maxValue;
            }
            
            for(int j=0; j<Q; j++) {
            	queries[j] = scanner.nextInt();
            }
            
            for(int j=0; j<Q; j++) {
            	System.out.println(max[queries[j]-1]);
            }
        }
        
        scanner.close();
	}

}
