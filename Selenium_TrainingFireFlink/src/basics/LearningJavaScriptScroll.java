package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningJavaScriptScroll {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/bangalore/restaurants");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//scrollBy
		//scrollTo
		//scrollIntoView
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,400);");
		Thread.sleep(2000);
		WebElement trufflesRestaurant=driver.findElement(By.xpath("//h4[text()='Truffles']"));
		js.executeScript("arguments[0].scrollIntoView(false);", trufflesRestaurant);
		//https://www.zomato.com/bangalore/restaurants
	}

}
