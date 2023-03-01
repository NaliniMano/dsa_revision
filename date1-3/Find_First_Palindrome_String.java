package fasttrack_prob;
import org.junit.Test;

public class Find_First_Palindrome_String {
	
	/***
	 words ={"cac","bad","qaq"} o/p -->cac
	  words ={"abc","qmn","lol"} o/p -->lol
	   words ={"a","b","c"} o/p -->a
	    words ={"def","baghid"} o/p -->""
	***/	
	   @Test
		public void example1()
		 {
		  String[] words={"cac","bad","qaq"};
		  findPalindrome(words);
		 }
		
		/***
		pseudocode:
		1. iterate the each string from the array
		2. reverse the string and check if its matched original
		   if match found return the string
		   when no match return empty string
		Time complexity O[n * m]
		
		
		***/

	  public String findPalindrome(String[] words)
	  {
	    for(String s:words )
		 {
		   if(isPalindrome(s))
		    {
			return s;
			}
		 }
		 return " ";
	}  
		
		public boolean isPalindrome(String s)
		 {
		   if(s.length() == 1) return true;
		   int left=0,right=s.length()-1;
		   while(left<right)
		    {
			  if(s.charAt(left)!= s.charAt(right))
			   {
			    return false;
			   }
			   left++;
			   right--;
			}
			return true;
		 }


}
