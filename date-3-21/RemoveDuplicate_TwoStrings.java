import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class RemoveDuplicate_TwoStrings {
	
	//@Test
	public void example1()
	{
		String s1="abcd";
		String s2 ="befgh";
		removeDuplicates(s1,s2);
	}
	
	@Test
	public void example2()
	{
		String s1="automation";
		String s2 ="selenium";
		removeDuplicates(s1,s2);
	}
	
	@Test
	public void example3()
	{
		String s1="ab";
		String s2 ="ab";
		removeDuplicates(s1,s2);
	}

	private String removeDuplicates(String s1, String s2) {
		// TODO Auto-generated method stub
	   List<Character> li = new ArrayList();
	   HashMap<Character,Integer> hmap =new HashMap();
	   
	   StringBuffer sb = new StringBuffer();
	   for(char ch1 : s1.toCharArray())
	   {
		hmap.put(ch1, hmap.getOrDefault(ch1, 0)+1);
	   }
		
	   for(char ch2 : s2.toCharArray())
	   {
		hmap.put(ch2, hmap.getOrDefault(ch2, 0)+1);
	   }
	   System.out.println(hmap);
	   for(Map.Entry<Character,Integer> entry : hmap.entrySet())
	   {
		   if(entry.getValue()==1)
		   {
			   sb.append(entry.getKey());
		   }
		   
	   }
		   System.out.println(sb.toString());
		return sb.toString();
		
	}
	
}