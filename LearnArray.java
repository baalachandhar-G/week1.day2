package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {

	
	
	public static void main (String[] arg) {
		
		int[] NUMS = {10,20,30,40,50};
		
		int Length= NUMS.length;
		
		System.out.println(Length);
		
		System.out.println(NUMS[0]);
		
		Arrays.sort(NUMS);
		
		
		
		for(int i=0;i<Length;i++) {
			
			System.out.println(NUMS[i]);
		}
		
		for(int i=Length-1; i<0;i++) {
			
			System.out.println(NUMS[i]);
		}
		
		
		
		}
		
		
	}
	
	
}
