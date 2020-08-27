package pageobjs;

import org.openqa.selenium.WebDriver;

import common.BasePage;

public class HomePage extends BasePage {

    private String loginButton = "//span[contains(text(),'Log in')]";
    private String pickYourOwnButton = "//button[@id='pickYourOwn']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        findByXPath(loginButton).click();
    }

    public boolean checkHomePageIsDisplayed() {
        return findByXPath(pickYourOwnButton).isDisplayed();
    }

    public void clickOnPickYourOwnButton() {
        findByXPath(pickYourOwnButton).click();
    }
}
