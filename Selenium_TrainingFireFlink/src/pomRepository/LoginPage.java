package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}
	
	@FindBy(name = "Password")
	public WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;

	public void clickLoginButton() {
		loginButton.click();
	}
}
