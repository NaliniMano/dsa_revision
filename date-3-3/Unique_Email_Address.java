package demos;

import java.util.HashSet;

import org.junit.Test;

public class Unique_Email_Address {
	
	
	/*** Testdata
	   
	   ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
	   
	   output :2
	   
	   
	    ["a+alex@leetcode.com","bob.cathy@leetcode.com","test.email.david@lee.tcode.com"] output=2
	
		****/
	@Test
	public void example1()
	{
		String[] s= {"a+alex@leetcode.com","bob.cathy@leetcode.com","test.email.david@lee.tcode.com"};
		findValidEmail(s);
	}
	
	/**
		 * 1) split the string with delimiter "@" store in two variable local and domain
		 * 2)  check if local contains +  and ignore character after that
		 * 3)  if local contains . replace with empty character
		 * 4)  finally append the local and domain name and store in Set
		 * 5) return the size of the set
		 * 
		 * 
		 * 
		 * @param emails
		 */

		private int findValidEmail(String[] emails) {
			// TODO Auto-generated method stub
			HashSet<String> hs=new HashSet();
			for(int i=0;i<emails.length;i++)
			{
				String[] em=emails[i].split("@");
				String domain=em[1];
				String local =em[0];
				local=removechars(local);
				hs.add(local+"@"+domain);
			
			}
			return hs.size();
				
		}
		
		public String removechars(String s)
		{ 
			if(s.contains("+"))
			{
				int k =s.indexOf("+");
				s=s.substring(0,k);
			}
			
			s=s.replace(".","");
			return s;
		}
		

}
