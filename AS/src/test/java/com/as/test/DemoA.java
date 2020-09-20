package com.as.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver.exe");
	}
   public static WebDriver driver;
   @Test
   public void testBrowser()
   {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.google.com");
   }
   @Test
   public void testSearchBox()
   {
	   driver.findElement(By.name("q")).sendKeys("seleniumhq",Keys.ENTER);
	   Reporter.log("TestCases Works as per the Requirement",true);
   }
}
