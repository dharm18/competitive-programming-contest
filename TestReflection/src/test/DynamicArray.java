package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //N
        int q = sc.nextInt(); //Q
        int lastAns = 0;
        int type=0,x=0,y=0,s;
        Object seq[] = new Object[n];
        /*for(int i=0;i<n;i++){
            for(int i=0;i<n;i++){
            
            }   
        }*/
        
        for(int i=0;i<q;i++){
            type = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            s = (x^lastAns)%n;
            if(type == 1){
                if(seq[s] == null){
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(y);
                    seq[s] = l;
                }
                else{
                    ((List<Integer>)seq[s]).add(y);
                }
            }
            else{
                List seqList = (List)seq[s];
                int size = seqList.size();
                int index = y%size;
                System.out.println(index);
                lastAns = (int) seqList.get(index);
                System.out.println(lastAns);
            }
        }
        sc.close();
    }
}
