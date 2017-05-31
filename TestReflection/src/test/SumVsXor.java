package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumVsXor {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n;
        long st = System.nanoTime();
		try {
			n = Long.parseLong(br.readLine());
			long max = 0;
			/*for(long i=0;i<=n;i++){
				if((i+n) == (i^n))
					max++;
				if(((System.nanoTime() - st)/1000000) > 4000) {
					System.out.println("Timeout has occurred");
					break;
				}
					
			}
			*/
			while(n>0){
				
				if((n&1) == 0)
					max++;
				n = n>>1;
			}
			System.out.println(1<<max);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println((System.nanoTime() - st)/1000000);
		}
	}

}
