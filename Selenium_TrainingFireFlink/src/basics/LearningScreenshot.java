package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningScreenshot {

	public static void main(String[] args) {
		LocalDateTime date=LocalDateTime.now();
		String screenshotName=date.toString().replaceAll(":", "-");
		System.out.println(date.toString());
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/maps/dir//Snow+City+Bengaluru+1st+floor,+Snow+city+Fun+World+Complex+Jayamahal+Main+Rd,+opposite+TV+Tower,+J.C.Nagar,+Bengaluru,+Karnataka+560006/@13.0057596,77.5920609,16z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3bae164e98b3c235:0xbb66b50f30bb665b!2m2!1d77.5920609!2d13.0057596?entry=ttu");
		//typecasting from driver to takesscreenshot type
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE); //return type of getScreenshotAs is FILE
		File dest=new File("./Screenshots/"+screenshotName+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
