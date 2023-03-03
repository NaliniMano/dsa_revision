package demos;

import java.util.Arrays;
import java.util.HashSet;

public class Fair_Candy {
	
/****
	
	aliceSizes = [1,1], bobSizes = [2,2]  outut=[1,2]
	
    aliceSizes = [5,1], bobSizes = [2,3,5]  outut=[1,2]
	
	aliceSizes = [2], bobSizes = [1,3]

	***/
	
	
	public void example1()
	{
	 int[] aliceSizes={1,1}, bobSize={2,2};
	 findFairCanday(aliceSizes,bobSize);
	}
	
	/**
         1. ierate alicesize  and find the alicetotal (3)
         2. Iterate bobsize and find the bobtotal(5)
         3. diff =alicetotal + bobtotal/2 (4)
         4. use outer and inner loop 
         
         
         
         ***/
        
		
	public int[] findFairCanday(int[] aliceSize,int[] bobSize)
     { 	
        HashSet<Integer> hset =new HashSet();
        int[] output=new int[2];
        int alicetot=0,bobtot=0;
        for(int k=0;k<aliceSize.length;k++)
        {
            alicetot+= aliceSize[k];
        }
        
        for(int k=0;k<bobSize.length;k++)
        {bobtot+=bobSize[k];
         hset.add(bobSize[k]);
            
        }
        int mid=(alicetot+bobtot)/2;
       // System.out.println(alicetot+ " " + bobtot + " "+ mid);
        for(int j=0;j<aliceSize.length;j++)
        {
            int rem = mid - (alicetot - aliceSize[j]);
            if(hset.contains(rem))
            {
                output[0]=aliceSize[j];
                output[1]=rem;
                return output;
            }
        }
        
        System.out.println(Arrays.toString(output));
       return output;
	   }
	
	

}
