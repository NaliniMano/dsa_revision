package fasttrack_prob;
import java.util.Arrays;

import org.junit.Test;

public class Fliping_ImageI {
	
	/***Test data
	int[][] image={{1,0,1},{1,1,1},{0,0,0} // output {{0,1,0},{0,0,0},{1,1,1}}

	int[][] image={{1,1,0,0},{1,0,0,1},{0,1,1,1} // output {{1,1,0,0},{0,1,1,0},{0,0,0}}
***/
	
	@Test
	public void example1()
	 {
	 int[][] image={{1,0,1},{1,1,1},{0,0,0}};
	 flipimage(image);
	 }
	
	/***
	i:
	1.swap the each rows
	2.iterate the image array and change 1 to 0 and 0 to 1 

	time complexity o[n*m]
	***/


	private void flipimage(int[][] image) {
		// TODO Auto-generated method stub
		for(int i=0;i<image.length;i++)
	    {
		  int left =0 ,right=image[i].length-1;

		  while(left < right)
		  {
		    int temp =image[i][left];
			image[i][left]=image[i][right];
	          image[i][right]=temp;
					left++;
			right--;
		  }
		}

	        for(int i=0;i<image.length;i++)
	        {
	            for(int j=0;j<image[i].length;j++)
	            {
	                if(image[i][j]==1) image[i][j]=0;
	                else image[i][j]=1;
	            }
	        }
	        
	        System.out.println(Arrays.deepToString(image));
	  //    return image;  
	   
	}
	

}
