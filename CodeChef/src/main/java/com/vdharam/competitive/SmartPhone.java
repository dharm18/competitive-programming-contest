package com.vdharam.competitive;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            long[] budgets = new long[t];
            for (int i = 0; i < t; i++) {
                budgets[i] = scanner.nextLong();
            }
            System.out.println(getMaximumRevenue(budgets, t));
        } catch (Exception e) {
        }
    }

    private static long getMaximumRevenue(long[] budgets, int t) {
        long revenue;
        long maxPrice = 0;
        Arrays.sort(budgets);
        for (int i = 0; i < t; i++) {
            revenue = (budgets[i] * (t - i));
            maxPrice = Math.max(revenue, maxPrice);
        }
        return maxPrice;
    }
}
