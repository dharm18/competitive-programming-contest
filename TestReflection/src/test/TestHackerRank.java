package test;

import java.util.Scanner;

public class TestHackerRank {

	static char []terms = {'h','a','c','k','e','r','r','a','n','k'};
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            s = s.toLowerCase();
            System.out.println(isContainsTerm(s)?"YES":"NO");
        }
        
        
        in.close();
	}
	
	static boolean isContainsTerm(String s){
		int m = s.length();
		int n = terms.length;
		int i=0,j=0;
		while(i<m) {
			if(s.charAt(i)==terms[j]){
				i++;
				j++;
			}
			else
				i++;
			if(j==n){
				return true;
			}
		}
		
		return false;
	}
	
}
