package pageobjectsAT;

import common.BasePage;
import common.InvalidApplicationState;
import org.openqa.selenium.WebDriver;

public class LoggedInUserPage extends BasePage {

    private String errorMessage;

    public LoggedInUserPage(WebDriver driver) throws InvalidApplicationState {
        super(driver);
    }


    @Override
    public Object onValidPage() {
        this.errorMessage = "//div[@id='errorText']/p";
        try {
            return findByXPath(errorMessage).isDisplayed();
        } catch (Exception e) {
            return "User has logged into the application";
        }
    }

    private void clickOnError() {
        findByXPath(errorMessage).click();
    }

    public String getErrorMessage() {
    	clickOnError();
        return findByXPath(errorMessage).getText();
    }

    public boolean isLoginFailed() {
        return findByXPath(errorMessage).isDisplayed();
    }

}
