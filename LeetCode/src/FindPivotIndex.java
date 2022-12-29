
public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
        int n = nums.length;
        if(n<0)
            return -1;
        
        int prefix[] = new int[n+1];
        prefix[0] = 0;
        for(int i=1; i<=n; i++) {
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        //System.out.println(Arrays.toString(prefix));
        for(int i=1; i<prefix.length; i++) {
            if(prefix[i-1] == (prefix[prefix.length-1] - prefix[i])) {
                return i-1;
            }
        }

        return -1;
    }
}
