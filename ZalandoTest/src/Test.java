import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		System.out.println(new Test().solution(1, 111));
		
	}
	
	public int solution(int A, int B) {
        // write your code in Java SE 8
		int count=0;
		for(int i=A; i<=B; i++) {
			if(isLovelyNumeric(i))
				count++;
		}
		
		return count;
    }
	
	public static boolean isLovelyNumeric(int n) {
		if(n <= 110) {
			return true;
		}
		
		int a[] = {0,0,0,0,0,0,0,0,0,0};
		int rem = 0;
		while(n!=0) {
			rem = n%2;
			a[rem]++;
			n/=2;
		}
		//System.out.println(Arrays.toString(a));
		for(int i:a) {
			if(i > 2)
				return false;
		}
		
		return true;
	}
}
