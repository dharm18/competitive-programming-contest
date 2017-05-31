package test;

import java.util.Scanner;

public class CeasarCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        in.close();
        StringBuffer result = new StringBuffer(); 
        for(int i=0;i<n;i++){
        	char t = s.charAt(i);
            if(Character.isLetter(t) ){
            	if(Character.isUpperCase(t))
            		t = (char)((((int)t)+k-65)%26+65);
            	else
            		t = (char)((((int)t)+k-97)%26+97);
            }
            result.append(t);
        }
        System.out.println(result.toString());
	}
}
