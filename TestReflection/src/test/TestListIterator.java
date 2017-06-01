package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
	
		
		List<String> list = new ArrayList<String>();
		list.add("AAAAA");
		list.add("BBBBB");
		list.add("CCCCC");
		list.add("DDDDD");
		
		System.out.println("## Example using Iterator - only forward direction allowed ##");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("## Example using ListIterator - Forward/Backward direction allowed ##");
		ListIterator<String> li = list.listIterator();
		System.out.println("Traversing forward order");
		while(li.hasNext()){
			System.out.println(li.next());
		}
		
		System.out.println("Traversing reverse order");
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
	}
	
}
