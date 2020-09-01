package pageobjectsLotto;

import common.InvalidApplicationState;
import org.openqa.selenium.WebDriver;

import common.BasePage;

public class HomePage extends BasePage {

    private String loginLink;
    private String loginButton = "//a[text()='Log in']";


    public HomePage(WebDriver driver) throws InvalidApplicationState {
        super(driver);
    }

    @Override
    public Object onValidPage() {
        this.loginLink = "//a[text()='Log in']";
        try {
            return findByXPath(loginLink).isDisplayed();
        } catch (Exception e) {
            return "Home page has not been loaded.";
        }
    }

    public boolean isUserOnAppHomePage() {
        return findByXPath(loginLink).isDisplayed();
    }

    public void clickOnLoginButtons() {
        findByXPath(loginButton).click();
    }

}
