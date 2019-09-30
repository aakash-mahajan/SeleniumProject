package demoWebDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoWikipedia {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://en.wikipedia.org/wiki/Main_Page");
	  driver.findElement(By.linkText("History")).click();
	  Assert.assertEquals(driver.getTitle(), "Portal:History - Wikipedia");
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getPageSource());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
