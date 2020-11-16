package com.vdharam.competitive.novlongchallenge;

import java.util.Scanner;

public class IronMagnetWall {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                scanner.nextLine();
                String s = scanner.nextLine();
                System.out.println(getMaxMagnetsCount(s, k, n));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int findConductingSheets(String s, int i, int j) {
        int c = 0;
        int k = i, max = j;
        if(i > j) {
            k = j;
            max = i;
        }
        for (; k <= max; k++) {
            if (s.charAt(k) == ':')
                c++;
        }
        return c;
    }

    private static int getMaxMagnetsCount(String s, int k, int n) {
        int c, p, ans=0;
        int i=0, j=0;
        while( i < n && j < n) {
            if(s.charAt(i) == 'M') {
                if(s.charAt(j) == 'I') {
                   c = findConductingSheets(s, i, j);
                   p = k + 1 - Math.abs(j-i) + c;
                   if(p > 0) {
                       ans = ans+1;
                       i++;
                       j++;
                   }
                   else {
                       if(i<j)
                           i++;
                       else
                           j++;
                   }
                } else if(s.charAt(j) == 'X') {
                    i = j;
                    i++;
                    j++;
                }
                else {
                    j++;
                }
            }
            else if (s.charAt(i) == 'X') {
                j = i;
                i++;
                j++;
            }
            else
                i++;
        }
        return ans;
    }
}
