package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDisabledElementUsingJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.xpath("//a[text()='jdk-8u381-linux-aarch64.rpm']")).click();
		WebElement disabledLink=driver.findElement(By.xpath("//a[text()='Download jdk-8u381-linux-aarch64.rpm']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disabledLink);

	}

}
