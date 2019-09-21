package test;

import java.util.Arrays;
import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, -1, 0, 2 };
		System.out.println(Arrays.toString(twoSumEqualsTo(a, 4)));

	}

	public static int[] twoSumEqualsTo(int a[], int sum) {

		int result[] = new int[2];
		HashMap<Integer, Integer> pair = new HashMap<>();
		int comp = 0, val = 0;
		for (int i = 0; i < a.length; i++) {
			val = a[i];
			comp = sum - val;
			
			if (pair.containsKey(comp)) {// contains
				result[0] = val;
				result[1] = comp;
				return result;
			} else {
				pair.put(comp, val); //
			}
		}

		return result;
	}
}
