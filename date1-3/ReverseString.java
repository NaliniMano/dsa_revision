package fasttrack_prob;

import java.util.Arrays;

import org.junit.Test;

public class ReverseString {
	

	/****
	
	s = ["h","e","l","l","o"]  output={"o","l","l","e","h"}
	
	
	
	****/
	
	@Test
	public void example1()
	{
	 char[] s={'h','e','l','l','o'};
	 doReverseString(s);
	}
	
	/***
	Declare two pointer left=0,right=length of the string
	swap left and right charater of the string
	retun the output

	*******/
	
	public void doReverseString(char[] s)
	{
	  int left=0,right=s.length-1;
	  while(left <right)
	  {
	  char temp =s[left];
	  s[left]=s[right];
	  s[right]=temp;
	  left++;
	  right--;
	  }
	  
	  System.out.println(Arrays.toString(s));
	}

}
