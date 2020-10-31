package com.vdharam.competitive;

import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.hasNextInt() ? scanner.nextInt() : -1;
        for (int i=0; i < t; i++) {
            if( scanner.hasNextInt()) {
                reverseNumber(scanner.nextInt());
            }
        }
    }

    public static void reverseNumber(int input)
    {
        int num = 0;
        while(input>0)
        {
            num = num*10 ;
            num = input%10 + num;
            input = input/10;
        }
        System.out.println(num);
    }
}
