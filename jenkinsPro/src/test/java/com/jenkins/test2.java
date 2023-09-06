package com.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
	public static void main(String[] args) {
		 	WebDriverManager.edgedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://bing.com");
			driver.manage().window().maximize();
		    WebElement p=driver.findElement(By.name("q"));
		    p.sendKeys("selenium");
		    String expectedTitle = "Bing";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
	
}
}
