package com.test.day1;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SalesForce_Assignment {
	@Test
	public void test_case_01() throws InterruptedException
	{
String lastName = "KKKK";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().deleteAllCookies();
		//Step1
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step2

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("laksvijay07@gmail.com");
		
		//Step3

		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Chennai@1992");
		
		//Step4
		
		WebElement loginBtn = driver.findElement(By.id("Login"));
		loginBtn.click();
		
		//step 6
		
		WebElement viewProfile = driver.findElement(By.xpath("//span[@data-aura-class = 'forceSocialPhoto']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(viewProfile));
		
		Actions action = new Actions(driver);
		action.moveToElement(viewProfile).build().perform();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'View profile']")).isDisplayed(), "View Profile is not displayed.");
		
			
		//step 7 - Click on plus icon (+) and Click New Lead

		driver.findElement(By.xpath("//a[contains(@class, 'globalCreateTrigger')]")).click();
		
		driver.findElement(By.xpath("//a[@title = 'New Lead']")).click();
		
		//8. Select appropriate Salutation and enter all the mandatory fields and click Save 

		
		driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys(lastName);
		driver.findElement(By.xpath("//span[text() = 'Company']/following::input")).sendKeys("XYZ");
		driver.findElement(By.xpath("(//span[text() = 'Save']/parent::button)[last()]")).click();
		
		// step 9. Verify the message displayed that "Lead <name> was created"

		
		String attribute = driver.findElement(By.xpath("//a[@class = 'forceActionLink']")).getAttribute("title");
		System.err.println(attribute);	
		Assert.assertTrue(attribute.trim().equals(lastName), "Toast Message  contains the Last Name.");
			 
		
		// Step -10. Click on the App launcher menu and click on View All
		driver.findElement(By.xpath("//span[text() = 'App Launcher']/preceding-sibling::div")).click();
		
		// step 11 -Click on Sales Link 

		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text() = 'Sales']")).click();
		
		
		//12. Verify Sales tab is displayed and get the open USD value (just the number alone)
		WebElement salesTitle = driver.findElement(By.xpath("//span[@title = 'Sales']"));
		
		wait.until(ExpectedConditions.visibilityOf(salesTitle));
		
		String amount = driver.findElement(By.xpath("(//span[contains(text(), 'Open')])[2]/following-sibling::lightning-formatted-text")).getText();
		
		
		String replaceAll = amount.replaceAll("₹", "");
		System.out.println(replaceAll);
		
		
		//13. Clicks on the leads Tab
		WebElement leadBtn = driver.findElement(By.xpath("//span[text() = 'Leads']"));
		
		JavascriptExecutor js = driver;
		//js.executeScript("arguments[0].click()", leadBtn);
		js.executeScript("arguments[0].click();", leadBtn);
		
		//14. Sort by Name column and confirm the displayed names are sorted correctly

		driver.findElement(By.xpath("//span[@title = 'Name' and text() = 'Name']")).click();
		
		WebElement searchName = driver.findElement(By.xpath("//input[@placeholder = 'Search this list...']"));
		searchName.sendKeys("lastName");
		searchName.click();
		

		WebElement tableRow = driver.findElement(By.xpath("//table//tbody/tr[1]"));
		wait.until(ExpectedConditions.visibilityOf(tableRow));
		
		driver.findElement(By.xpath("//table//tbody/tr[1]/td[8]")).click();
		
		driver.findElement(By.xpath("//table//tbody/tr[1]/td[8]/span/span[2]")).click();
		


		
	}

}
