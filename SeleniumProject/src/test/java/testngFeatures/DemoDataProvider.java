package testngFeatures;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DemoDataProvider {
  @Test(dataProvider = "credentials")
  public void login(String userName, String Password) {
	  System.out.println("Username is: "+userName);
	  System.out.println("Password is: "+Password);
  }

  @DataProvider(name="credentials")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "aakash", "1234" },
      new Object[] { "akshay", "5678" },
      new Object[] { "somesh", "7894" },
    };
  }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  