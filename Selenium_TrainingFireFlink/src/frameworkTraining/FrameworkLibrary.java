package frameworkTraining;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;



public class FrameworkLibrary {
	
	public static String screenshotMethod() {
		LocalDateTime date=LocalDateTime.now();
		String screenshotName=date.toString().replaceAll(":", "-");
		System.out.println(date.toString());
		
		String pathName="./Screenshots/"+screenshotName+".png";
		TakesScreenshot ts=(TakesScreenshot) Base_Test.driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE); //return type of getScreenshotAs is FILE
		File dest=new File(pathName);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pathName;
	}

}
