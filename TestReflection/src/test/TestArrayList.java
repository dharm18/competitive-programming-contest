package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    List o[] = new List[n];
	    for(int i=0;i<n;i++){
	        int c = sc.nextInt();
	        List<Integer> list = new ArrayList<Integer>();
	        for(int j=0;j<c;j++)
	            list.add(sc.nextInt());
	        
	        o[i] = list;
	        //System.out.println(list);
	    }
	    
	    int q = sc.nextInt();
	    for(int i=0;i<q;i++) {
	        
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        boolean flag = false;
	        //System.out.println(x + " " + y);
	        if(x > 0 && x <= n){
	            List<Integer> tmp = o[x-1];
	            //System.out.println(tmp);
	            if(tmp.size() >= y ){
	                System.out.println(tmp.get(y-1));
	            	//System.out.println(tmp);
	            }
	            else{
	                flag = true;
	            }
	        }
	        else{
	            flag = true;
	        }
	        
	        if(flag)
	        System.out.println("ERROR!");
	    }
	}
	
}
