package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningNotificationPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
	}
}
