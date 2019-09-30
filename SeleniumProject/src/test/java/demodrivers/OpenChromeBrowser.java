package demodrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();  //open chrome browser
		driver.manage().window().maximize();  //maximizes the window
		driver.get("https://mvnrepository.com/"); // get method to open website
		Thread.sleep(3000);
		driver.close(); // closes the browser
	}

}
