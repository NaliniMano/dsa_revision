package com.test.prob0703;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Chrome_Download {
	
	@Test
	public void doVerifyDownloadTitle()
	{
		        WebDriver driver = new ChromeDriver();
                        driver.get("chrome://downloads");

       
   /**     WebElement shadowHost = driver.findElement(By.cssSelector("downloads-manager"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);
    
        WebElement shadowhead = shadowRoot.findElement(By.cssSelector("downloads-toolbar"));
  
***/
  /****
        WebElement shadowElement = shadowhead.findElement(By.cssSelector("cr-toolbar.toolbar"));
     
        WebElement h1 = shadowElement.findElement(By.cssSelector("h1"));
        /      Assert.assertEquals("Downloads", h1.getText());
        ***/
                        

                    	JavascriptExecutor js= (JavascriptExecutor)driver;
                    	WebElement ele= (WebElement)js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#leftSpacer > h1\")");
                    	System.out.println(ele.getText());
                    	Assert.assertEquals("Downloads", ele.getText());

 
	}

}
