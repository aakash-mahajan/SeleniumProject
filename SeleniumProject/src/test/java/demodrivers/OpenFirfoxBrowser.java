package demodrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirfoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "resources\\geckodriver.exe");
		driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		Thread.sleep(3000);
		driver.close();
	}
}
