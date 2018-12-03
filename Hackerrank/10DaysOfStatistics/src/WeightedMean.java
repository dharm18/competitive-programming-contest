import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightedMean {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int w[] = new int[n];
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        double wm=0;
        int sumWeight = 0;
        for(int i=0; i<n;i++){
            wm += a[i]*w[i];
            sumWeight += w[i];
        }
        wm/=sumWeight;
        System.out.print(new DecimalFormat("#.0").format(wm));
    }
}

