package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/demo%20(1).html");
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
		//driver.findElement(By.xpath("(//a[text()='Learn more'])[1]")).click();

		driver.findElement(By.xpath("//a[text()='Google']")).click();
		String parentWindow= driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle:windowHandles) {
			driver.switchTo().window(handle);
			if(driver.getTitle().contains("Apple")) {
				//driver.findElement(By.xpath("(//a[text()='Learn more'])[1]")).click();
				driver.close();
			}else if(driver.getCurrentUrl().contains("file:///C:/Users/User/Downloads/demo%20(1).html")) {
				driver.close();
			}
		}
	}
}
