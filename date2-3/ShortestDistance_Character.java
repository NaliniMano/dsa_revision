package fasttrack_prob;

import java.util.Arrays;

import org.junit.Test;

public class ShortestDistance_Character {
	
	/***
	 * 821. Shortest Distance to a Character

	 * 
	 * s = "loveleetcode", c = "e" Output: [3,2,1,0,1,0,0,1,2,2,1,0]

	 */
	@Test
	public void example1()
	{
		String s ="loveleetcode";
		char c='e';
		findShortestDistanc(s,c);
	}

	private void findShortestDistanc(String s, char c) {
		// TODO Auto-generated method stub
		int[] res1= new int[s.length()];
        int[] res2= new int[s.length()];
         
        for(int i=0;i<s.length();i++)
        {
             res1[i]=s.charAt(i)-c;
        }

        for(int i=s.length()-1;i>=0; i++)
        {
             res2[i]=s.charAt(i)-c;
        }

        int[] result3 = new int[res2.length];
        for(int i=0;i<res2.length;i++)
        {
          result3[i]=Math.min(res2[i],res1[i]);
       
        }
       System.out.println(Arrays.toString(result3));
     // result3;
	}

}
