/**
 * 
 */
package pageobjectsAuckTransport;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.InvalidApplicationState;

/**
 * @author jey.alagumuthu
 *
 */
public class HomePage extends BasePage{
	
    private String loginButton;

    public HomePage(WebDriver driver) throws InvalidApplicationState {
        super(driver);
    }

    @Override
    public Object onValidPage() {
        this.loginButton = "//a[text()='Log in']";
        try {
            return findByXPath(loginButton).isDisplayed();
        } catch (Exception e) {
            return "Home page has not been loaded.";
        }
    }

    public boolean isUserOnAppHomePage() {
        return findByXPath(loginButton).isDisplayed();
    }

    public void clickOnLoginButtons() {
        findByXPath(loginButton).click();
    }

}
