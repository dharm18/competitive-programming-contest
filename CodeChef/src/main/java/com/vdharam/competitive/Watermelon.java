package com.vdharam.competitive;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            System.out.println(t > 2 && t%2==0 ? "YES": "NO");
        } catch (Exception e) {
        }
    }
}
