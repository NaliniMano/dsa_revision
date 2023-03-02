package fasttrack_prob;

import org.junit.Test;

public class Remove_Palindromic_Sequence {
	/**1332 Remove Palindromic Subsequences
	TestData:
	s = "ababa"  output -> 1
	s ="baa"   output ->2
	s="b"   output=1
	s="baabb"  output ->2
***/
	
	@Test
	public void example1()
	 {
	   String s="ababa";
	   findPalindrome(s);
	 }
	 
	 /*
	 1. declare left->0 ,right->length of string
	 2. iterate until left less than right-
	 3. if the left not equal right return 2;
	     else return 1
	 **/
	 
	 public int findPalindrome(String s)
	  {
	   if(s.length()==1) return 1;
	   int left=0,right=s.length()-1;
	   while(left < right)
	    {
		  if(s.charAt(left)!=s.charAt(right)) return 2;
		}
		return 1;
	  }

	
	

}
