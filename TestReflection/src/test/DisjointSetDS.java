package test;

import java.util.Scanner;

public class DisjointSetDS {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int a[] = new int[n];
		initialise(a);

	}
	
	private static void initialise(int a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
	}
	
	//quick find : o(1)
	private static boolean find(int arr[],int a,int b) {
		return arr[a] == arr[b];
	}
	
	//union operation : o(n)
	private static void union(int arr[], int a, int b) {
		int temp = arr[a];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if(arr[i]==temp){
				arr[i] = arr[b];
			}
		}
	}
	
	private static int parent(int arr[],int i){
		while(arr[i] != i){
			i = arr[i];
		}
		return i;
	}
	
	//parent of ith element is ith item : O(logn)
	private static void quickUnion(int arr[], int a, int b) {
		int parentA = parent(arr,a);
		int parentB = parent(arr,a);
		arr[parentA] = parentB;
	}
	
	private static boolean QuickUnionFind(int arr[],int a,int b) {
		return parent(arr,a) == parent(arr,b);
	}
}
