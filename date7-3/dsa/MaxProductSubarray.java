package daily_dsa_prob;

public class MaxProductSubarray {

/***
testdata

nums = [2,3,-2,4]  o/p ->2*3  6

nums=[2,-1,-4,-1] o/p ->8



***/
	@Test
	public void example1()
	{
		int[] nums= {2,3,-2,4};
		findMaxProduct(nums);
		
	}
/****
1.iterate the array forward and find the max prod
  if prod ==0 reset prod=1
2. iterate the array backward and find the max
   reset when prod=0
3. return the max


***/
	private void findMaxProduct(int[] nums) {
		// TODO Auto-generated method stub
	      int prod=1,max=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++)
	        {
	            prod=prod*nums[i];
	            max=Math.max(prod,max);
	          
	            if(prod == 0)
	            {
	                prod=1;
	            }   
	             
	        }
	        prod=1;
	      
	        
	         for(int i=nums.length-1;i>=0 ;i--)
	        {
	            prod=prod*nums[i];
	           
	            max=Math.max(prod,max);
	          
	            if(prod == 0)
	            {
	                prod=1;
	            }   
	           
	        }
	        prod=1;
	        

	     System.out.println("MAx-Product"+max);                                                               
	   // return max;
	}

}
