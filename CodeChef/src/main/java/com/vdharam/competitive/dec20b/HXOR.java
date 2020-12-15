package com.vdharam.competitive.dec20b;

import java.util.Scanner;

public class HXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int N = scanner.nextInt();
            long X = scanner.nextLong();
            long A[] = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextLong();
            }
            printArray(getA(A, N, X), N);
        }
    }

    static long[] getA(long A[], int N, long X) {
        int i=0,j;
        long p, p2, tempj,iteration, l;
        /*if(N == 2) {
            while(true) {
                p = getP(A[0]);
                p2 = (long)Math.pow(2,p);
                A[0] = A[0] ^ p2;
                A[1] = A[1] ^ p2;
                if(X%2!=0) {
                    return A;
                }
                X--;
            }

        }*/
        for (l=X; l>0 && i < N-1; l--) {
            while (i < N-2 && A[i] <= 0 ) {
                i++;
            }
            boolean lastElement = false;
            p = getP(A[i]);
            p2 = (long)Math.pow(2,p);
            A[i] = A[i] ^ p2;
            for (j = i+1; j < N; j++) {
                tempj = A[j] ^ p2;
                if(tempj < A[j]) {
                    A[j] = tempj;
                    lastElement = true;
                    break;
                }
            }
            if(!lastElement) {
                A[N-1] = A[N-1] ^ p2;
            }
            while (i < N && A[i] <= 0 ) {
                i++;
            }
        }
        iteration = l+1;
        if(iteration > 0 && N < 3 && iteration%2 == 0){
            A[N-1] = A[N-1] ^ 1;
            A[N-2] = A[N-2] ^ 1;
        }
        //printArray(A, N);
        return A;
    }

    static long getP(long x) {
        double val = Math.log(x) / Math.log(2);
        return val > 0 ? (long)val : 0;
    }

    static void printArray(long A[], int N) {
        StringBuilder result = new StringBuilder();
        //print
        for (int i = 0; i < N; i++) {
            if(i != N-1){
                result.append(A[i]).append(" ");
            }
            else
                result.append(A[i]);
        }
        System.out.println(result.toString());
    }
}
