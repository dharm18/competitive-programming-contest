package com.dharam.algo.solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class EnduranceTestProgram1 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		List<Long> s= new LinkedList<>();
		long t = sc.nextLong(); //Assuming long as constraint is not specified
		for(long i=0;i<t;i++){
			String operation = sc.next();
			if(operation.equals("push")){
				s.add(sc.nextLong());
			}
			else if(operation.equals("pop")){
				s.remove(s.size()-1);
			}
			else if(operation.equals("inc")){
				long x = sc.nextLong();
				long d = sc.nextLong();
				for(int j=0;j<x;j++){
					s.set(j, s.get(j)+d);
				}
			}
			//print after operation
			System.out.println(s.isEmpty() ? "EMPTY" : s.get(s.size()-1));
		}
		sc.close();
	}

}
