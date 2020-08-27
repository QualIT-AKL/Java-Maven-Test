package pageobjs;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TwitterUserHomePage extends BasePage {

    private String profileButton = "//span[contains(text(),'Profile')]";
    private String dashboardProfileNameLoc = "//span[contains(text(),'John Doe')]";
    private String profileID = "(//span[contains(text(), 'John Doe')]//../../../../following-sibling::div//span[contains(text(), '@')])[1]";
    private String logout = "//a[@href='/logout']";
    private String logoutButton = "//span[text()= 'Log out']";

    public TwitterUserHomePage(WebDriver driver) {
        super(driver);
    }

    public String getDashboardProfileName() {

        findByXPath(profileButton).click();
        String profileName = findByXPath(dashboardProfileNameLoc).getText();
        return profileName;
    }

    public String getProfileID() {
        String profileName = findByXPath(profileID).getText();
        return profileName;
    }

    public void logoutTwitter(){
        findByXPath(dashboardProfileNameLoc).click();
        findByXPath(logout).click();
        findByXPath(logoutButton).click();
    }
}
