package frameworkTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base_Test {

public static WebDriver driver;
	
	@Parameters("browserName")
	@BeforeClass
	public void setupBrowser(@Optional("firefox")String browserName) {
		
		/*@Optional is provided so that the parameter has a default value in case no parameters
		are provided in the xml file*/
		
		if(browserName.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  driver=new ChromeDriver(); 
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			  driver=new FirefoxDriver(); 
		}else {
			System.out.println("Give valid browser name");
		}
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
