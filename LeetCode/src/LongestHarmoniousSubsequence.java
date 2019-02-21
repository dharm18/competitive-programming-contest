import java.util.Scanner;

public class LongestHarmoniousSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[]=new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(new LongestHarmoniousSubsequence().findLHS(num));
	}
	
	public int findLHS(int[] nums) {
        return 0;
    }
}
