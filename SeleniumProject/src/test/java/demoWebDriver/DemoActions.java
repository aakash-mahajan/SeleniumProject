package demoWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoActions {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  WebElement search=driver.findElement(By.id("myInput"));
	  Actions act = new Actions(driver);
	  act.keyDown(search, Keys.SHIFT).perform();
	  act.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand Bag')]"))).click().perform();
	  driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
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
