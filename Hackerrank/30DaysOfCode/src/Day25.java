import java.util.Scanner;


public class Day25 {

	public static void main(String[] args) {
		 /* Enter your code here. */
        Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			isPrime(n);
		}

		scanner.close();

	}
	
	private static void isPrime(long n){
        Double range = Math.sqrt((double)n);
        boolean flag = false; 
        for (int i = 2; i < range; i++) {
			if(n%i == 0){
				flag = true;
				break;
			}
		}
        
        if(flag)
        	System.out.println("Not prime");
        else
        	System.out.println("Prime");
    }

}
