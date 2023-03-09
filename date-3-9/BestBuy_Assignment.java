package com.test.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BestBuy_Assignment {
	
	@Test
	public void test_bestbuy() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();
     
        // Navigate to the Flipkart website
        driver.get("https://www.bestbuy.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //Select the country as the United States
        driver.findElement(By.xpath("(//*[@class='us-link'])[1]")).click();
        
       // Alert alert =driver.switchTo().alert();
        //alert.dismiss();
        WebElement signin_popup= driver.findElement(By.xpath("//button[@type='button']"));
      
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(signin_popup));
        
		
		
      
        
        //Enter the search field as ""Laptops""
        driver.findElement(By.id("gh-search-input")).sendKeys("laptop" +Keys.ENTER);
        	
        
        
	}

}
