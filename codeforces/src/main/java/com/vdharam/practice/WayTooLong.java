package com.vdharam.practice;

import java.util.Scanner;

public class WayTooLong {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            int length;
            String temp;
            scanner.nextLine();
            while (t-- > 0) {
                temp = scanner.nextLine();
                length = temp.length();
                if(length > 10 ) {
                    temp = "" + temp.charAt(0) + (length-2) + temp.charAt(length -1);
                }
                System.out.println(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
