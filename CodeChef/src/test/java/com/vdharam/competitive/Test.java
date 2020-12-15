package com.vdharam.competitive;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        String firstHalf="",  secondHalf="";
        int t=0;
        for(int i_A=0; i_A<arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);

            if(i_A < N/2) {
                t = getFirstDigit(A[i_A]);
                firstHalf += t;
            }
            else {
                t = getLastDigit(A[i_A]);
                secondHalf += t;
            }
        }

        String out_ = (new BigInteger(firstHalf+secondHalf).mod(new BigInteger("11"))).longValue() == 0 ? "OUI" : "NON";
        System.out.println(out_);

        wr.close();
        br.close();
    }
    public static int getFirstDigit(int a) {
        while(a>=10)
            a/=10;
        return a;
    }
    public static int getLastDigit(int a) {
        return (a%10);
    }


}
