package test;

import java.util.Scanner;

public class TestGraph {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int m[][] = new int[r][c];
        
        for (int i = 0; i < r; i++) {
        	for (int j = 0; j < c; j++) {
    			m[i][j] = sc.nextInt();
    		}
		}
        
		sc.close();
	}
	
	public static int connectedCellInGrid(int m[][], int r, int c){
		
		boolean visited[][] = new boolean[r][c];
		
		//
		for (int i = 0; i < r; i++) {
        	for (int j = 0; j < c; j++) {
        		dfs(i,j,r,c);
    		}
		}
		
		return -1;
	}
	
	public static void dfs(int i,int j,int r,int c){
		
	}
	
	
}
