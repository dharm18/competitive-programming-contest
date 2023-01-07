
public class RunningSumOf1dArray {

	public static void main(String[] args) {
		System.out.println(new RunningSumOf1dArray().runningSum(new int[] {1,2,3,4}));
	}
	
	 public int[] runningSum(int[] nums) {
	        int n = nums.length;
	        int result[] = new int[n];
	        result[0] = nums[0];
	        for(int i=1; i< n;i++) {
	            result[i] = result[i-1] + nums[i];
	        }
	        
	        return result;
	    }

}
