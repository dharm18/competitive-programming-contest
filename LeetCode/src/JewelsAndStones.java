import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String j =  sc.next();
		String s = sc.next();
		sc.close();
		System.out.println(new JewelsAndStones().numJewelsInStonesUsingMap(j,s));
	}
	
	// O(MN)
	public int numJewelsInStones(String J, String S) {
		char[] jewels = J.toCharArray(); // c1
		char[] sa = S.toCharArray();  //c2
		int count = 0;    //c3
		for (char c : sa) { // O(M)
			for (char jw : jewels) { //O(N)
				if(c == jw)
					count++;
			}
		}
 		return count;
    }
	// O()
	public int numJewelsInStonesUsingRegex(String J, String S) {
		return S.replaceAll("[^" + J + "]", "").length();
	}
	
	// O(M+N)
	public int numJewelsInStonesUsingMap(String J, String S) {
		Set setJ = new HashSet(); //c1
		for(char j:J.toCharArray())  //O(N)
			setJ.add(j);
		int count = 0;
		for (char c : S.toCharArray()) { //a(M)
			if(setJ.contains(c)) //O(1)
				count++;
		}
 		return count;
    }
}
