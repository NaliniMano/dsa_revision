package daily_dsa_prob;

import java.util.Arrays;

import org.junit.Test;

public class SortColors {
	/**

	testdata

	[1,1,0,2,2]  [0,1,1,2,2]
	[2,1,0]    [0,1,2]
	[2]			[2]
	****/
	@Test
	public void example1()
	 {
	 int[] nums={1,1,0,2,2};
	 doSort(nums);
	 }
	/***
	pseudocode:
	1.iterate the element in array 
	   store the values of 0,1,2 in seperate list
	2. iterate the outpinut array 
	    retrieve the values from list  and add to output 
		
	optimise:
	1. Dutch flag algo
	1. intialise 3 pointer 
	low =0,mid=0,high=length of the array
	2. iterate until mid less than high
	3.  if mid ==1 increment the mid
	    else if mid==0 swap low and mid element increment low
		else swap mid & high decerement high
	****/

	public void doSort(int[] nums) {
	        int low=0,high=nums.length-1,mid=0;
	        while(mid <= high)
	        {
	            if(nums[mid]==0)
	            {
	                int temp =nums[low];
	                nums[low++]=nums[mid];
	                nums[mid++]=temp;
	                
	            }else if(nums[mid]==1) mid++;
	            else
	            {
	                int temp =nums[high];
	                nums[high--]=nums[mid];
	                nums[mid]=temp;
	             
	            }
	            
	        }

	System.out.println(Arrays.toString(nums));	
	}

}
