package com.dharam.algo.solutions;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditior {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     String s = new String("");
     Stack<String> stack = new Stack<String>();
     stack.push(s);
     
     for(int i=0;i<t;i++){//testcases
         int op = sc.nextInt();
         if(op == 1) {
             String c = sc.next();
             s = s + c;
             stack.push(s);
         }
         else if(op == 2) {
             int k = sc.nextInt();
             s = s.substring(0, k);
             stack.push(s);
         }
         else if(op == 3) {
             int k = sc.nextInt();
             System.out.println(s.charAt(k-1));
         }
         else if(op == 4) {
             //System.out.println(s);
             stack.pop();
             s = stack.peek();
             //System.out.println(s);
         }
     }
     
}
}
