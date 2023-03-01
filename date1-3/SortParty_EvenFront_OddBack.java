package fasttrack_prob;

import java.util.Arrays;

import org.junit.Test;

public class SortParty_EvenFront_OddBack {
	
	/**
	 * 
	 * nums ={3,1,2,4 }  output ={2,4,3,1}

nums={1,5,7,9,0}  outut={0,1,5,7}

nums={1}  output={1}
	 */
	@Test
	public void example1()
	 {
	 int[] nums={3,1,2,4};
	 doSortParity(nums);
	 
	 }
	 
	 /*** pseudocode
	 
	 declare output array
	 declare two pointer left =0,right=nums.length-1
	 iterate through the length of array
	 if current element even
	 add to first output
	 else  add to last index
	 return the output
	 
	 time complexity : o[n]
	 
	 
	 ***/

	public void doSortParity(int[] nums)
	 {
	 
	         int[] output = new int[nums.length];
	        int left = 0;
	        int right = nums.length-1;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]%2==0)
	                output[left++] = nums[i];
	            else
	                output[right--] = nums[i];
	        }
	        System.out.print(Arrays.toString(output));
	        //return output;

	 
	 
	 
	 }
		

}
