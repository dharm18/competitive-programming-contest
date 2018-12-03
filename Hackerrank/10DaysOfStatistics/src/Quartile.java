
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Quartile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 5 || n > 50)
            return;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        double q2 = getMedian(a,0,n-1);
        double q1=0,q3=0;
        if(n%2==0){
            q1 = getMedian(a, 0, (n/2)-1);
            q3 = getMedian(a, (n / 2), n-1);
        }
        else{
            q1 = getMedian(a, 0, (n / 2)-1);
            q3 = getMedian(a, (n / 2)+1, n-1);
        }    
        System.out.println(new DecimalFormat("#").format(q1));
        System.out.println(new DecimalFormat("#").format(q2));
        System.out.println(new DecimalFormat("#").format(q3));
    }

    public static double getMedian(int a[], int low,int high) {
        System.out.println(low + " " + high);
        System.out.println(Arrays.toString(a));
        int n = (high-low+1);
        double median = 0;
        if(n%2==0){
           median = (a[low + (n/2)-1] + a[low + n/2])/2.0;
        }
        else
           median = a[low + n/2];

        return median;
    }
}

