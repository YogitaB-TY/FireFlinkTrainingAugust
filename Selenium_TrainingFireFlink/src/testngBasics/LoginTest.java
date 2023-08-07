package testngBasics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Base_Test{
	
	@Test
	public void loginTestCase() {
		
		  driver.findElement(By.className("ico-login")).click();
		  driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("Password@123");
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  
		  if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
		  System.out.println("PASS: User is logged in"); 
		  } else {
			  
		  System.out.println("FAIL: User is not logged in"); }
		 
		
	}

}
