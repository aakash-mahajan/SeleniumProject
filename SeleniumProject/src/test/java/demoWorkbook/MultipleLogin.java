package demoWorkbook;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MultipleLogin {
	WebDriver driver;
	@Test
	public void f() throws IOException, InterruptedException {
		FileInputStream ins = new FileInputStream(new File("C:\\Users\\pdc3a-training.pdc3a\\Desktop\\login.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(ins);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int count = sheet.getLastRowNum();
		
		for(int i=0;i<count;i++)
		{	
			driver.get("http://newtours.demoaut.com/");
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			Thread.sleep(5000);
		}

	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
	
	//@DataProvider
	//public Object[][] dp() {
	//	return new Object[][] {
	//		new Object[] { 1, "a" },
	//		new Object[] { 2, "b" },
	//	};
	//}
}
