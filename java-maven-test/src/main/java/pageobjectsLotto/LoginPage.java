package pageobjectsLotto;

import common.BasePage;
import common.InvalidApplicationState;
import org.openqa.selenium.WebDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

	private String userNameLoc;
	private String pWordLoc = "//*[@id='passwordInput']";
	private String loginButton = "//*[@id='submitButton']";
	private String errorMessage = "//p[@class='loginErrMsg']";

	public LoginPage(WebDriver driver) throws InvalidApplicationState {
		super(driver);
	}

	@Override
	public Object onValidPage() {
		this.userNameLoc = "//*[@id='userNameInput']";
		try {
			return findByXPath(userNameLoc).isDisplayed();
		} catch (Exception e) {
			return "User is not in the login page of the application";
		}
	}

	public void loginWithCredentials(String username, String password) {
		sendCharacters(findByXPath(userNameLoc), username);
		sendCharacters(findByXPath(pWordLoc), password);
		findByXPath(loginButton).click();
	}

	/*
	 * this method checks that error message is displayed when user enters invalid
	 * credentials returns true if error message displays returns false if error
	 * messag not displays
	 */
	public Boolean isLoginErrorMessageDisplayed() {
		return findByXPath(errorMessage).isDisplayed();
	}
}
