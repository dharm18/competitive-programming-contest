package test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static public void main(String[] args) {

		int a[] = { 5, 8, 1, 3, 7, 9, 2 };
		//quickSort(a,0,a.length-1);
		//System.out.println(Integer.parseInt("01"));
		
		
		printArray(a);
	}

	static void quickSort(int[] a, int low, int high) {
		if(low<high){
			int p = partititon(a, low, high);
			quickSort(a, low, p-1);
			quickSort(a, p+1, high);
		}
	}
	
	static int partititonWithFirstPivot(int[] a,int low,int high) {
		int i = low - 1;
		int pivot = a[low];
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		// 5, 8, 1, 3, 7, 9, 2
		
		int temp;
		for (int j = low+1; j <= high-1; j++) {
			if (a[j] <= pivot) {
				i++;
				// swap
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		
		return i+1;
	}
	
	static int partititon(int[] a,int low,int high) {
		int i = low - 1;
		int pivot = a[high];
		int temp;
		for (int j = low; j <= high-1; j++) {
			if (a[j] <= pivot) {
				i++;
				// swap
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		
		return i+1;
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
