package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@class='close']"))));
		
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
	}

}
