package pageobjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;

import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import common.BasePage;

public class LoginPage extends BasePage {

	private String userNameLoc = "(//input[@name='session[username_or_email]'])[2]";
	private String pWordLoc = "(//input[@name='session[password]'])[2]";
	private String rememberMeTickBox = "(//input[@name='remember_me'])[2]";
	private String loginBtnLoc = "(//button[contains(@type,'submit')])[1]";
	private String userNameAT = "//input[@id='userNameInput']";
	private String pwdAT = "//input[@id='passwordInput']";
	private String btn_login = "//*[@id='submitButton']";
	private String lbl_login_err_msg = "//*[@class='loginErrMsg']";

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void loginWithCredentials(String username, String password) {
		WebElement tickBox = findByXPath(rememberMeTickBox);
		findByXPath(userNameLoc).sendKeys(username);
		findByXPath(pWordLoc).sendKeys(password);
		tickBox.click(); // don't remember me
		findByXPath(loginBtnLoc).click();
	}
	
	public void loginWithCredAT(String usr, String pwd)
	{		
		findByXPath(userNameAT).sendKeys(usr);
		findByXPath(pwdAT).sendKeys(pwd);
		findByXPath(btn_login).click();
		
	}
	
	public boolean isErrorMsgDisplayed()
	{
		try		
		{
			FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver);
			fWait.until(ExpectedConditions.elementToBeClickable(By.xpath(lbl_login_err_msg)));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}
