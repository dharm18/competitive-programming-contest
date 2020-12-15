package com.vdharam.competitive.dec20b;

import java.util.Scanner;

public class EvenPairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long AEven = A/2;
            long AOdd = A - AEven;
            long BEven = B/2;
            long BOdd = B - BEven;
            System.out.println(AEven*BEven + AOdd*BOdd);
        }
    }
}
