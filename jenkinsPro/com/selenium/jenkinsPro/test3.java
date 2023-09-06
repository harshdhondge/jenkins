package com.selenium.jenkinsPro;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
public class test3 {
  @Test
  public void f() {
	  		 	//WebDriverManager.chromedriver().setup();
	  			WebDriver driver = new ChromeDriver();
	  			driver.get("https://bing.com");
	  			driver.manage().window().maximize();
	  		    WebElement p=driver.findElement(By.name("q"));
	  		    p.sendKeys("selenium", Keys.ENTER);
	  		    String expectedTitle = "Bing";
	  	        String actualTitle = driver.getTitle();
	  	        Assert.assertEquals(actualTitle, expectedTitle);
	  }
	  }

  }
}
