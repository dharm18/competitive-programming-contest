import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StandardDeviation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        double mean = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            mean += a[i];
        }
        mean /=n;
        double std = 0.0;
        for(int i=0;i<n;i++){
           std +=Math.pow((a[i]-mean),2);
        }
        std = Math.sqrt(std/n);
        System.out.println(new DecimalFormat("#.0").format(std));
    }
}

