package org.programming.day10;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
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
        in.close();*/
        
    	Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        String days[] = new String[]{"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day),0,0,0);
        //System.out.println(cal.getTime());
        System.out.println(days[cal.get(Calendar.DAY_OF_WEEK)-1]);
    }
}
