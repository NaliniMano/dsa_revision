package demos;

import java.util.HashMap;

public class No_Of_Pairs {
	
/****	No of pairs
	TestData
	nums = [1,2,3,1,1,3]  output - 4  (0,3),(0,4),(2,5),(4,5)
	nums={2,3,8,2,3}    output 2  (0,3),(1,4)
	nums={1,2,3}  output=0
	nums={2,2,2,2}  output= 6 (0,1) (0,2) (0,3) (1,2),(1,3)(2,3)
***/
	public void example1()
	 {
	   int[] nums={1,2,3,1,1,3};
	   findNoOfPairs(nums);
	 }
	/*** 
	 Pseudodcode:
	 
	 Brute force:
	  iterate outer and inner loop 
	   check if element of outerlopp match with inner element  incremnet the count
	   return the count
	 
	 Optimise:
	  declare hashmap
	  iterate the elements of the array
	   if hashmap already hv key incremnet it
	     increment the counter
	   else add entry in hashmap
	   return counter+1
	*****/
	   public void findNoOfPairs(int[] nums)
	    {
		  HashMap<Integer, Integer> hm = new HashMap<>();
	        
	        int count = 0;
	        
	        for(int i:nums)
	        {
	            int getoccurance = hm.getOrDefault(i,0);
	            count+=getoccurance;
	            hm.put(i,getoccurance+1);
	        }
	        
	        System.out.println(count);
	      //  return count;
		}
	   


}
