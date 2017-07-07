<<<<<<< HEAD
package com.dharam.algo.solutions;

import java.util.Scanner;
import java.util.Stack;

public class AsteriskExpressions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			validExpression(sc.next());
		}
	}
	
	private static void validExpression(String exp){
		exp = exp.replace("**", "^");
		System.out.println(exp);
		Stack<Character> stack = new Stack<>();
		char []characters = exp.toCharArray();
		boolean flag = false;
		for (char c : characters) {
			if(stack.isEmpty() || !Character.isDigit(c)){
				stack.push(c);
			}
			else{
				while(!stack.isEmpty()){
					stack.pop();
					if(!stack.isEmpty()){
						stack.pop();
						break;
					}
				}
			}
		}
		
		if(!stack.empty()){
			System.out.println("Syntax Error");	
		}
		else{
		}
		System.out.println(stack);
		
	}

}
=======
package com.dharam.algo.solutions;

import java.util.Scanner;
import java.util.Stack;

public class AsteriskExpressions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			validExpression(sc.next());
		}
	}
	
	private static void validExpression(String exp){
		exp = exp.replace("**", "^");
		System.out.println(exp);
		Stack<Character> stack = new Stack<>();
		char []characters = exp.toCharArray();
		boolean flag = false;
		for (char c : characters) {
			if(stack.isEmpty() || !Character.isDigit(c)){
				stack.push(c);
			}
			else{
				while(!stack.isEmpty()){
					stack.pop();
					if(!stack.isEmpty()){
						stack.pop();
						break;
					}
				}
			}
		}
		
		if(!stack.empty()){
			System.out.println("Syntax Error");	
		}
		else{
		}
		System.out.println(stack);
		
	}

}
>>>>>>> branch 'master' of https://github.com/dharm18/competitive-programming-contest.git
