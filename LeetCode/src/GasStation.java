
public class GasStation {

	public static void main(String[] args) {
		//System.out.println(new GasStation().canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));
		System.out.println(new GasStation().canCompleteCircuit(new int[] {5,1,2,3,4}, new int[] {4,4,1,5,1}));
		
		
		
	}
	
	 public int canCompleteCircuit(int[] gas, int[] cost) {
	        int tank=0, startingIndex = -1;
	        int n = gas.length;
	        for(int i=0; i<n; i++) {
	            if(tank + gas[i] >= cost[i]) {
	                if(startingIndex == -1) {
	                    startingIndex=i; // 3
	                    tank = gas[i];
	                    int counter =0;
	                    int j = (startingIndex + 1)%n;
	                    while(tank >= cost[(j-1+n)%n]) {
	                        if(startingIndex == j) { // completes circuits
	                            return startingIndex;
	                        }
	                        tank = tank - cost[(j-1+n)%n] + gas[(j+n)%n];
	                        j = (j+1)%n;
	                        counter++;
	                    }
	                    
	                    if(counter < n) { // didn't get circuits with startingIndex
	                    	startingIndex = -1;
	                    }
	                }
	            }
	        }
	        return -1;
	    }

}
