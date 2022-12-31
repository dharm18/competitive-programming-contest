import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//System.out.println(new Main().solution("babaa"));
		//System.out.println(new Main().solution("bbbab"));
		//System.out.println(new Main().solution("bbbaaabbb"));
		
//		System.out.println(Arrays.toString(new Main().solution(new int[]{3, 2, 4, 3}, 2, 4)));
//		System.out.println(Arrays.toString(new Main().solution(new int[]{1, 5, 6}, 4, 3)));
//		System.out.println(Arrays.toString(new Main().solution(new int[]{1, 2, 3, 4}, 4, 6)));
//		System.out.println(Arrays.toString(new Main().solution(new int[]{6, 1}, 1, 1)));
		
//		System.out.println(new Main().solution(new int[]{10, 19, 15}, 2, 2));
//		
//		System.out.println(new Main().solution(new int[]{6, 1, 4, 6, 3, 2, 7, 4}, 3, 2));
//		
//		System.out.println(new Main().solution(new int[]{3,8,1,3,2,1,8,9,0}, 3, 2));
//		
//		System.out.println(new Main().solution(new int[]{2,1,5,6,0,9,5,0,3,8}, 4, 3));
		
//		System.out.println(new Main().solution(new int[]{4,2,3,7}, 2, 2));
//		
//		System.out.println(new Main().solution(new int[]{10, 3, 4, 7}, 2, 3));
//		
//		System.out.println(new Main().solution(new int[]{4, 2, 5, 4, 3, 5, 1, 4, 2, 7}, 3,2));
//		
//		System.out.println(new Main().solution(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 3,3));
		
		//System.out.println(new Main().solution(55));
		//System.out.println(new Main().solution(1765));
		//System.out.println(new Main().solution(98)); // 101
		System.out.println(new Main().solution(44432));
		
	}

	public int solution(String S) {
		int max = 0, counter=1;
		int n = S.length();
        for(int charIndex=1; charIndex < n; charIndex++) {
        	if(S.charAt(charIndex) != S.charAt(charIndex-1)) {
        		max = Math.max(counter, max);
        		counter = 1;
        	}
        	else {
        		counter++;
        	}
        }
        // last index consideration
        max = Math.max(counter, max);
        
        counter = 1;
        int result = 0;
        for(int charIndex=1; charIndex < n; charIndex++) {
        	if(S.charAt(charIndex) != S.charAt(charIndex-1)) {
        		result = result + max - counter;
        		counter = 1;
        	}
        	else {
        		counter++;
        	}
        }
        return result + max - counter;
    }
	
	public int[] solution2(int[] A, int F, int M) {
        int falseArray[] = new int[F];
        int totalRolls = A.length + F;
        int totalSumForAllRolls = M * totalRolls;
        int totalSumForKnownRolls = 0;
        for(int knownRoll : A)
        	totalSumForKnownRolls += knownRoll;
        
        int totalSumForUnKnownRolls = totalSumForAllRolls - totalSumForKnownRolls;
        
        // base conditions
        if(totalSumForUnKnownRolls < F || totalSumForUnKnownRolls > F*6) {
        	return new int[1];
        }
        
        // generate one of the possibilities
        int fRolls = F;
        for(int i=0; i<falseArray.length; i++) {
        	
        	if(totalSumForUnKnownRolls - (fRolls-1) <= 6) {
        		falseArray[i] = totalSumForUnKnownRolls - (fRolls-1);
        		Arrays.fill(falseArray, i+1, F, 1);
        		break;
        	}
        	else {
            	// fill everything to 6
            	falseArray[i] = 6;
            	totalSumForUnKnownRolls -= 6;
            	fRolls--;        		
        	}
        }
       
        
        return falseArray;
    }
	
	/*
	 * public int solution(int[] A, int K, int L) { // base condition int n =
	 * A.length; if(L+K > n) return -1;
	 * 
	 * int maxKLSum = slidingWindowMax(A, K, L, n); int maxLKSum =
	 * slidingWindowMax(A, L, K, n);
	 * 
	 * 
	 * return Math.max(maxLKSum, maxKLSum); }
	 */
	
	private int slidingWindowMax(int[] A, int K, int L, int n) {
		//calculate max for both K and L
        int lSum = 0, kSum = 0, maxSum = 0, maxKSum = 0;
        
        for (int i = 0; i < L+K; i++) { // at the end i will L+K
			if(i < K) { // 0 to K index
				kSum += A[i];
			}
			else { // remaining consecutive for L
				lSum += A[i];
			}
		}
        
        maxSum = lSum + kSum;
        maxKSum = kSum;
        
        for (int i = L + K; i < n; i++) {
			lSum += A[i] - A[i-L]; // move L by 1
			kSum += A[i-L] - A[i-L-K]; // move K by 1
			maxKSum = Math.max(maxKSum, kSum);
			maxSum = Math.max(maxSum, lSum + maxKSum);
		}
        
		return maxSum;
	}
	
	public int solution(int[] A, int X, int Y) {
		int minimumCost = 2000000;
        int n = A.length;
        int currentCost = 0;
        for(int i=0; i+(2*X-1)<n; i++) {
            currentCost=A[i];
            for(int j=1; j<X && j*Y+i < n; j++ ) {
            	if(j*Y+i >= n) { break; }
            	currentCost += A[j*Y+i];
				
            }
            minimumCost = Math.min(currentCost, minimumCost);
        }

        return minimumCost;
    }
	
	public int solution(int N) {
        N = N+1;
        int t = N;

        int f;
        int no, p=-1, pre=-1;
        boolean flag=true, unique=true;
        // check consecutive digits
        while(flag) {
            f=t;
            // check
            unique=true;
            while(f>0) {
                pre=p;
                p=f%10;
                f=f/10;
                if(pre==p) {
                	unique=false;
                	t++;
                	break;
                }
            }
            
            if(f==0 && unique)
            	flag=false;
        }

        return t;
    }
}
