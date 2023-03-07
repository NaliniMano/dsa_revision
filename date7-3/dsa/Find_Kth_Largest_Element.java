package daily_dsa_prob;

import java.util.PriorityQueue;

import org.junit.Test;

public class Find_Kth_Largest_Element {
	
	
/*****
int nums={3,2,1,5,6} k=3  o/p -> 3

nums={3,2,3,1,2,4,5,5,6} k=4  o/p -> 4
******/
@Test
public void example1()
{
int[] nums={3,2,1,5,6};
int k=3;
findKLargetElement(nums,k);
}

/***
Pseudocode:
1. iterate the element and store in priority queue
2. if the size of the priority queue less than target k
    poll the element
3.  repeat the step2
4. return the poll element from queue



***/

public void findKLargetElement(int[] nums,int k)
{
 PriorityQueue<Integer> pq =new PriorityQueue();
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
            if(pq.size()> k)
            {
                pq.poll();
            }
        }
		
		System.out.println(pq.poll());
     //return pq.poll();
}

	

}
