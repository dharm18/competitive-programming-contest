package com.vdharam.competitive.dec20b;

import java.util.Scanner;

public class Vaccine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int p = scanner.nextInt();

        int d = 0;
        int rp = 0, diff=0;
        if(d1 == d2) { //same
           d += d1-1;
           while(p > rp) {
               rp += (v1+v2);
               d++;
           }
        }
        else {
            diff = Math.min(d1, d2);
            d += diff-1;
            int i = diff;
            while(p > rp) {
                d++; // starting day
                if(i >= d1) {
                    rp += v1;
                }
                if(i >= d2) {
                    rp += v2;
                }
                i++;
            }
        }
        System.out.println(d);
    }
}
