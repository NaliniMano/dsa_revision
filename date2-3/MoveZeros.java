package fasttrack_prob;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	
/****Movezeros
	
	test data
	nums={0,1,0,4,0,2,0,0} o/p -> 1,4,2,0,0,0,0
	nums={0}  o/p -> 0
	nums ={-1,0,7,9} o/p -> -1,7,9,0
	
	****/
	
	@Test
	public void example1()
	 {
	  int[] nums={-1,0,7,0,9};
	  doMoveZerEnd(nums);
	 }
	 
/***	 psuedocode:
	 bruteforce
	 1. iterate the array store the nonzero element in list
	 2. create output array add the element from the list
	 
	 Optimise:
	 1. declare left->0 right->0
	 2. loop thorugh until right less than left
	 3. if right!=0 swap left with right increment left
	 4. right
*****/	 
	 public void doMoveZerEnd(int[] nums)
	 {
	   int left=0,right=0;
while(right< nums.length)
 {
   if(nums[right]!=0)
    {
	  int temp = nums[right];
	  nums[right]=nums[left];
	  nums[left++]=temp;
	}
	right++;
 }
System.out.println(Arrays.toString(nums));
//return nums;
}


}
