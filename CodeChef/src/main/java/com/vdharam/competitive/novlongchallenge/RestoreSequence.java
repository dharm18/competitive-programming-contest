package com.vdharam.competitive.novlongchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class RestoreSequence {
    private static final int maxN = 4000001;
    private static final boolean[] prime = new boolean[maxN];
    private static ArrayList<Integer> primes;

    public static void sieveOfEratosthenes() {
        primes = new ArrayList<>();

        for (int i = 0; i < maxN; i++) {
            prime[i] = true;
        }

        for (int p = 2; p*p < maxN; p++) {
            if (prime[p]) {
                for (int i = p * p; i < maxN; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i < maxN; i++) {
            if (prime[i])
                primes.add(i);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            sieveOfEratosthenes();

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int[] b = new int[n];
                for (int j = 0; j < n; j++) {
                    b[j] = scanner.nextInt();
                }
                printSolution(findAi(b, n), n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printSolution(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a[i] + "\n");
            } else
                System.out.print(a[i] + " ");
        }
    }

    public static int[] findAi(int[] b, int n) {
        int[] a = new int[n];
        int indexB;
        for (int i = 0; i < n; i++) {
            a[i] = primes.get(i);
            indexB = b[i] - 1;//index
            if (b[i] != i + 1) { // index same as value then number which is less than previous
                a[i] = primes.get(indexB);
            }
        }
        return a;
    }
}
