import java.util.Scanner;

public class JewelsAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String j =  sc.next();
		String s = sc.next();
		sc.close();
		System.out.println(new JewelsAndStones().numJewelsInStones(j,s));
	}
	
	public int numJewelsInStones(String J, String S) {
		char[] jewels = J.toCharArray();
		char[] sa = S.toCharArray();
		int count = 0;
		for (char c : sa) {
			for (char jw : jewels) {
				if(c == jw)
					count++;
			}
		}
 		return count;
    }

}
