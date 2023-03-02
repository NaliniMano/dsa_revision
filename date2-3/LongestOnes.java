package fasttrack_prob;

public class LongestOnes {
	
/***	TestData
	nums ={1,1,0,1 }  ouput -> 3
	nums ={0,1,1,1,0,1,1,0,1}  output -> 5
	
	***/

	public void example1()
	{
	 int[] nums={0,1,1,1,0,1,1,0,1};
	 findLongestSubArray(nums);
	}


/***	pseudocode:
	left ->0 ,right->0
	loop throgh until left less than right
	if element in right =0 reduece k
	if k less than 0 reset right to left
	find the max legnth 
	retunr the max length
*****/
	public void findLongestSubArray(int[] nums)
	 {
	 int left=0,right=0, max=Integer.MIN_VALUE;
	 int k=1;
	 while(right < nums.length)
	  {
	   if(nums[right] ==0) k--;
	   if(k< 0)
	    {
			if(nums[left] == 0) {
						k++;
					}
		 left++;
		}
		if(k>=0 & k<=1) max=Math.max(max,right-left);
	  }
	 System.out.println(max);
//	 return max;
	 }
		 
		 

}
