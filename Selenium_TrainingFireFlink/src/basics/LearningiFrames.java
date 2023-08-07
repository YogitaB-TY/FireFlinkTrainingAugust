package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningiFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/User/Downloads/iframe.html");
		//driver.switchTo().frame("frame2");
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("FR2");
		WebElement frameElement=driver.findElement(By.id("FR2"));
		driver.switchTo().frame(frameElement);
		WebElement facebookAutoCarLink=driver.findElement(By.xpath("(//a[contains(@title,'Facebook')])[1]"));
		facebookAutoCarLink.click();

		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
	}

}
