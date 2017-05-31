package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestConfusion {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> t = new HashMap<>();
		t.put(1, 1);
		t.put(1, 1);
		t.put(2, 4);
		t.put(1, 2);
		
		
		Set<Entry<Integer, Integer>> tmp = t.entrySet();
		Iterator<Entry<Integer, Integer>> i = tmp.iterator();
		while(i.hasNext()) {
			Entry<Integer, Integer> pair = i.next();
			System.out.println(pair.getKey() + " " + pair.getValue());
			i.remove();
		}
		
	}
	
}
