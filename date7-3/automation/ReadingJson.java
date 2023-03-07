package com.restapi.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadingJson {
	
	/**
	 * {"skills":["Java","Selenium","RestApi"],
	 * "fname":"Nalini",
	 * "lname":"Mano"}
	 * 
	 * 
	 * @throws IOException
	 * @throws ParseException
	 */
	
	@Test
	public void readJson() throws IOException, ParseException
	{
		JSONParser jp =new JSONParser();
		FileReader fr = new FileReader("NaliniSkills.json");
		       Object parseObject =jp.parse(fr);
		       JSONObject job = (JSONObject) parseObject;
		       System.out.println("Firsname:"+job.get("fname"));
		       System.out.println("Lastname:"+job.get("lname"));
		       
		       JSONArray ja =(JSONArray) job.get("skills");
		       Iterator it =ja.iterator();
		       while(it.hasNext())
		       {
		    	   System.out.println(it.next().toString());
		       }
		       fr.close();
		       
		
	}

}
