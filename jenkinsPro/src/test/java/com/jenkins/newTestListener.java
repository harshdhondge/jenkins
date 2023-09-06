package com.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newTestListener {
  WebDriver driver;
	@Test
  
  public void f() {
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "selenium - Google Search");
		
  }
	@BeforeMethod
	public void bm() {
		driver= new ChromeDriver();
		driver.get("https://google.com");
	}
	@AfterMethod
	public void am() {
		driver.quit();
	}
}
