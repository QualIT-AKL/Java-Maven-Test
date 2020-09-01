package pageobjectsLotto;

import common.BasePage;
import common.InvalidApplicationState;
import org.openqa.selenium.WebDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    private String userNameLoc;
    private String pWordLoc = "//input[@id='passwordInput']";
    private String loginButton = "//span[@id='submitButton']";
    private String errorMessage =  "//p[@class ='loginErrMsg']";

    public LoginPage(WebDriver driver) throws InvalidApplicationState {
        super(driver);
    }

    @Override
    public Object onValidPage() {
        this.userNameLoc = "//input[@id='userNameInput']";
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

    public boolean isMessageDisplayed() {
        return findByXPath(errorMessage).isDisplayed();
    }
}
