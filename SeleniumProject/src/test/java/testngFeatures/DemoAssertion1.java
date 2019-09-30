package testngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion1 {
	@Test
	public void test1() {
		System.out.println("test1 started");
		Assert.assertEquals("Hello", "Hi","error msg");
		System.out.println("test1 completed");
	}
	@Test
	public void test2() {
		System.out.println("test2 started");
		Assert.assertNotEquals("Hello", "Hi");
		System.out.println("test2 completed");
	}
	@Test
	public void test3() {
		System.out.println("test3 started");
		Assert.assertTrue("selenium".contains("len"), "Not contain");
		System.out.println("test3 completed");
	}
	@Test
	public void test4() {
		System.out.println("test4 started");
		Assert.assertFalse(20>18, "18 less than 20");
		System.out.println("test4 completed");
	}
	@Test
	public void test5() {
		Object test=null;
		System.out.println("test5 started");
		Assert.assertNull(test, "Its null");
		System.out.println("test5 completed");
	}
	@Test
	public void test6() {
		System.out.println("test6 started");
		Assert.fail("Intensionally fail test");
		System.out.println("test6 completed");
	}
}
