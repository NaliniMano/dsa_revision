package slidding_wind;

import org.junit.Test;

public class FindSum_Kandane_Algo {
	@Test
	public void example1()
	{
		int[] nums= {-2,-1,-3,4,-1,2,1,-5,4};
		findmaxsum(nums);
	}

	
	@Test
	public void example2()
	{
		int[] nums= {-2,-1,-3,-4};
		findmaxsum_negative(nums);
	}
	

	@Test
	public void example3()
	{
		int[] nums= {-3,-4,-2,-9};
		findmaxsum_negative(nums);
	}
	private void findmaxsum(int[] nums) {
		
		
		// TODO Auto-generated method stub
		
		int sum=0,max=0,curmax=0;
		for(int i=0;i<nums.length;i++)
		{
			curmax+=nums[i];
			if(curmax < 0) curmax=0;
			//else curmax=nums[i];
			max=Math.max(curmax,max);
		}
		System.out.println(max);
	}
	
private void findmaxsum_negative(int[] nums) {
		
		
		// TODO Auto-generated method stub
		
		int sum=0,max=Integer.MIN_VALUE,curmax=0;
		for(int i=0;i<nums.length;i++)
		{
			curmax+=nums[i];
			if(curmax < 0) curmax=nums[i];
		
				max=Math.max(curmax,max);
		}
		System.out.println(max);
	}

}
