package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningDoubleClick {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleClickButton).perform();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
}
