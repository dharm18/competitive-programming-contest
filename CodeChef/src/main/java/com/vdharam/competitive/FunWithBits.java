package com.vdharam.competitive;

import java.util.*;
import java.lang.*;

public class FunWithBits {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long sum = 0;
        for(int i=1; i<=n; i++) {
            sum += Integer.bitCount(i);
        }

        System.out.println(sum);
    }
}
