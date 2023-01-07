import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		System.out.println(new IsomorphicStrings().isIsomorphic("egg", "add"));
	}

	public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();
        Map<Character, Boolean> mappedBefore = new HashMap<>();

        int m = s.length();
        int n = t.length();
        if( m != n)
            return false;

        boolean isomorphic = true;

        for(int i=0; i<m; i++) {
            if(mapping.containsKey(s.charAt(i))) {
                if(mapping.get(s.charAt(i)) != t.charAt(i)) {
                    isomorphic = false;
                    break;
                }
            }
            else {
                if(mappedBefore.containsKey(t.charAt(i))) {
                    isomorphic = false;
                    break;
                }
                else{
                    mappedBefore.put(t.charAt(i), true);
                    mapping.put(s.charAt(i), t.charAt(i));
                }
                
            }
        }

        return isomorphic;
    }
}
