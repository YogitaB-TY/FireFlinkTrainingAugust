package testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test {
	
	public static WebDriver driver;
	
	//@Parameters("URL")
	@BeforeMethod
	public void setupBrowser() {
		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
