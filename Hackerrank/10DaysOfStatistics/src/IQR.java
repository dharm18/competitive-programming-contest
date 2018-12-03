
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IQR {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 5 || n > 50)
            return;
        int a[] = new int[n];
        int f[] = new int[n];
        int total = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
            total +=f[i];
            for(int j=0;j<f[i];j++)
            	numbers.add(a[i]);
        }
        sc.close();
        Collections.sort(numbers);
        //double q2 = getMedian(a,0,n-1);
        double q1=0,q3=0;
        if(n%2==0){
            q1 = getMedian(numbers, 0, (total/2)-1);
            q3 = getMedian(numbers, (total / 2), total-1);
        }
        else{
            q1 = getMedian(numbers, 0, (total / 2)-1);
            q3 = getMedian(numbers, (total / 2)+1, total-1);
        }    
        System.out.println(new DecimalFormat("#.0").format(q3-q1));
        //System.out.println(new DecimalFormat("#").format(q2));
        //System.out.println(new DecimalFormat("#").format(q3));
    }

    public static double getMedian(List<Integer> a, int low,int high) {
        //System.out.println(low + " " + high);
        //System.out.println(a);
        int n = (high-low+1);
        double median = 0;
        if(n%2==0){
           median = (a.get(low + (n/2)-1) + a.get(low + n/2))/2.0;
        }
        else
           median = a.get(low + n/2);

        return median;
    }
}

