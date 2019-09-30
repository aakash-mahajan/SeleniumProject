package demoWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoSwitchWindow {
	WebDriver driver;
	@Test
	public void f() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Actions act =  new Actions(driver);
		WebElement aboutUS = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));

		WebElement ourOffices= driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));

		WebElement chennai = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));
		act.moveToElement(aboutUS).pause(3000).click().perform();
		act.moveToElement(ourOffices).pause(3000).click().perform();
		
		
		
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
