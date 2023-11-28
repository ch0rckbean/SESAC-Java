package Coding_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class _02 {
	
	
	public static void main(String[] args) {
		int[] nums2= {3,2,5,7,11};
		int target2=9;
		int[] result2=findIndices(nums2,target2);
		System.out.println("["+result2[0]+", "+result2[1]+"]");
	}
	
	public static int[] findIndices(int[] array, int target2) {
		ArrayList<Integer> li=new ArrayList<>();
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
			
			if(array[i]+array[j]==target2) {
				li.add(i);
				li.add(j);

				}
			}
		}
		
	int[] result2 =new int[li.size()];
	for(int i=0; i<li.size(); i++) {
		result2[i]=li.get(i);
		}
	return result2;
	}

}
