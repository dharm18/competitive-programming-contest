package com.vdharam.competitive.dec20b;

import java.util.Scanner;

public class DGMATRIX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        printArray(doMagic(A, N), N+1);
    }

    //TODO: incomplete
    static int[][] doMagic(int A[][], int N) {
        System.out.println("Printing A:");
        printArray(A, N);
        int B[][] = new int[N+1][N+1];
        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < N+1; j++) {
                B[i][j] = -1;
            }
        }
        
        for (int i = N; i > 0; i--) {
            for (int j = N; j > 0; j--) {
                int temp = A[i-1][j-1];
                System.out.println(temp);
                System.out.println(temp/4);
                int div = temp/4;
                if(B[i-1][j] == -1 && B[i][j-1] == -1) {
                    B[i-1][j-1] = div;
                    B[i-1][j] = div;
                    B[i][j-1] = div;
                    B[i][j] = div;
                }
                else {
                    while(B[i][j]+B[i-1][j]+B[i][j-1]+B[i-1][j-1] != A[i-1][j-1]) {
                        B[i][j-1]+=1;
                        B[i-1][j]+=1;
                    }
                }
            }
        }
        return B;
    }

    static void printArray(int A[][], int N) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result.append(A[i][j]);
            }
            System.out.println(result.toString());
            result.setLength(0);
        }
    }
}
