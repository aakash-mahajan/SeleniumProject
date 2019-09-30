package testngFeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ExecutionSequence {
	@Test
	public void f() {
		System.out.println("I'm in @Test annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I'm in @BeforeMethod annotation");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I'm in @AfterMethod annotation");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I'm in @BeforeClass annotation");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I'm in @AfterClass annotation");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I'm in @BeforeTest annotation");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I'm in @AfterTest annotation");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I'm in @BeforeSuite annotation");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I'm in @AfterSuite annotation");
	}

}
