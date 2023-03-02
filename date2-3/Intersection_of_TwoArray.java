package fasttrack_prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class Intersection_of_TwoArray {
	
	/** Intersection of two array
	  
	  int[] nums1={1,2,2,1};
	  int[] num2={2,2}
	  
	  output={2}
	  
	  int[] nums1={1,3,5,7};
	  int[] num2={2,4,6}
	  
	  output={}
	  
	   int[] nums1={5,5,5,7};
	  int[] num2={3,4,5}
	  output={5}
	  **/
	   @Test
	  public void example1()
	   {
	    int[] nums1={5,5,5,7};
	    int[] nums2={3,4,5};
		findInterSection(nums1,nums2);
	   }
	   /****
	   
	   1. iterate the element in nums1 and store in hashset
	   2. iterate the element  and check if their s entry in  hashset
	       if exists add to list
	   3. return the list
	   
	   ****/
	   
	   public void findInterSection(int[] nums1,int[] nums2)
	   {
	        HashSet<Integer> hs =new HashSet();
	        List<Integer> li = new ArrayList();
	        
	        for(int i: nums1)
	        {
	            hs.add(i);
	        }
	        for(int i=0;i<nums2.length;i++)
	        {
	            if(hs.contains(nums2[i]) && !li.contains(nums2[i]))
	            {
	                li.add(nums2[i]);
	            }
	        }
	       int[] output =new int[li.size()];  
	        
	        for(int j=0;j<li.size();j++)
	        {
	            output[j]=li.get(j);
	        }
	        System.out.println(Arrays.toString(output));
	      //  return output;
	   }


}
