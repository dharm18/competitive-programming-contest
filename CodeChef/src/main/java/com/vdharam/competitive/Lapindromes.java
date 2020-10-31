package com.vdharam.competitive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lapindromes {

    enum Response {
        YES,
        NO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.hasNextInt() ? scanner.nextInt() : -1;
        for (int i = 0; i < t; i++) {
            if (scanner.hasNext()) {
                System.out.println(isLapindromes(scanner.next()));
            }
        }
    }

    public static Response isLapindromes(String input) {
        int length = input.length();
        String firstHalf, secondHalf;
        firstHalf = input.substring(0, length / 2);
        secondHalf = (length % 2 == 0) ? input.substring(length / 2, length) : input.substring(length / 2 + 1, length);
        //System.out.println(firstHalf + " : " + secondHalf);
        Map<Character, Integer> frequencies = new HashMap<Character, Integer>();
        for (char ch1 : firstHalf.toCharArray()) {
            if (frequencies.containsKey(ch1))
                frequencies.put(ch1, frequencies.get(ch1) + 1);
            else
                frequencies.put(ch1, 1);
        }
        for (char ch2 : secondHalf.toCharArray()) {
            if (!frequencies.containsKey(ch2))
                return Response.NO; //straightforward response
            else {
                int count = frequencies.get(ch2);
                if (count == 1)
                    frequencies.remove(ch2);
                else
                    frequencies.put(ch2, count - 1);
            }
        }
        return frequencies.isEmpty() ? Response.YES : Response.NO;
    }

}
