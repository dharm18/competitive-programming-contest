package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> a = new HashMap<Character,Integer>();
        String  input = sc.nextLine();
        int t;
        int max = 0;
        char minCh = Character.MAX_VALUE;
        char ip[] = input.toCharArray();
        for(int i=0;i<ip.length; i++){
            char ch = ip[i];
        	if(a.containsKey(ch)){
        	    t = a.get(ch)+1;
        	    a.put(ch,t);
        	}
        	else{
        	    t = 1;
        	    a.put(ch,t);
        	}
        }
        //A cat with rabiesretardsa dudefor no apparent reason.
        Iterator it = a.entrySet().iterator();
        char cht; int mt;
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            cht = (char) pair.getKey();
            mt = (int) pair.getValue();
            if(mt>=max){
        	    if(mt == max && minCh > cht) {
        	    	minCh = cht;
        	    }
        	    else
        	    	minCh = cht;
        	    max = mt;
        	}
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }

        
        System.out.println(minCh+" "+max);
        sc.close();
	}

}
