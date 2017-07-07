package test;

import java.util.Scanner;

public class GreatXOR {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            System.out.println(countValid(x));
        }
    }
    
    static long countValid(long x){
    	long start = System.currentTimeMillis();
        long count = 0;
        /*for(long i=1;i<x;i++) {
            if((i > x) ^ (x > x))
                count++;
        }*/
        count = ~x & NumberOfSetBits(x);
        //System.out.println(NumberOfSetBits(x));
        
        long end = System.currentTimeMillis();
        System.out.println("Time taken : "+ ((end-start)/1000) + " secs");
        return count;
    }
	
    static long NumberOfSetBits(long i)
    {
         // Java: use >>> instead of >>
         // C or C++: use uint32_t
         i = i - ((i >>> 1) & 0x55555555);
         i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
         return (((i + (i >>> 4)) & 0x0F0F0F0F) * 0x01010101) >>> 24;
    }
    
}
