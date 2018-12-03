import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MMM {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        int n = scanner.nextInt();
        int a[] = new int[n];
        double mean=0,median=0;
        int mode=Integer.MAX_VALUE;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
            if (hash.containsKey(a[i])) {
                hash.put(a[i], hash.get(a[i]) + 1);
            } else {
                hash.put(a[i], 1);
            }
            mean += a[i];
        }
        Arrays.sort(a);
        mean /= n;
        if(n%2 != 0)
            median = a[n/2];
        else
            median = (a[n/2]+a[(n/2)-1])/2.0;

        //System.out.println(a[n/2]);
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if(max <= entry.getValue()) {
                
                if(max == entry.getValue()) {
                    mode = mode <= entry.getKey() ? mode : entry.getKey();
                }
                else
                    mode = entry.getKey();

                max = entry.getValue();

                //System.out.println(entry.getKey() + " : " + entry.getValue());
                //System.out.println(mode);
            }
        }
        System.out.println(df.format(mean));
        System.out.println(df.format(median));
        System.out.println(mode);
        scanner.close();
    }
}

