package com.test.readexcel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.trace.IdGenerator;

public class ReadTestData {
	
	HashSet<String> li2 =new HashSet();
	List<List<Object>> li =new ArrayList();
    List<Object> li_inside=new ArrayList();
	@Test
	public void readData() throws IOException
	{
		File file = new File("E:\\project-sdet\\SelLearning\\src\\test\\resources\\Movie_TestData.xlsx");
		
		FileInputStream fis =new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		
	   int count=0;
		
		 // Iterate through each rows one by one
        Iterator<Row> rowIterator = sheet.iterator();
		
		while(rowIterator.hasNext())
		{
			Row row =rowIterator.next();
			count++;
			if(count>1)
			{
			 Iterator<Cell> cellIterator = row.cellIterator();
		//	 System.out.println(row.toString());
			 while(cellIterator.hasNext())
			 {
				 
				
					 Cell cell = cellIterator.next();
					 int colindex=cell.getColumnIndex();
					if(colindex==1)
					{
					 String get_name=cell.getStringCellValue();
					  li2.add(get_name);
					}
					 
				
			 }
			// System.out.println("*****"); 
			 
			}
			
		//	System.out.println(li2);
		}
		
		System.out.println(li2);
		
		
		String fileName = "E:\\project-sdet\\SelLearning\\src\\test\\resources\\example.txt"; // replace with the name of your text file
	     //   String searchText = "aa"; // replace with the string you want to search for
	        
	        for(String searchText : li2)
	        {
	        	System.out.println(searchText);
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));
	            String line;
	            int lineNum = 1;
	            boolean found = false;

	            while ((line = reader.readLine()) != null) {
	                if (line.contains(searchText)) {
	                    found = true;
	                    System.out.println("Found \"" + searchText + "\" on line " + lineNum + ": " + line);
	                    li_inside.add(searchText);
	                    li_inside.add(lineNum);
	                    li_inside.add(line);
	                }
	                lineNum++;
	                
	            }

	            reader.close();

	            if (!found) {
	                System.out.println("\"" + searchText + "\" not found in " + fileName);
	                li_inside.add("Not Found");
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file " + fileName);
	            e.printStackTrace();
	        }
	        li.add(li_inside);
	        }
	        
	        System.out.println(li);
	        excel_writer();
	}
	
	
	
	//@Test
	public void doParser()
	{
		
		
		
		
		String fileName = "E:\\project-sdet\\SelLearning\\src\\test\\resources\\example.txt"; // replace with the name of your text file
     //   String searchText = "aa"; // replace with the string you want to search for
        
        for(String searchText : li2)
        {
        	System.out.println(searchText);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNum = 1;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchText)) {
                    found = true;
                    System.out.println("Found \"" + searchText + "\" on line " + lineNum + ": " + line);
                }
                lineNum++;
            }

            reader.close();

            if (!found) {
                System.out.println("\"" + searchText + "\" not found in " + fileName);
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName);
            e.printStackTrace();
        }
        }
	}
	
	public void excel_writer()
	{
		 Random random = new Random();

	        // generate a random integer between 0 and 99
	        int randomNumber = random.nextInt(100);
	    	String fileName = "report"+randomNumber;
	    	//String filename=""
	    	
	    	 try {
	             XSSFWorkbook workbook = new XSSFWorkbook();
	             Sheet sheet = workbook.createSheet("Sheet1");

	             // create some data to write to the sheet
	             Object[][] data = {
	                 {"John", "Doe", 25},
	                 {"Jane", "Smith", 30},
	                 {"Bob", "Jones", 40}
	             };

	             // loop through the data and write each row to the sheet
	             int rowNum = 0;
	             for (List<Object> rowData : li) {
	                 Row row = sheet.createRow(rowNum++);
	                 int colNum = 0;
	                 for (Object field : rowData) {
	                     Cell cell = row.createCell(colNum++);
	                     if (field instanceof String) {
	                         cell.setCellValue((String) field);
	                     } else if (field instanceof Integer) {
	                         cell.setCellValue((Integer) field);
	                     }
	                 }
	             }

	             // write the workbook to a file
	             FileOutputStream outputStream = new FileOutputStream(fileName);
	             workbook.write(outputStream);
	             workbook.close();

	             System.out.println("Data written to " + fileName);
	         } catch (IOException e) {
	             System.out.println("Error writing to " + fileName);
	             e.printStackTrace();
	         }
		
	}

}
