import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		System.out.println(new Test3().solution(8, 0));
		
	}
	
	public int solution(int N, int K) {
        // write your code in Java SE 8
		int rounds = 0;
		if(K==0)
			return N-1;
		
		while(N!=1) {
			rounds++;
			if(N%2==0 && K > 0) {
				N=N/2;
				K--;
			}
			else
				N=N-1;
			//System.out.println(N + " " + K);
		}
		
		
		return rounds;
    }
	
}
