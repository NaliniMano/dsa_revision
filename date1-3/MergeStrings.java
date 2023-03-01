package fasttrack_prob;

import org.junit.Test;

public class MergeStrings {
	
	/***********************

	Merge two String
	word1 ="abcd" word2 ="efgh" output => aebfcgdh

	word1="abcd" word2="ef" output -> aebfcd

	word1="" words2="ab" output -> ab

	word1="xy" word2="mnop"  ouptu -> xmynop

***/
	@Test
	public void example1()
	 {
	 String word1="abcd",word2="efgh" ;
	 doMergeString(word1,word2);
	}
	/**
	pseduocode
	1. declare  two pointer left=0,right=0
	2. iterate the left < length of word1 and right < length of word2
	3. check if left less than word length add to ouput string
	    check if right less than word length add to output sting
		return output string

	**/

	public void doMergeString(String word1,String word2)
	 {
	         int left=0,right=0;
	        StringBuffer sb =new StringBuffer();
	        while(left < word1.length() || right < word2.length())
	        {
	            if(left < word1.length())
	                sb.append(word1.charAt(left));
	            if(right < word2.length())
	                sb.append(word2.charAt(right));
	            left++;
	            right++;
	                
	        }
	        System.out.println(sb.toString());

	 }
	 


}
