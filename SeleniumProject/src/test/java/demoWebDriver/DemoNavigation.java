package demoWebDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoNavigation {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com/?gws_rd=ssl");
	  
	  driver.navigate().to("https://www.seleniumhq.org/");
	  
	  driver.navigate().back();
	  
	  driver.navigate().forward();
	  
	  driver.navigate().refresh();
	  
	  System.out.println("Page Refreshed");
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
