package org.test.programming;

import java.util.Scanner;

public class Lighthouse {

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		boolean mat[][] = new boolean[t][t];
		long l[][] = new long[t][t];
		String temp = null;
		for (int i = 0; i < t; i++) {
			temp = scanner.nextLine();
			System.out.println(temp);
			char a[] = temp.toCharArray();
			for (int j = 0; j < a.length; j++) {
				mat[i][j] = a[j] == '*' ? false: true;
				mat[i][j] = 0;
			}
     	}*/
 		
		
		boolean mat[][] = new boolean[][]{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,true,true,true,true,true,false,false},
				{false,false,true,true,true,true,true,false,false},
				{false,true,true,true,true,true,true,true,false},
				{false,false,true,true,true,true,true,false,false},
				{false,false,true,true,true,true,true,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false}
		};
		long l[][] = new long[9][9];
		
		/*boolean mat[][] = new boolean[][]{
		{false,false,false,true,false},
		{false,false,true,true,false},
		{false,false,false,true,false},
		{false,false,false,false,false},
		{false,false,false,false,false},
		};*/
		//display matrix
		System.out.println("\nMatrix = ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");	
			}
			System.out.println();
		}
		Lighthouse lt = new Lighthouse();
		System.out.println(lt.calculateLength(mat,l));
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(l[i][j]+"\t");	
			}
			System.out.println();
		}
		//scanner.close();

	}
	
	private long calculateLength(boolean mat[][],long l[][]){
		long radius = 0;
		long temp;
		//System.out.println("calculate");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				//System.out.print(mat[i][j]+"\t");
				temp = lookAround(mat,i,j,1,l);
				System.out.print(temp +"\t");
				l[i][j] = temp;
				if(temp > radius)
					radius = temp;
			}
			System.out.println();
		}
		
		return radius;
	}
	
	public long lookAround(boolean mat[][], int row,int col,int t,long l[][]){

		long count = 0;
		int rowNbr[] = new int[] {-t, -t, -t,  0, 0,  t, t, t};
        int colNbr[] = new int[] {-t,  0,  t, -t, t, -t, 0, t};
        boolean flag = false;
        int k=0;
        for (k = 0; k < 8; ++k){
        	if (!isSafe(row + rowNbr[k], col + colNbr[k], mat) ){
        		flag = false;
        		break;
        	}
        	else
        	{
        		flag = true;
        	}
        }
        //System.out.println(flag);
        //System.out.println(k);
        if(flag && k == 8){
        	count += 1 + lookAround(mat,row, col,++t,l);
        }
        
        count += l[row][col];
        return count;
	}
	
	boolean isSafe(int row, int col,boolean mat[][]) {
		//System.out.println(row + " , " + col + "\t");
		return (row >= 0) && (row < mat.length) && (col >= 0) && (col < mat.length) && (mat[row][col]);
	}
}
