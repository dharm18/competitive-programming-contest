package com.vdharam.competitive.novlongchallenge;

import java.util.Scanner;

public class MagicalCandyStore {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }
                int q = scanner.nextInt();
                for (int i = 0; i < q; i++) {
                    System.out.println(getQueryOutput(a, scanner.nextInt(), n));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Incomplete
    private static int getQueryOutput(int[] a, int query, int n) {
        int chefCount = 0, temp;
        for (int i = 0; i < query; i++) {
            temp = a[i%n-1];
            if(a[0] == 1) {

            }
            else if (a[n-1] == 1) {
                // even number of candies before 1
                if(temp%2 == 0)
                    chefCount += temp;
            }
            else {
                //odd number of candies before 1
                if(temp%2 != 0)
                    chefCount += temp;
            }
        }
        return chefCount;
    }
}
