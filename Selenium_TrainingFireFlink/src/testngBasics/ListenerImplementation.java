package testngBasics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime date=LocalDateTime.now();
		String screenshotName=date.toString().replaceAll(":", "-");
		System.out.println(date.toString());
		
		
		TakesScreenshot ts=(TakesScreenshot) Base_Test.driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE); //return type of getScreenshotAs is FILE
		File dest=new File("./Screenshots/"+screenshotName+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
}
