package prob_0603;

import org.junit.Test;

public class MissingNumber {
	
	/**Testdata

	n={0,4,2,1}  output->3

	n={0,1}  output ->2

**/
	@Test
	public void example1()
	 {
	  int[] nums={0,4,2,1};
	  System.out.println(missingNumber(nums));
	//  missingNumber(nums);
	 }

	 /********
	 
	 1.iterate  array find the sum
	 2.use math formaul n * n+1 /2 - sum to find missing number
	   where n -> length of the array
	 
	 
	 
	 *****/

	  
	  public int missingNumber(int[] nums) {
	        int sum=0;
	        int n=nums.length;
	        for(int i=0;i<nums.length;i++)
	        {
	            sum+=nums[i];
	        }
	        
	        
	      return n *(n+1)/2-sum;  
	    }
	  }


