package com.vdharam.competitive;

import java.util.Scanner;

class LifeUniverseAndEverything {

    public static void main(String[] args) {
        process();
    }

    private static void process() {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (scanner.hasNextInt() && (input = scanner.nextInt()) != 42) {
            System.out.println(input);
        }
    }
}