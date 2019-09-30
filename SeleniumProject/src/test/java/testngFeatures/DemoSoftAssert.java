package testngFeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
  @Test
  public void f() {
	  SoftAssert sa = new SoftAssert();
	  System.out.println("Test - 1 Checking the 1st test");
	  sa.assertEquals(10, 12);
	  System.out.println("Test - 2 Checking the 2nd test");
	  sa.assertTrue("Selenium".contains("basics"), "Error MSG");
	  sa.assertAll();
  }
}
