package test;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStack {

	static Stack<Integer> front = new Stack<Integer>();
	static Stack<Integer> rear = new Stack<Integer>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt(),type=0,temp=0;
		while(q>0){
			type = sc.nextInt();
			if(type == 1){
				temp = sc.nextInt();
				rear.push(temp);
			}
			else if(type == 2){//delete
				if(front.isEmpty()){
					while(!rear.isEmpty()){
						front.push(rear.pop());
					}
				}
				if(!front.isEmpty())
					front.pop();
			}
			else {
				if(front.isEmpty()){
					while(!rear.isEmpty()){
						front.push(rear.pop());
					}
				}
				if(!front.isEmpty())
					System.out.println(front.peek());
			}
			q--;
		}
		sc.close();
	}

}
