package pageobjs;

import common.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private String phoneEmailfield = "//span[contains(text(),'Phone, email, or username')]";
    private String userNameLoc = "(//input[@name='session[username_or_email]'])[1]";
    private String pWordLoc = "(//input[@name='session[password]'])[1]";
    private String submit = "//div[@data-testid='LoginForm_Login_Button']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginWithCredentials(String username, String password) {
        findByXPath(phoneEmailfield).click();
        findByXPath(userNameLoc).sendKeys(username);
        findByXPath(pWordLoc).sendKeys(password);
        findByXPath(submit).click();
    }
}
