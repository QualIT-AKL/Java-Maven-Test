package pageobjs;

import org.openqa.selenium.WebDriver;

import common.BasePage;

public class HomePage extends BasePage {

    private String loginButton = "//span[contains(text(),'Log in')]";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        findByXPath(loginButton).click();
    }
}
