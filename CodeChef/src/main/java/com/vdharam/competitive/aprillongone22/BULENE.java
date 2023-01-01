package main.java.com.vdharam.competitive.aprillongone22;

import java.util.Scanner;

public class BULENE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int S[] = new int[N];
			int d[] = new int[N];
			int P[] = new int[M];
			int C[] = new int[M];
			
			int Pi,Ci;
			
			for (int i = 0; i < N; i++) {
				S[i] = sc.nextInt();
			}
			
			for (int i = 0; i < M; i++) {
				P[i] = sc.nextInt();
			}
			
			for (int i = 0; i < M; i++) {
				C[i] = sc.nextInt();
			}
			
			int temp=0;
			for (int i = 0; i < M; i++) {
				Pi = P[i];
				Ci = C[i];
				temp = 0;
				/*while(temp < N && C[i] > 0) {
					if(S[temp] > 0) {
						S[temp] = (S[temp] - Pi);
						S[temp] = S[temp] <= 0 ? 0 : S[temp];
						C[i]--;
					}
					temp++;
				}*/
				int left=0;
				while(left < N && C[i] > 0) {
					if(d[left] < S[left]) {
						d[left] += P[i];
						C[i]--;
					}
					left++;
				}
			}
			//System.out.println(d);
			int diff;
			for (int i = 0; i < N; i++) {
				diff = S[i]-d[i];
				System.out.print((diff <= 0 ? 0 : diff) + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
