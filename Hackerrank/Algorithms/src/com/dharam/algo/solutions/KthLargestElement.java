package com.dharam.algo.solutions;

import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {
		
		int a[] = {1, 23, 12, 9, 30, 2, 50};
		int k=3;
		for(int i=0;i<k;i++) {
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
			System.out.println(a[a.length-i-1]);
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
