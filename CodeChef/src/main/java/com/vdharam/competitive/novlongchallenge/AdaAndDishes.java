package com.vdharam.competitive.novlongchallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AdaAndDishes {
    public static void main(String[] args) {

        try {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(4, Comparator.reverseOrder());
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                for (int j = 0; j < n && j <= 4; j++) {
                    priorityQueue.add(scanner.nextInt());
                }
                System.out.println(getMinimumTimeForDishes(priorityQueue));
                priorityQueue.clear();
            }
        } catch (Exception e) {
        }
    }

    private static int getMinimumTimeForDishes(PriorityQueue<Integer> priorityQueue) {
        int time = 0;
        int t1 = 0, t2 = 0;
        while(true) {
            while(t1 >= 2 && t2 >= 2) {
                t1 = t1-2;
                t2 = t2-2;
                time+=2;
            }
            if( t1 == 0) {
                t1 = !priorityQueue.isEmpty() ? priorityQueue.poll() : -1;
            }
            if( t2 == 0) {
                t2 = !priorityQueue.isEmpty() ? priorityQueue.poll() : -1;
            }
            if(t1 == 1 || t2 == 1) {
                t1 = t1-1;
                t2 = t2-1;
                time+=1;
            }
            if( t1 == 0) {
                t1 = !priorityQueue.isEmpty() ? priorityQueue.poll() : -1;
            }
            if( t2 == 0) {
                t2 = !priorityQueue.isEmpty() ? priorityQueue.poll() : -1;
            }
            if ((t1 < 0 && t2 > 0)) {
                time += t2 ;
                t2 = -1;
            } else if ((t2 < 0 && t1 > 0)) {
                time += t1 ;
                t1 = -1;
            }
            if(t1 < 0 && t2 < 0) {
                break;
            }
        }
        return time;
    }


}
