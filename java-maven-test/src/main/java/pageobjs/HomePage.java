package pageobjs;

import org.openqa.selenium.WebDriver;

import common.BasePage;

public class HomePage extends BasePage {
	private String loginButtonLoc = "(//a[contains(.,'Log in')])[2]";
	private String loginATButton = "//div[@class='desktopView menuDesktop']//a[contains(.,'Log')]";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void goToLoginPage() {
		findByXPath(loginButtonLoc).click();
	}
	
	public void goToLoginPageAT()
	{
		findByXPath(loginATButton).click();
	}
	
}
