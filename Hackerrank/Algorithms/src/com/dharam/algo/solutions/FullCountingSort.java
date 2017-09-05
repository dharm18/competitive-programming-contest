package com.dharam.algo.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FullCountingSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//List<Data> data = new ArrayList<Data>(n);
		Data[] data = new Data[n];
		int count[] = new int[100];
		Data[] output = new Data[n];
		int half = n/2;
		int tmp=0;
		for(int i=0; i<n; i++) {
			
			Data t = new Data();
			tmp = sc.nextInt();
			t.i = tmp;
			t.s = sc.next();
			if(i<half){
				t.flag = true; 
			}
			//data.add(t);
			data[i] = t;
			++count[tmp];
		}
		
		for(int i=1;i<100;i++){
			count[i]+=count[i-1];
		}
		System.out.println(Arrays.toString(count));
		
		for(int i=0; i<n; i++) {
			output[count[data[i].i-1]] = data[i];
			--count[data[i].i];
		}
		
		/*Collections.sort(data, new Comparator<Data>() {

			@Override
			public int compare(Data d1, Data d2) {
				return d1.i-d2.i;
			}
		});*/
		
		for(Data t: output){
			System.out.print((t.flag ? "-" : t.s) + " ");

		}
		
		
		sc.close();
	}
	
	

}

class Data{
	int i;
	String s;
	boolean flag;
}