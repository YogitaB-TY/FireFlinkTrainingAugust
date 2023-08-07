package frameworkTraining;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends Base_Test {
	
	@Test
	public void registerTest() {
		 
		  driver.findElement(By.className("ico-register")).click();
		  driver.findElement(By.xpath("//input[@value='M']")).click();
		  driver.findElement(By.id("FirstName")).sendKeys("Hello");
		  driver.findElement(By.id("LastName")).sendKeys("Hi");
		  driver.findElement(By.id("Email")).sendKeys("Hello@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("Password@123");
		  driver.findElement(By.id("ConfirmPassword")).sendKeys("Password@123");
		  driver.findElement(By.id("register-button")).click(); 
		 
	}

}
