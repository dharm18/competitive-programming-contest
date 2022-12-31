import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRankAMZ {

	public static void main(String[] args) {
		
		/*
		 * System.out.println(HackerRankAMZ.minSwapsRequired("101000"));
		 * System.out.println(HackerRankAMZ.minSwapsRequired("101000"));
		 * System.out.println(HackerRankAMZ.minSwapsRequired("101000"));
		 * System.out.println(HackerRankAMZ.minSwapsRequired("101000"));
		 * System.out.println(HackerRankAMZ.minSwapsRequired("101000"));
		 * System.out.println(HackerRankAMZ.minSwapsRequired("101000"));
		 * System.out.println(HackerRankAMZ.minSwapsRequired("1110"));
		 * System.out.println(HackerRankAMZ.minSwapsRequired("1"));
		 */
		
		System.out.println(HackerRankAMZ.findMaxProducts(new ArrayList<Integer>(Arrays.asList(1))));
	}
	
	public static long findMaxProducts(List<Integer> products) {
	    // Write your code here
	        // sliding window
		long maxProducts = 0;
		int length=products.size();
		int left=0, right=length-1;
		long currentSumMax = 0;
		for(; right>=0; right--) {
			
			if(right+1 < length && products.get(right) < products.get(right+1)) {
				continue;
			}
			currentSumMax = products.get(left);
			long previusMax = currentSumMax;
			for(left=right-1; left>=0; --left) {
				previusMax = Math.min(previusMax-1, products.get(left));
				currentSumMax +=previusMax;
				
				if(previusMax == 1)
					break;
			}
			
			maxProducts = Math.max(maxProducts, currentSumMax);
		}
		
		return maxProducts;
	}

	public static int minSwapsRequired(String s) {
	    // Write your code here
	        int length = s.length();
	        int left=0, right=length-1;
	        int countOfDifferences=0;
	        
	        while(left <= right) {
	            if(s.charAt(left) != s.charAt(right)) {
	                countOfDifferences++;
	            }
	            left++;
	            right--;
	        }
	        
	        // length is even & difference is odd
	        if(countOfDifferences%2!=0 && length%2 ==0) {
	            return -1; //swapping not possible
	        }
	        
	        return (countOfDifferences+1)/2;
	    }
}
