
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test1 {


	public static void main(String[] args) {
		String a[] = new Test1().getShrunkArray(new String[]{"a","a","a","a"}, 3);
		for (String string : a) {
			System.out.print(string + " ");	
		}
		
		/*int a = new Test1().getCountOfPossibleTeams(new int[]{5,2,3,1,4});
		System.out.println(a);*/
	}
	
	static int getCountOfPossibleTeams(int[] coders) {
        
        int count = 0,n=coders.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((coders[i] > coders[j] && coders[j] > coders[k]) || (coders[i] < coders[j] && coders[j] < coders[k]))
                        count++;
                }   
            }
        }
        return count;
    }

    /*
     * Complete the function below.
     */
    static String[] getShrunkArray(String[] inputArray, int burstLength) {

    	boolean flag[] = new boolean[inputArray.length];
    	int arrayLength = inputArray.length;
     	int startIndex =0, lastIndex=0,count=0,totalMarked =0;
     	boolean isDuplicateFound = false;
        for(int i=0;i<arrayLength-1;i++){
        	while(i<arrayLength-1 && inputArray[i].equals(inputArray[i+1])){
        		
        		if(count==0)
        			startIndex = i;
        		count++;
        		i++;
        	}
        	if(startIndex > 0 && count+1 >= burstLength){
        		lastIndex = i;
        		//mark flag false;
        		for(int j=startIndex;j<=lastIndex;j++){
        			flag[j]=true;
        			totalMarked++;
        		}
        		startIndex=0;
    			count=0;
    			lastIndex=0;
        		i++;
        		isDuplicateFound = true;
        	}
        }
        
        if(!isDuplicateFound){
        	return inputArray;
        }
        
        String[] output = new String[arrayLength-totalMarked];
        int j=0;
        for(int i=0;i<arrayLength;i++){
        	if(!flag[i]){
        		output[j] = inputArray[i];
        		j++;
        	}
        }
        //for(boolean t : flag)
        //System.out.println(t);
        
        return getShrunkArray(output,burstLength);
    }
	
    /*public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] res;
        int inputArray_size = 0;
        inputArray_size = Integer.parseInt(in.nextLine().trim());

        String[] inputArray = new String[inputArray_size];
        for(int i = 0; i < inputArray_size; i++) {
            String inputArray_item;
            try {
                inputArray_item = in.nextLine();
            } catch (Exception e) {
                inputArray_item = null;
            }
            inputArray[i] = inputArray_item;
        }

        int burstLength;
        burstLength = Integer.parseInt(in.nextLine().trim());

        res = getShrunkArray(inputArray, burstLength);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }*/
}
