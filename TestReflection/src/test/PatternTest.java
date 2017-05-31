package test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternTest {

	static final String INVALID="Invalid";
	static final String VALID="Valid";
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	             //Write your code
	         System.out.println(isValidPattern(pattern)?VALID:INVALID);
	         testCases--;
	      }
	     in.close();
	}
	
	static boolean isValidPattern(String pattern){
		
		try{
			Pattern.compile(pattern);
			return true;
		}
		catch(Exception e){
			return false;
		}
		
	}
}
