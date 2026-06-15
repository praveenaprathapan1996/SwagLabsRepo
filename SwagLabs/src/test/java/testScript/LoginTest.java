package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(description = "Validating user login with valid Credentials", groups = { "smoke" })
	public void verifyLoginWithValidUsernameAndPassword() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "Loginpage");
		String password = ExcelUtility.getStringData(0, 1, "Loginpage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
	}

	@Test(description = "Validating User login with invalid password", groups = { "smoke" })
	public void verifyLoginwithValidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String password = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
	}

	@Test
	public void verifyLoginwithInvalidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "Loginpage");
		String password = ExcelUtility.getStringData(2, 1, "Loginpage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
	}

	@Test
	public void verifyLoginwithInvalidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(3, 0, "Loginpage");
		String password = ExcelUtility.getStringData(3, 1, "Loginpage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
	}
}
