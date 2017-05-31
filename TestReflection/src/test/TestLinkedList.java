package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		
		int q = sc.nextInt();
		for(int i=0;i<q;i++){
			String ins = sc.next();
			int x = sc.nextInt();
			if(ins.equals("Insert")){
				int y = sc.nextInt();
				list.add(x, y);
			}
			else if(ins.equals("Delete")){
				list.remove(x);
			}
		}
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
		}
		
		sc.close();
	}
}
