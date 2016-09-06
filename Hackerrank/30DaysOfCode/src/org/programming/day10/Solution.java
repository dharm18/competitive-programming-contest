package org.programming.day10;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long remainder = 0;
        long maxSum = 0;
        long previous = 1;
        long sum = 0;
        while(n > 0){
            remainder = n%2;
            n = n/2;
            System.out.println(remainder);
            if(remainder == 1){
                sum++;
                if(sum >= maxSum)
                	maxSum = sum;
            }
            else{
            	sum = 0;
            }
            previous = remainder;
        }
        
        System.out.println(maxSum);
        in.close();
    }
}
