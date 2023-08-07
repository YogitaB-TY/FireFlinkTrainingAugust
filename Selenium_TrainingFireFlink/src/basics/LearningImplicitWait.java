package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningImplicitWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * FluentWait wait=new FluentWait(Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.alertIsPresent()); wait.pollingEvery(1,
		 * TimeUnit.SECONDS); wait.ignoring(Exception);
		 */
		
	}

}
