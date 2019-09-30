package demoWebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchMultipleWindow {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  WebElement about=driver.findElement(By.xpath("//span[contains(.,'AboutUs')]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(about).click().build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Our\n" + 
	  		"												Offices')]"))).click().build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Bangalore')]"))).click().build().perform();
	  Set<String> set=driver.getWindowHandles();
	  for(String string:set) {
		  driver.switchTo().window(string);
	  }
	  driver.switchTo().frame(driver.findElement(By.name("main_page")));
	  String address=driver.findElement(By.tagName("address")).getText();
	  System.out.println(address);
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
		driver.close();
	}
}
