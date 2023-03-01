package fasttrack_prob;

import org.junit.Test;

public class Reverse_prefix_of_word {
	
	/**
	 * 
	 * TestData
	word = "abcdefd" ch="d"  output ="dcbaefd"
	
	word ="acceefh" ch="e"   output="accefh"
	
	words ="abcdf" ch="k"    output="abcdf"
	
	 */
	@Test
	public void example1()
	 {
	   String word= "abcdefd";
	   String ch="d";
	   doReverseprefix(word,ch);
	 }
	 
	 /**
	 1. declare string start ,end
	 2.  start string -> store character from  word (0 to index of charater of ch)
	     end String -> store character from word(index of charater ch  and length of word)
	 3. revers the start string and append to end string
	 4. return output string
	 
	 **/
	 
	 public void doReverseprefix(String word, String ch)
	 {
	 String start=word.substring(0,word.indexOf(ch)+1);
	 String end=word.substring(word.indexOf(ch)+1,word.length());
	  StringBuffer bf =new StringBuffer(start);
	  bf.reverse();
	  bf.append(end);
	  System.out.println(bf.toString());
	  System.out.println(bf.toString());
	 }

}
