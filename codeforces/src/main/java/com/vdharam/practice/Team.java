package com.vdharam.practice;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            int length, result = 0;
            String temp;
            scanner.nextLine();
            while (t-- > 0) {
                temp = scanner.nextLine();
                temp = temp.replaceAll(" ", "");
                length = temp.charAt(0) + temp.charAt(1) + temp.charAt(2);
                //System.out.println(length);
                if(length >= 146 ) {
                    result++;
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
