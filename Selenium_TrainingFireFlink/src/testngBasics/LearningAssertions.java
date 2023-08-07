package testngBasics;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testngBasics.
		ListenerImplementation.class)

public class LearningAssertions extends Base_Test {

	@Test
	public void testCase() {

		SoftAssert ast = new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Facebook");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Passwd@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		  Assert.assertTrue(true); Assert.assertEquals("Hello", "Hey");
		  Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed(
		  ));
		  
		 
		ast.assertAll();
		/*
		 * try { driver.findElement(By.className("ico-logout")).click(); }catch
		 * (Exception e) { System.out.println("FAIL: User is not logged in"); }
		 */
	}

}
