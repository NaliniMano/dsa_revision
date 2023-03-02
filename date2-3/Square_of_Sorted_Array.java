package fasttrack_prob;

import java.util.Arrays;

import org.junit.Test;

public class Square_of_Sorted_Array {

/**	  977. Squares of a Sorted Array
	   
	   Testdata
	   -4,-1,0,3,10   output -> 0,1,9,16,100
	   
	   1,-2           output -> 1,4
	***/   
	   @Test
	   public void example1()
	    {
		 int[] nums1={-4,-1,0,3,10};
		 doSort(nums1);
		}
		
		/**Psudocode*
		1. declare output array
		2.  the elements from the given array
		3. left->0 ,right->length of array
		4. loop thorugh until left less than equal right
		5 . if left is less than right 
		4. ouput  -> add the right
		    else
			store the output left
		***/
		
		public void doSort(int[] nums1)
		
		{
		int left=0,right=nums1.length-1;
		int[] output =new int[nums1.length];
		int index=right;
		while(left <=right)
		{
		if(Math.abs(nums1[left]) < Math.abs(nums1[right]))
		 {
		 output[index--] = nums1[right]*nums1[right];
		 	 right--;
	
		 }else
		 	 output[index--] = nums1[left]*nums1[left];
	     left++;
		}
		System.out.println(Arrays.toString(output));
	//	return output;
		}
		
	
	
	

}
