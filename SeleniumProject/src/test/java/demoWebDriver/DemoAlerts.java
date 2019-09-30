package demoWebDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class DemoAlerts {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  driver.findElement(By.xpath("//a[contains(.,'Alert with Textbox')]")).click();
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@onclick,'promptbox()')]"))).click();
	  driver.findElement(By.xpath("//button[contains(@onclick,'promptbox()')]")).click();
	  Alert alert = driver.switchTo().alert();
	  System.out.println(alert.getText());
	  Thread.sleep(3000);
	  alert.sendKeys("aakash");
	  Thread.sleep(3000);
	  alert.accept();
	  
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
