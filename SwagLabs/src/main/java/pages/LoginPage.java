package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username_field;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password_field;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login_button;

	public void enterUsernameOnUsernameField(String username) {
		username_field.sendKeys(username);
	}

	public void enterPasswordOnPasswordField(String password) {
		password_field.sendKeys(password);
	}

	public void clickOnLoginButton() {
		login_button.click();
	}

}
