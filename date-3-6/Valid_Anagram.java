package prob_0603;

import org.junit.Test;

public class Valid_Anagram {
	
/***	testdata
	s="abba"  t= "aabb" o/p t= true
	s="efgh"  t="mnop"  o/p=false
	s="a"	   t=""     0/p false

	s="ab"     t="ababab" o/p false
	****/
	@Test
	public void example1()
	 {
	   String s = "abba", t = "aabb";
	   findAnagram(s,t);
	 }
	 
	 /****
	 pseudocode:
	 1. declare ascii array 
	 2.  store the character into the array
	 3. iterate the string 2  check if the charater existin in ascii array reduce the count
	     if not exist false
		 return true;
	 
	 
	 ***/
	
	public boolean findAnagram(String s,String t )
	{
	 if(s.length() != t.length()) return false;
        int[] ascii_array = new int[26];
        
        for(char c : s.toCharArray())
        {
            ascii_array[c-'a']++;
        }
        
        for(char c: t.toCharArray())
        {
            if(ascii_array[c-'a']==0) return false;
          ascii_array[c-'a']--;
        }
        
        return true;
	}
	


}
