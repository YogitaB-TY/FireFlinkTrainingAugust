package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningActions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computersHeaderLink= driver.findElement(By.partialLinkText("COMPUTERS"));
		Actions actions=new Actions(driver);
		actions.moveToElement(computersHeaderLink).build().perform();
		Thread.sleep(2000);
		WebElement desktopsHeaderLink=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		actions.moveToElement(desktopsHeaderLink).click().build().perform();
		
	}

}
