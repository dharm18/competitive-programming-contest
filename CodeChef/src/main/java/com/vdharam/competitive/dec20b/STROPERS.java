package com.vdharam.competitive.dec20b;

import java.util.*;

public class STROPERS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String S = scanner.nextLine();
            System.out.println(getEquivalenceCount(S));
        }
    }

    //TODO: incomplete
    public static int getEquivalenceCount(String s) {
        int N = s.length();
        List<Stack<String>> ss = new ArrayList<>();
        //Set<String> st = new HashSet<>();
        for (int i = 0; i < N; i++) {
            Stack<String> st = new Stack<>();
            for (int j = i+1; j <= N; j++) {
                st.add(s.substring(i,j));
                //addEquivalentString(s.substring(i,j), st);
            }
            ss.add(st);
        }

        int count = 0;
        // bruteforce
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

            }
            String temp = ss.get(i).pop();
            System.out.println(temp.length() + "N of classes");
            if(temp.length() == N) {
                count++;
            }
            else {

            }
        }

        System.out.println(ss);
        //return s.chars().filter(ch -> ch == '1').count()%2 !=0 && !isConsecutiveOnes(s) ? st.size()-1 : st.size();
        return 0;
    }

    public static boolean isConsecutiveOnes(String s) {
        for (int i = 1; i < s.length(); i++) {
            // If are not consecutive
            if (s.charAt(i) == s.charAt(i-1) && s.charAt(i) == 1)
                return true;
        }
        return false;
    }

    public static void addEquivalentString(String a, Set st) {
        /*if(!st.contains(a)){
            st.add(new StringBuilder(a).reverse().toString());
        }
        else*/
            st.add(a);
    }

    /*
    [1,0]=2 classes
[01,10,11]=3 classes
[[011,110].[111]= 2 classes
[0111]=1classes
[01110]=1 classes*/
}
