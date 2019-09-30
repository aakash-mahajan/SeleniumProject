package demoWebDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoRegistration {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void f() throws InterruptedException {
		driver.findElement(By.partialLinkText("GISTER")).click();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aakash");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mahajan");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7898476761");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("akashmahajan340@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("akhil pg room no 311");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("411041");
		Select obj = new Select(driver.findElement(By.name("country")));
		obj.selectByIndex(4);
		Thread.sleep(3000);
		obj.selectByValue("8");
		Thread.sleep(3000);
		obj.selectByVisibleText("INDIA");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akshaymahajan605@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='register']")).click();;
	}
	@AfterTest
	public void afterTest() {
	}

}
