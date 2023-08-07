package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningDragAndDrop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement capitalOne= driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		WebElement countryOne= driver.findElement(By.xpath("//div[@id='box102']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(capitalOne, countryOne).perform();
		
		WebElement SeoulCapital=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southKoreaCountry=driver.findElement(By.xpath("//div[@id='box105']"));
		//action.clickAndHold(SeoulCapital).perform();
		//action.release(southKoreaCountry).perform();
		
		action.clickAndHold(SeoulCapital).release(southKoreaCountry).perform();
	}

}
