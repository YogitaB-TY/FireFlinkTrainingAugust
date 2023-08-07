package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningAlertsPopUps {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleClickButton).perform();
		Alert alert=driver.switchTo().alert();
		if(alert.getText().contains("double clicked")) {
			System.out.println("PASS");
			System.out.println(alert.getText());
		}
		Thread.sleep(3000);
		alert.accept();
		alert.dismiss();
	}

}
