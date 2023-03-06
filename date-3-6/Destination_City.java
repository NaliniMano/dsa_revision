package prob_0603;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class Destination_City {
	
	/***
	 * test data
	 * 
	 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]] output->SaoPaulo
        [["B","C"],["D","B"],["C","A"]]  output -> A
	 * 
	 * 
	 */
	@Test
	public void example1()
	{
		List<List<String>> li =new ArrayList();
		
		List<String> li1 =new ArrayList();
		
		li1.add("B");
		li1.add("C");
		li.add(li1);
		

		li1.add("D");
		li1.add("B");
		li.add(li1);
		

		li1.add("C");
		li1.add("A");
		li.add(li1);
		
		findDestination(li);
	}
	/***
	 * 1. iterate the path list
	 * 2.  store in map
	 * 3.  iterate the map
	 * 4.  compare the values  with keys
	 *     if no match found return the destination
	 * 
	 * 
	 * 
	 * @param li
	 */

	private String findDestination(List<List<String>> paths) {
		// TODO Auto-generated method stub
HashMap<String,String> hmap = new HashMap();
        
        for(List<String> k: paths )
        {
            hmap.put(k.get(0), k.get(1));
        }
        
        System.out.println(hmap);
        
        for(String s:hmap.values())
        {
            if(!hmap.containsKey(s)) return s;
        }
      return ""; 
	}

}
