package fasttrack_prob;

import org.junit.Test;

public class Reverse_String_Word {
	
	/**
	 * 
	 * s = "Let's take LeetCode contest"   Output: "s'teL ekat edoCteeL tsetnoc"
	
	s= "h D k"  output : "h D k"
	
	s="Op=cat qPta"  ouput : "tac=pO atPq"
	 
	s="a"          output: a
	 */
	@Test
public void example1()
	{
	String s ="Let's take LeetCode contest";
	doReverseString(s);
	}
/**pseudocode
1. split the string with space
2. iterate the each string  
3.  reverse string and append to ouput string

Time complexity : o[n*m]



***/
   public void doReverseString(String s)
    {
	String[] str =s.split(" ");
	
	 String[] input_str = s.split(" ");
       StringBuffer sb =new StringBuffer();
        String output="";
        for(String st : input_str)
        {
            sb.append(st);
            sb.reverse();
        
            output+=sb.toString()+" ";
                sb.delete(0, sb.length());

        }
        
        System.out.println(output.trim());
      //  return output.trim();
		
		

	}
 
}
