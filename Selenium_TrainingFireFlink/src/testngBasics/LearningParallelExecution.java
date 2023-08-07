package testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningParallelExecution {

	@Test(threadPoolSize = 3,invocationCount = 4)
	public void loginTestCase() {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.className("ico-login")).click();
		  driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("Password@123");
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  
		  if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
		  System.out.println("PASS: User is logged in"); 
		  } else {
			  
		  System.out.println("FAIL: User is not logged in"); }
		 
		driver.quit();
	}

}
