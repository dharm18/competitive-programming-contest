package com.vdharam.competitive.dec20b;

import java.util.Scanner;

public class POSPREFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            for (int i = 1; i <= N ; i++) {
                for (int j = 1; j <= i ; j++) {
                    System.out.println("N:"+i+" K:"+j);
                    printArray(getArray(i,j), i);
                }
            }
            printArray(getArray(N,K), N);
        }
    }

    static int[] getArray(int N, int K) {
        int[] A = new int[N+1];
        //int[] countA = new int[N+1];
        int count=0, sum=0;
        if (K==N) {
            for (int i = 1; i <= N; i++) {
                A[i]=i;
            }
        }
        else {
            for (int i = 1; i <=N ; i++) {
                if(count >= K){
                    A[i] = -i;
                }
                else{
                    A[i] = i%2==0 ? -i: i;
                }
                sum += A[i];
                //countA[i] = sum;
                if(sum > 0) {
                    count++;
                }
            }

            if(count < K) {
                for (int i = N; i > 0 ; i--) {
                    if(A[i] < 0) {
                        A[i] = -A[i];
                        count++;
                        //countA[i] = countA[i-1] + A[i];
                    }
                    if(count == K)
                        break;
                }
            }

        }
        testArray(A, N, K);
        return A;
    }

    static void printArray(int A[], int N) {
        StringBuilder result = new StringBuilder();
        //print
        for (int i = 1; i <= N; i++) {
            if(i != N){
                result.append(A[i]).append(" ");
            }
            else
                result.append(A[i]);
        }
        System.out.println(result.toString());
    }

    static void testArray(int A[], int N, int K) {
        int sum=0,count=0;
        for (int i = 1; i <= N; i++) {
            sum+=A[i];
            if (sum > 0) count++;
        }
        if(count == K)
            System.out.println("positive sum count: " + count);
        else
            System.err.println("ERROR: greater positive sum count: " + count);
    }
}
