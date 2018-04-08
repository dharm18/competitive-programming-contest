package com.dharam.zemoso.test;

public class SparseDecompositionTest {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		System.out.println(new SparseDecompositionTest().solution(1000000000));
		System.out.println((System.currentTimeMillis()-start)/1000000);
	}

	public int solution(int N) {
		
		int halfN = N/2;
		for(int i=1;i<= halfN;i++){
			if(checkSparse(i) && checkSparse(N-i)){
				return i;
			}
				
		}
		
		return -1;
		
    }
	
	public boolean checkSparse(int n){
		return (n & (n >> 1)) == 0;
	}
	
}
