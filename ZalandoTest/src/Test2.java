import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		System.out.println(new Test2().solution("The quick brown fox jumps over the lazy dog", 39));
		
	}
	
	public String solution(String message, int K) {
        // write your code in Java SE 8
		if(K > message.length())
			return message;

		String[] words = message.split(" ");
		StringBuilder output = new StringBuilder("");
		int i=0;
		while((output.length()+words[i].length()) <= K) {
			output.append(words[i]).append(" ");
			//System.out.println(output + " output.length() " + output.length());
			i++;
			
		}
		//System.out.println(output.length());
		return output.toString().trim();
    }
	
	
}
