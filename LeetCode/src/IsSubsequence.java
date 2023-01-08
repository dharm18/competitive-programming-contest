
public class IsSubsequence {

	public static void main(String[] args) {
		System.out.println((0-1+5)%5);
		//System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
	}

	public boolean isSubsequence(String s, String t) {
        int sindex=0, tindex=0;
        while(sindex < s.length() && tindex < t.length()) {
            if(s.charAt(sindex) == t.charAt(tindex)) {
                sindex++;
                tindex++;
            }
            else{
                tindex++;
            }
        }

        return sindex == s.length();
    }
}
