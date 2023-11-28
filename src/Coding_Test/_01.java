package Coding_Test;

import java.lang.reflect.Array;

public class _01 {

	public static int sumLessThan(int[] array, int num) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			if (num>array[i]){
				sum+=array[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int [] nums1= {2,5,8,3,7};
		System.out.println(sumLessThan(nums1,5));	
	}
}
	
