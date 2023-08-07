package testngBasics;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataDrivenTesting extends Base_Test {

	@Test(dataProvider = "loginData")
	public void loginTest(String userName, String password) {
		
		driver.findElement(By.className("ico-login")).click();
		  driver.findElement(By.id("Email")).sendKeys(userName);
		  driver.findElement(By.id("Password")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  try {
		  driver.findElement(By.className("ico-logout")).click();
		  }catch (Exception e) {
			System.out.println("FAIL: User is not logged in");
		}
			/*
			 * if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
			 * System.out.println("PASS: User is logged in"); } else {
			 * 
			 * System.out.println("FAIL: User is not logged in"); }
			 */
	}
	
	@DataProvider(name = "loginData")
	public String[][] testData() {
		String[][] data= 
		LearningSingleReadExcel
		.readMultipleData("Login");
		
		return data;
	}
}
