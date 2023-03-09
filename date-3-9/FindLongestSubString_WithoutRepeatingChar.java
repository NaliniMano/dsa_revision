package daily_dsa_prob;

import org.junit.Test;

public class FindLongestSubString_WithoutRepeatingChar {
	
	@Test
	public void example1()
	{
		 String input="abcabcbb";
		 findLongestSubString(input);
	}

	private void findLongestSubString(String s) {
		// TODO Auto-generated method stub
		
	    int left=0,right=0,max=0;
        int[] ascii_array = new int[256];
        while(right < s.length())
        {
            ascii_array[s.charAt(right)]++;
            while(ascii_array[s.charAt(right)] > 1)
            {
                ascii_array[s.charAt(left)]--;
                left++;
            }
            
            max=Math.max(max,right-left+1);
            right++;
                
        }
        System.out.println(max);
		
	}

}
