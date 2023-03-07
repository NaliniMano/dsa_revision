package daily_dsa_prob;

import java.util.Arrays;

import org.junit.Test;

public class RotateArray {


/***
testdata
nums = [-1,-100,3,99], k = 2 o/p -> [3,99,-1,-100]
{1,2,3,4,5,6,7} k=3  o/p ->5,6,7,1,2,3,4

{3,4,5} k=2 => {4,5,3}
{2,3,1,0,5} k=10 -> o/p ->{0,5,2,3,1}
***/
	
	@Test
	public void example1()
	{
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		doRotateArray(nums,k);
	}
/**
 * 1. divide the array into 3
 *      1.0 to length-k
 *      2. length-k to length
 *      3. 0 to length
 * 2. do swap (0, length-k)
 *       swap(length-k , length)
 *       swap(0 ,length)
 * 
 * 
 * @param nums
 * @param k
 */
	private void doRotateArray(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		if(k> nums.length) k=k%nums.length;
		
		int temp=nums.length-k;
		
		int l1=0,l2=temp-1;
		int r1=temp,r2=nums.length-1;
		int i=0,j=nums.length-1;
		
	
	    swap(nums,l1,l2);
	 

	    swap(nums,r1,r2);
	    swap(nums,i,j);	
	    
	    System.out.println(Arrays.toString(nums));
	}

	private void swap(int[] nums, int l1, int l2) {
		// TODO Auto-generated method stub
		
		while(l1 < l2)
		{
			int temp = nums[l1];
			nums[l1]=nums[l2];
			nums[l2]=temp;
			
			l1++;
			l2--;
		}
		
	}

}
