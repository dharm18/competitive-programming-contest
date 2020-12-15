package com.vdharam.competitive.dec20b;

import java.util.Scanner;

public class Vaccine2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            int D = scanner.nextInt();
            int[] a = new int[N];
            int riskCount = 0;
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
                if(a[i] <= 9 || a[i] >= 80) {
                    riskCount++;
                }
            }
            int d = 0;
            if (D == 1) {
                d = N;
            }
            else {
                d = (int) (Math.ceil(riskCount/(double)D) + Math.ceil((N-riskCount)/(double)D));
            }
            System.out.println(d);
        }
    }
}
