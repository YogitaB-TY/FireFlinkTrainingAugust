package frameworkTraining;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pomRepository.LoginPage;
import pomRepository.WelcomePage;

public class LoginTest extends Base_Test{
	
	@Test
	public void loginTestCase() {
		
		 WelcomePage welcomePage=new WelcomePage(driver);
		 welcomePage.loginLink.click();
		 LoginPage loginPage=new LoginPage(driver);
		 loginPage.enterEmail("yogbelavanaki@gmail.com");
		 loginPage.passwordTextField.sendKeys("PAssword@123");
		 loginPage.clickLoginButton();
		 
		  if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
		  System.out.println("PASS: User is logged in"); 
		  } else {
			  
		  System.out.println("FAIL: User is not logged in"); }
		 
		
	}

}
